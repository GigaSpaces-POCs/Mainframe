package com.gigaspaces;

import com.j_spaces.core.client.SQLQuery;
import org.openspaces.core.GigaSpace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * @author Denys_Novikov
 * Date: 22.08.2018
 */
public class InitialLoader {

    private static Logger logger = LoggerFactory.getLogger(InitialLoader.class);

    @Autowired
    private GigaSpace gigaspace;

    public void init() throws Exception {

        BanSofT[] banSofTS = gigaspace.readMultiple(createBanSofTQuery());

        // get subscriptions
        String[] customerAcctNums = getCustomerAcctNums(banSofTS);
        String[] origSystemIds = getOrigSystemIds(banSofTS);

        Subscription[] subscriptions = gigaspace.readMultiple(createSubscriptionQuery(customerAcctNums, origSystemIds));

        // get current ban t
        String[] subscriptionOids = getSubscriptionOids(subscriptions);

        CurrentBanT[] currentBanTs = gigaspace.readMultiple(createCurrentBanTQuery(subscriptionOids));

        //do second join (CURRENT_BAT_T with SUBSCRIPTION) on SUBSCRIPTION_OID

        Map<Double, List<CurrentBanT>> mappedCurrentBanTs = new HashMap<>();

        for (CurrentBanT currentBanT : currentBanTs) {
            List<CurrentBanT> currentBanTsById = mappedCurrentBanTs.get(currentBanT.getSpOid());
            if (currentBanTsById == null) {
                currentBanTsById = new ArrayList<>();
            }
            currentBanTsById.add(currentBanT);
            mappedCurrentBanTs.put(currentBanT.getSpOid(), currentBanTsById);
        }

//        code for relation 1-1
//        Map<Double, List<CurrentBanT>> mappedCurrentBanTs = Arrays.stream(currentBanTs)
//                .collect(Collectors.toMap(CurrentBanT::getSpOid, Arrays::asList, (key1, key2) -> {}));

        List<CurrentBanTSubscriptionJoinResult> secondInnerJoinResult = new ArrayList<>();

        for (Subscription subscription : subscriptions) {
            if (mappedCurrentBanTs.containsKey(subscription.getSubscriptionOid())) {

                List<CurrentBanT> currentBanT = mappedCurrentBanTs.get(subscription.getSubscriptionOid());

                currentBanT.forEach(singleValue -> secondInnerJoinResult.add(new CurrentBanTSubscriptionJoinResult(
                        subscription.getSubscriptionOid(),
                        subscription.getCustomerAcctNum(),
                        singleValue.getOrigSystemId(),
                        singleValue.getMan(),
                        singleValue.getBan())));

            }
        }

        // do first join (BAN_SOF_T with SUBSCRIPTION) ON CUSTOMER_ACCT_NUM, ORIG_SYSTEM_ID

        Map<String, List<CurrentBanTSubscriptionJoinResult>> mappedSecondInnerJoinResult = new HashMap<>();
        for (CurrentBanTSubscriptionJoinResult singleResult : secondInnerJoinResult) {
            List<CurrentBanTSubscriptionJoinResult> list = mappedSecondInnerJoinResult.get(singleResult.getCustomerAcctNum());
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(singleResult);
            mappedSecondInnerJoinResult.put(singleResult.getCustomerAcctNum(), list);
        }



//        code for relation 1-1
//        Map<String, CurrentBanTSubscriptionJoinResult> mappedSecondInnerJoinResult = secondInnerJoinResult.stream()
//                .collect(Collectors.toMap(CurrentBanTSubscriptionJoinResult::getCustomerAcctNum, singleResult -> singleResult));


        List<Step1AggregatedPojo> result = new ArrayList<>();
        for (BanSofT banSofT : banSofTS) {
            if (mappedSecondInnerJoinResult.containsKey(banSofT.getCustomerAcctNum())) {

                List<CurrentBanTSubscriptionJoinResult> currentBatTSubscriptions = mappedSecondInnerJoinResult.get(banSofT.getCustomerAcctNum());
                currentBatTSubscriptions.forEach(
                        currentBatTSubscription -> {
                            if (currentBatTSubscription.getOrigSystemId().equals(banSofT.getOrigSystemId())) {
                                result.add(new Step1AggregatedPojo(
                                        banSofT.getCleId(),
                                        banSofT.getCleName(),
                                        currentBatTSubscription.getMan(),
                                        currentBatTSubscription.getBan(),
                                        currentBatTSubscription.getOrigSystemId()
                                ));
                            }
                        }
                );
            }
        }

        // write final aggregated result to space
        gigaspace.writeMultiple(result.toArray());


    }

    private String[] getSubscriptionOids(Subscription[] subscriptions) {
        return Arrays.stream(subscriptions).map(Subscription::getSubscriptionOid).toArray(String[]::new);
    }

    private String[] getCustomerAcctNums(BanSofT[] banSofTs) {
        return Arrays.stream(banSofTs).map(BanSofT::getCustomerAcctNum).toArray(String[]::new);
    }

    private String[] getOrigSystemIds(BanSofT[] banSofTS) {
        return Arrays.stream(banSofTS).map(BanSofT::getOrigSystemId).toArray(String[]::new);
    }


    private SQLQuery<BanSofT> createBanSofTQuery() {
        return new SQLQuery<>(BanSofT.class, "").setProjections("customerAcctNum", "origSystemId", "cleId", "cleName");
    }

    private SQLQuery<Subscription> createSubscriptionQuery(String[] customerAccNum, String[] origSystemId) {
        return new SQLQuery<>(Subscription.class, "customerAcctNum IN (?) AND origSystemId IN (?)")
                .setParameter(1, customerAccNum)
                .setParameter(2, origSystemId)
                .setProjections("customerAcctNum", "origSystemId", "subscriptionOid");


    }

    private SQLQuery<CurrentBanT> createCurrentBanTQuery(String[] subscriptionOids) {
        return new SQLQuery<>(CurrentBanT.class, "spOid IN (?)")
                .setParameter(1, subscriptionOids)
                .setProjections("spOid", "man", "ban", "origSystemId");


    }

    private SQLQuery<AcctSumX> createAcctSumXQuery() {
        return new SQLQuery<>(AcctSumX.class, "").setProjections("acctSumXCompositeId.manBillDate", "acctSumXCompositeId.ban", "man");
    }


    private String printAcctSumX(AcctSumX acctSumX) {
        return "manBillDate " + acctSumX.getAcctSumXCompositeId().getManBillDate() +
                ", ban " + acctSumX.getAcctSumXCompositeId().getBan() +
                ", man " + acctSumX.getMan();
    }
}
