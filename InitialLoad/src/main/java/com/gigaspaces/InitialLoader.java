package com.gigaspaces;

import com.j_spaces.core.client.SQLQuery;
import org.openspaces.core.GigaSpace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

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
        Double[] subscriptionOids = getSubscriptionOids(subscriptions);

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
//                .collect(Collectors.toMap(CurrentBanT::getSpOid, Arrays::asList, (value1, value2) -> Arrays.asList(value1, value2)));


        logger.info("--> mappedCurrentBanTs " + mappedCurrentBanTs.size());


        List<CurrentBanTSubscriptionJoinResult> secondInnerJoinResult = new ArrayList<>();

        for (Subscription subscription : subscriptions) {
            if (mappedCurrentBanTs.containsKey(subscription.getSubscriptionOid())) {

                List<CurrentBanT> currentBanT = mappedCurrentBanTs.get(subscription.getSubscriptionOid());

                currentBanT.forEach(singleValue -> secondInnerJoinResult.add(new CurrentBanTSubscriptionJoinResult(
                        subscription.getSubscriptionOid(),
                        subscription.getCustomerAcctNum(),
                        singleValue.getCurrentBanTCompositeId().getOrigSystemId(),
                        singleValue.getCurrentBanTCompositeId().getMan(),
                        singleValue.getCurrentBanTCompositeId().getBan())));

            }
        }
        logger.info("--> secondInnerJoinResult " + secondInnerJoinResult.size());
//         do first join (BAN_SOF_T with SUBSCRIPTION) ON CUSTOMER_ACCT_NUM, ORIG_SYSTEM_ID

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

        logger.info("--> mappedSecondInnerJoinResult " + mappedSecondInnerJoinResult.size());

        List<Step1AggregatedPojo> result = new ArrayList<>();
        for (BanSofT banSofT : banSofTS) {

            if (mappedSecondInnerJoinResult.containsKey(banSofT.getBanSofTCompositeId().getCustomerAcctNum())) {

//                logger.info("--->Contains " + banSofT.getBanSofTCompositeId().getCustomerAcctNum());
                List<CurrentBanTSubscriptionJoinResult> currentBatTSubscriptions = mappedSecondInnerJoinResult.get(banSofT.getBanSofTCompositeId().getCustomerAcctNum());
                currentBatTSubscriptions.forEach(
                        currentBatTSubscription -> {
                            if (currentBatTSubscription.getOrigSystemId().equals(banSofT.getBanSofTCompositeId().getOrigSystemId())) {
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



        logger.info("Result size -> " + result.size());
        // write final aggregated result to space
        gigaspace.writeMultiple(result.toArray());


    }

    private Double[] getSubscriptionOids(Subscription[] subscriptions) {
        return Arrays.stream(subscriptions).map(Subscription::getSubscriptionOid).toArray(Double[]::new);
    }

    private String[] getCustomerAcctNums(BanSofT[] banSofTs) {
        return Arrays.stream(banSofTs).map(banSofT -> banSofT.getBanSofTCompositeId().getCustomerAcctNum()).toArray(String[]::new);
    }

    private String[] getOrigSystemIds(BanSofT[] banSofTS) {
        return Arrays.stream(banSofTS).map(banSofT -> banSofT.getBanSofTCompositeId().getOrigSystemId()).toArray(String[]::new);
    }


    private SQLQuery<BanSofT> createBanSofTQuery() {
        return new SQLQuery<>(BanSofT.class, "").setProjections("banSofTCompositeId", "cleId", "cleName");
    }

    private SQLQuery<Subscription> createSubscriptionQuery(String[] customerAccNum, String[] origSystemId) {

        Collection<String> customerAccNumCollection = Arrays.stream(customerAccNum).collect(Collectors.toSet());
        Collection<String> origSystemIdCollection = Arrays.stream(origSystemId).collect(Collectors.toSet());

        return new SQLQuery<>(Subscription.class, "customerAcctNum IN (?) OR origSystemId IN (?)")
                .setParameter(1, customerAccNumCollection)
                .setParameter(2, origSystemIdCollection)
                .setProjections("customerAcctNum", "origSystemId", "subscriptionOid");


    }

    private SQLQuery<CurrentBanT> createCurrentBanTQuery(Double[] subscriptionOids) {
        return new SQLQuery<>(CurrentBanT.class, "spOid IN (?)")
                .setParameter(1, subscriptionOids)
                .setProjections("spOid", "currentBanTCompositeId");


    }

    private SQLQuery<AcctSumT> createAcctSumXQuery() {
        return new SQLQuery<>(AcctSumT.class, "").setProjections("acctSumXCompositeId.manBillDate", "acctSumXCompositeId.ban", "man");
    }


    private String printAcctSumX(AcctSumT acctSumT) {
        return "manBillDate " + acctSumT.getAcctSumTCompositeId().getManBillDate() +
                ", ban " + acctSumT.getAcctSumTCompositeId().getBan() +
                ", man " + acctSumT.getAcctSumTCompositeId().getMan();
    }
}
