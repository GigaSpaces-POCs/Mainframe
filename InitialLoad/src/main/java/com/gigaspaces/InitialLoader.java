package com.gigaspaces;

import com.gigaspaces.utils.Pair;
import com.j_spaces.core.client.SQLQuery;
import org.openspaces.core.GigaSpace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
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

        List<Step1AggregatedPojo> result = getStep1AggregatedPojos();
        logger.info("Result size -> " + result.size());
        // write final aggregated result to space
        gigaspace.writeMultiple(result.toArray());


        // step 2 join
        Set<String> mans = getMans(result);
        Set<String> bans = getBans(result);
        Set<String> origSystemIds = getOrigSystemIds(result);

        AcctSumT[] acctSumTs = gigaspace.readMultiple(createAcctSumTQuery(mans, bans, origSystemIds));

        Set<Date> manBillDates = getManBillDates(acctSumTs);
        Set<Date> billDates = getBillDates(acctSumTs);
        Set<String> abans = getAbans(acctSumTs);

        IntlNameAddress[] intlNameAddresses = gigaspace.readMultiple(createIntlNameAddressQuery());

        // map intNameAddress by man
        Map<String, List<IntlNameAddress>> mappedIntlNameAddressesByMan = mapIntlNameAddressesByMan(intlNameAddresses);

        // map acctSumTs by man
        Map<String, List<AcctSumT>> mappedAcctSumTsByMan = mapAcctSumTByMan(acctSumTs);

        Map<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> mappedByMan = new HashMap<>();

        // match acctSumTs to intlNameAddresses by man
        for (Map.Entry<String, List<AcctSumT>> acctSumTEntry : mappedAcctSumTsByMan.entrySet()) {
            List<IntlNameAddress> intlNameAddressesPerMan = new ArrayList<>();
            if (mappedIntlNameAddressesByMan.containsKey(acctSumTEntry.getKey())) {
                intlNameAddressesPerMan = mappedIntlNameAddressesByMan.get(acctSumTEntry.getKey());
            }
            List<AcctSumT> acctSumTPerMan  = acctSumTEntry.getValue();

            Step2AggregatedPojo step2AggregatedPojo = new Step2AggregatedPojo();
            step2AggregatedPojo.setMan(acctSumTEntry.getKey());
            Pair<List<AcctSumT>, List<IntlNameAddress>> oldValue = mappedByMan.put(step2AggregatedPojo, new Pair<>(acctSumTPerMan, intlNameAddressesPerMan));
            if (oldValue != null) {
                acctSumTPerMan.addAll(oldValue.getFirst());
                intlNameAddressesPerMan.addAll(oldValue.getSecond());

                mappedByMan.put(step2AggregatedPojo, new Pair<>(acctSumTPerMan, intlNameAddressesPerMan));
            }
        }


        // match acctSumTs to intlNameAddresses by manBillDate
        Map<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> mappedByManBillDate = new HashMap<>();

        for (Map.Entry<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> step2PojoEntry : mappedByMan.entrySet()) {

            Pair<List<AcctSumT>, List<IntlNameAddress>> mapped = step2PojoEntry.getValue();

            Map<Date, List<AcctSumT>> mappedAcctSumTsByManBillDate = mapAcctSumTByManBillDate(mapped.getFirst());

            Map<Date, List<IntlNameAddress>> mappedIntlNameAddressesByManBillDate = mapIntlNameAddressesByManBillDate(mapped.getSecond());

            for (Map.Entry<Date, List<AcctSumT>> acctSumTEntry : mappedAcctSumTsByManBillDate.entrySet()) {
                List<IntlNameAddress> intlNameAddressesPerManBillDate = new ArrayList<>();
                if (mappedIntlNameAddressesByManBillDate.containsKey(acctSumTEntry.getKey())) {
                    intlNameAddressesPerManBillDate = mappedIntlNameAddressesByManBillDate.get(acctSumTEntry.getKey());
                }
                List<AcctSumT> acctSumTPerManBillDate = acctSumTEntry.getValue();

                Step2AggregatedPojo step2AggregatedPojo = step2PojoEntry.getKey();
                step2AggregatedPojo.setManBillDate(acctSumTEntry.getKey());
                Pair<List<AcctSumT>, List<IntlNameAddress>> oldValue = mappedByManBillDate.put(step2AggregatedPojo, new Pair<>(acctSumTPerManBillDate, intlNameAddressesPerManBillDate));
                if (oldValue != null) {
                    acctSumTPerManBillDate.addAll(oldValue.getFirst());
                    intlNameAddressesPerManBillDate.addAll(oldValue.getSecond());

                    mappedByMan.put(step2AggregatedPojo, new Pair<>(acctSumTPerManBillDate, intlNameAddressesPerManBillDate));
                }
            }
        }

        // match acctSumTs to intlNameAddresses by origSystemId
        Map<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> mappedByOrigSystemId = new HashMap<>();

        for (Map.Entry<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> step2PojoEntry : mappedByManBillDate.entrySet()) {

            Pair<List<AcctSumT>, List<IntlNameAddress>> mapped = step2PojoEntry.getValue();

            Map<String, List<AcctSumT>> mappedAcctSumTsByOrigSystemId = mapAcctSumTByOrigSystemId(mapped.getFirst());

            Map<String, List<IntlNameAddress>> mappedIntlNameAddressesByOrigSystemId = mapIntlNameAddressesByOrigSystemId(mapped.getSecond());

            for (Map.Entry<String, List<AcctSumT>> acctSumTEntry : mappedAcctSumTsByOrigSystemId.entrySet()) {
                List<IntlNameAddress> intlNameAddressesPerOrigSystemId = new ArrayList<>();
                if (mappedIntlNameAddressesByOrigSystemId.containsKey(acctSumTEntry.getKey())) {
                    intlNameAddressesPerOrigSystemId = mappedIntlNameAddressesByOrigSystemId.get(acctSumTEntry.getKey());
                }
                List<AcctSumT> acctSumTPerOrigSystemId = acctSumTEntry.getValue();

                Step2AggregatedPojo step2AggregatedPojo = step2PojoEntry.getKey();
                step2AggregatedPojo.setOrigSystemId(acctSumTEntry.getKey());
                Pair<List<AcctSumT>, List<IntlNameAddress>> oldValue = mappedByOrigSystemId.put(step2AggregatedPojo, new Pair<>(acctSumTPerOrigSystemId, intlNameAddressesPerOrigSystemId));
                if (oldValue != null) {
                    acctSumTPerOrigSystemId.addAll(oldValue.getFirst());
                    intlNameAddressesPerOrigSystemId.addAll(oldValue.getSecond());

                    mappedByOrigSystemId.put(step2AggregatedPojo, new Pair<>(acctSumTPerOrigSystemId, intlNameAddressesPerOrigSystemId));
                }
            }
        }

        // match acctSumTs to intlNameAddresses by ban
        Map<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> mappedByBan = new HashMap<>();

        for (Map.Entry<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> step2PojoEntry : mappedByOrigSystemId.entrySet()) {

            Pair<List<AcctSumT>, List<IntlNameAddress>> mapped = step2PojoEntry.getValue();

            Map<String, List<AcctSumT>> mappedAcctSumTsByBan = mapAcctSumTByBan(mapped.getFirst());

            Map<String, List<IntlNameAddress>> mappedIntlNameAddressesByBan = mapIntlNameAddressesByBan(mapped.getSecond());

            for (Map.Entry<String, List<AcctSumT>> acctSumTEntry : mappedAcctSumTsByBan.entrySet()) {
                List<IntlNameAddress> intlNameAddressesPerBan = new ArrayList<>();
                if (mappedIntlNameAddressesByBan.containsKey(acctSumTEntry.getKey())) {
                    intlNameAddressesPerBan  = mappedIntlNameAddressesByBan.get(acctSumTEntry.getKey());
                }
                List<AcctSumT> acctSumTPerBan = acctSumTEntry.getValue();
                Step2AggregatedPojo step2AggregatedPojo = step2PojoEntry.getKey();
                step2AggregatedPojo.setBan(acctSumTEntry.getKey());
                Pair<List<AcctSumT>, List<IntlNameAddress>> oldValue = mappedByBan.put(step2AggregatedPojo, new Pair<>(acctSumTPerBan, intlNameAddressesPerBan));
                if (oldValue != null) {
                    acctSumTPerBan.addAll(oldValue.getFirst());
                    intlNameAddressesPerBan.addAll(oldValue.getSecond());

                    mappedByMan.put(step2AggregatedPojo, new Pair<>(acctSumTPerBan, intlNameAddressesPerBan));
                }
            }
        }

        // match acctSumTs to intlNameAddresses by billDate
        Map<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> mappedByBillDate = new HashMap<>();

        for (Map.Entry<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> step2PojoEntry : mappedByBan.entrySet()) {

            Pair<List<AcctSumT>, List<IntlNameAddress>> mapped = step2PojoEntry.getValue();

            Map<Date, List<AcctSumT>> mappedAcctSumTsByBillDate = mapAcctSumTByBillDate(mapped.getFirst());

            Map<Date, List<IntlNameAddress>> mappedIntlNameAddressesByBillDate = mapIntlNameAddressesByBillDate(mapped.getSecond());

            for (Map.Entry<Date, List<AcctSumT>> acctSumTEntry : mappedAcctSumTsByBillDate.entrySet()) {
                List<IntlNameAddress> intlNameAddressesPerBillDate = new ArrayList<>();
                if (mappedIntlNameAddressesByBillDate.containsKey(acctSumTEntry.getKey())) {
                    intlNameAddressesPerBillDate = mappedIntlNameAddressesByBillDate.get(acctSumTEntry.getKey());
                }
                List<AcctSumT> acctSumTPerBillDate = acctSumTEntry.getValue();
                Step2AggregatedPojo step2AggregatedPojo = step2PojoEntry.getKey();
                step2AggregatedPojo.setBillDate(acctSumTEntry.getKey());
                Pair<List<AcctSumT>, List<IntlNameAddress>> oldValue = mappedByBillDate.put(step2AggregatedPojo, new Pair<>(acctSumTPerBillDate, intlNameAddressesPerBillDate));
                if (oldValue != null) {
                    acctSumTPerBillDate.addAll(oldValue.getFirst());
                    intlNameAddressesPerBillDate.addAll(oldValue.getSecond());

                    mappedByMan.put(step2AggregatedPojo, new Pair<>(acctSumTPerBillDate, intlNameAddressesPerBillDate));
                }
            }
        }

        // match acctSumTs to intlNameAddresses by aban
        Map<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> mappedByAban = new HashMap<>();

        for (Map.Entry<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> step2PojoEntry : mappedByBillDate.entrySet()) {

            Pair<List<AcctSumT>, List<IntlNameAddress>> mapped = step2PojoEntry.getValue();

            Map<String, List<AcctSumT>> mappedAcctSumTsByAban = mapAcctSumTByAban(mapped.getFirst());

            Map<String, List<IntlNameAddress>> mappedIntlNameAddressesByAban = mapIntlNameAddressesByAban(mapped.getSecond());

            for (Map.Entry<String, List<AcctSumT>> acctSumTEntry : mappedAcctSumTsByAban.entrySet()) {
                List<IntlNameAddress> intlNameAddressesPerAban = new ArrayList<>();
                if (mappedIntlNameAddressesByAban.containsKey(acctSumTEntry.getKey())) {
                    intlNameAddressesPerAban = mappedIntlNameAddressesByAban.get(acctSumTEntry.getKey());
                }
                List<AcctSumT> acctSumTPerAban = acctSumTEntry.getValue();

                Step2AggregatedPojo step2AggregatedPojo = step2PojoEntry.getKey();
                step2AggregatedPojo.setAban(acctSumTEntry.getKey());
                Pair<List<AcctSumT>, List<IntlNameAddress>> oldValue = mappedByAban.put(step2AggregatedPojo, new Pair<>(acctSumTPerAban, intlNameAddressesPerAban));
                if (oldValue != null) {
                    acctSumTPerAban.addAll(oldValue.getFirst());
                    intlNameAddressesPerAban.addAll(oldValue.getSecond());

                    mappedByMan.put(step2AggregatedPojo, new Pair<>(acctSumTPerAban, intlNameAddressesPerAban));
                }
            }
        }

        // fulfill step2pojo
        List<Step2AggregatedPojo> step2joinResult = new ArrayList<>();



        for (Map.Entry<Step2AggregatedPojo, Pair<List<AcctSumT>, List<IntlNameAddress>>> entry : mappedByAban.entrySet()) {

            Step2AggregatedPojo currentPojo = entry.getKey();

            for (AcctSumT acctSumT : entry.getValue().getFirst()) {

                Step2AggregatedPojo resultPojo = new Step2AggregatedPojo(currentPojo);

                resultPojo.setBillCurr(acctSumT.getBillCurr());
                resultPojo.setInvoiceNbr(acctSumT.getInvoiceNbr());
                resultPojo.setRegionCd(acctSumT.getRegionCd());

                for (IntlNameAddress intlNameAddress : entry.getValue().getSecond()) {
                    resultPojo.setCgiName(intlNameAddress.getCgiName());
                }
                step2joinResult.add(resultPojo);
            }
        }

        logger.info("---> Step 2 join result  " + step2joinResult.size());
        gigaspace.writeMultiple(step2joinResult.toArray());
    }

    private Map<String, List<AcctSumT>> mapAcctSumTByAban(List<AcctSumT> acctSumTs) {
        Map<String, List<AcctSumT>> mappedAcctSumTsByAban = new HashMap<>();

        for (AcctSumT acctSumT : acctSumTs) {
            List<AcctSumT> acctSumTByAban = mappedAcctSumTsByAban.get(acctSumT.getAcctSumTCompositeId().getAban());
            if (acctSumTByAban == null) {
                acctSumTByAban = new ArrayList<>();
            }
            acctSumTByAban.add(acctSumT);
            mappedAcctSumTsByAban.put(acctSumT.getAcctSumTCompositeId().getAban(), acctSumTByAban);
        }
        return mappedAcctSumTsByAban;
    }

    private Map<String, List<IntlNameAddress>> mapIntlNameAddressesByAban(List<IntlNameAddress> intlNameAddresses) {
        Map<String, List<IntlNameAddress>> mappedIntlNameAddressesByAban = new HashMap<>();

        for (IntlNameAddress intlNameAddress : intlNameAddresses) {
            List<IntlNameAddress> intlNameAddressByAban = mappedIntlNameAddressesByAban.get(intlNameAddress.getAban());
            if (intlNameAddressByAban == null) {
                intlNameAddressByAban = new ArrayList<>();
            }
            intlNameAddressByAban.add(intlNameAddress);
            mappedIntlNameAddressesByAban.put(intlNameAddress.getAban(), intlNameAddressByAban);
        }
        return mappedIntlNameAddressesByAban;
    }

    private Map<Date, List<IntlNameAddress>> mapIntlNameAddressesByBillDate(List<IntlNameAddress> intlNameAddresses) {
        Map<Date, List<IntlNameAddress>> mappedIntlNameAddressesByBillDate = new HashMap<>();

        for (IntlNameAddress intlNameAddress : intlNameAddresses) {
            List<IntlNameAddress> intlNameAddressByBillDate = mappedIntlNameAddressesByBillDate.get(intlNameAddress.getBillDate());
            if (intlNameAddressByBillDate == null) {
                intlNameAddressByBillDate = new ArrayList<>();
            }
            intlNameAddressByBillDate.add(intlNameAddress);
            mappedIntlNameAddressesByBillDate.put(intlNameAddress.getBillDate(), intlNameAddressByBillDate);
        }
        return mappedIntlNameAddressesByBillDate;
    }

    private Map<Date, List<AcctSumT>> mapAcctSumTByBillDate(List<AcctSumT> acctSumTs) {
        Map<Date, List<AcctSumT>> mappedAcctSumTsByBillDate = new HashMap<>();

        for (AcctSumT acctSumT : acctSumTs) {
            List<AcctSumT> acctSumTByBillDate = mappedAcctSumTsByBillDate.get(acctSumT.getAcctSumTCompositeId().getBillDate());
            if (acctSumTByBillDate == null) {
                acctSumTByBillDate = new ArrayList<>();
            }
            acctSumTByBillDate.add(acctSumT);
            mappedAcctSumTsByBillDate.put(acctSumT.getAcctSumTCompositeId().getBillDate(), acctSumTByBillDate);
        }
        return mappedAcctSumTsByBillDate;
    }

    private Map<String, List<IntlNameAddress>> mapIntlNameAddressesByBan(List<IntlNameAddress> intlNameAddresses) {
        Map<String, List<IntlNameAddress>> mappedIntlNameAddressesByBan = new HashMap<>();

        for (IntlNameAddress intlNameAddress : intlNameAddresses) {
            List<IntlNameAddress> intlNameAddressByBan = mappedIntlNameAddressesByBan.get(intlNameAddress.getBan());
            if (intlNameAddressByBan == null) {
                intlNameAddressByBan = new ArrayList<>();
            }
            intlNameAddressByBan.add(intlNameAddress);
            mappedIntlNameAddressesByBan.put(intlNameAddress.getBan(), intlNameAddressByBan);
        }
        return mappedIntlNameAddressesByBan;
    }

    private Map<String, List<AcctSumT>> mapAcctSumTByBan(List<AcctSumT> acctSumTs) {
        Map<String, List<AcctSumT>> mappedAcctSumTsByBan = new HashMap<>();

        for (AcctSumT acctSumT : acctSumTs) {
            List<AcctSumT> acctSumTByBan = mappedAcctSumTsByBan.get(acctSumT.getAcctSumTCompositeId().getBan());
            if (acctSumTByBan == null) {
                acctSumTByBan = new ArrayList<>();
            }
            acctSumTByBan.add(acctSumT);
            mappedAcctSumTsByBan.put(acctSumT.getAcctSumTCompositeId().getBan(), acctSumTByBan);
        }
        return mappedAcctSumTsByBan;
    }

    private Map<String, List<IntlNameAddress>> mapIntlNameAddressesByOrigSystemId(List<IntlNameAddress> intlNameAddresses) {
        Map<String, List<IntlNameAddress>> mappedIntlNameAddressesByOrigSystemId = new HashMap<>();

        for (IntlNameAddress intlNameAddress : intlNameAddresses) {
            List<IntlNameAddress> intlNameAddressByOrigSystemId = mappedIntlNameAddressesByOrigSystemId.get(intlNameAddress.getIntlNameAddressCompositeId().getOrigSystemId());
            if (intlNameAddressByOrigSystemId == null) {
                intlNameAddressByOrigSystemId = new ArrayList<>();
            }
            intlNameAddressByOrigSystemId.add(intlNameAddress);
            mappedIntlNameAddressesByOrigSystemId.put(intlNameAddress.getIntlNameAddressCompositeId().getOrigSystemId(), intlNameAddressByOrigSystemId);
        }
        return mappedIntlNameAddressesByOrigSystemId;
    }

    private Map<String, List<AcctSumT>> mapAcctSumTByOrigSystemId(List<AcctSumT> acctSumTs) {
        Map<String, List<AcctSumT>> mappedAcctSumTsByOrigSystemId = new HashMap<>();

        for (AcctSumT acctSumT : acctSumTs) {
            List<AcctSumT> acctSumTByOrigSystemId = mappedAcctSumTsByOrigSystemId.get(acctSumT.getAcctSumTCompositeId().getOrigSystemId());
            if (acctSumTByOrigSystemId == null) {
                acctSumTByOrigSystemId = new ArrayList<>();
            }
            acctSumTByOrigSystemId.add(acctSumT);
            mappedAcctSumTsByOrigSystemId.put(acctSumT.getAcctSumTCompositeId().getOrigSystemId(), acctSumTByOrigSystemId);
        }
        return mappedAcctSumTsByOrigSystemId;
    }

    private Map<Date, List<AcctSumT>> mapAcctSumTByManBillDate(List<AcctSumT> acctSumTs) {
        Map<Date, List<AcctSumT>> mappedAcctSumTsByManBillDate = new HashMap<>();

        for (AcctSumT acctSumT : acctSumTs) {
            List<AcctSumT> acctSumTByManBillDate = mappedAcctSumTsByManBillDate.get(acctSumT.getAcctSumTCompositeId().getManBillDate());
            if (acctSumTByManBillDate == null) {
                acctSumTByManBillDate = new ArrayList<>();
            }
            acctSumTByManBillDate.add(acctSumT);
            mappedAcctSumTsByManBillDate.put(acctSumT.getAcctSumTCompositeId().getManBillDate(), acctSumTByManBillDate);
        }
        return mappedAcctSumTsByManBillDate;
    }

    private Map<Date, List<IntlNameAddress>> mapIntlNameAddressesByManBillDate(List<IntlNameAddress> intlNameAddresses) {
        Map<Date, List<IntlNameAddress>> mappedIntlNameAddressesByManBillDate = new HashMap<>();

        for (IntlNameAddress intlNameAddress : intlNameAddresses) {
            List<IntlNameAddress> intlNameAddressByManBillDate = mappedIntlNameAddressesByManBillDate.get(intlNameAddress.getIntlNameAddressCompositeId().getManBillDate());
            if (intlNameAddressByManBillDate == null) {
                intlNameAddressByManBillDate = new ArrayList<>();
            }
            intlNameAddressByManBillDate.add(intlNameAddress);
            mappedIntlNameAddressesByManBillDate.put(intlNameAddress.getIntlNameAddressCompositeId().getManBillDate(), intlNameAddressByManBillDate);
        }
        return mappedIntlNameAddressesByManBillDate;
    }

    private Map<String, List<AcctSumT>> mapAcctSumTByMan(AcctSumT[] acctSumTs) {
        Map<String, List<AcctSumT>> mappedAcctSumTsByMan = new HashMap<>();

        for (AcctSumT acctSumT : acctSumTs) {
            List<AcctSumT> acctSumTByMan = mappedAcctSumTsByMan.get(acctSumT.getAcctSumTCompositeId().getMan());
            if (acctSumTByMan == null) {
                acctSumTByMan = new ArrayList<>();
            }
            acctSumTByMan.add(acctSumT);
            mappedAcctSumTsByMan.put(acctSumT.getAcctSumTCompositeId().getMan(), acctSumTByMan);
        }
        return mappedAcctSumTsByMan;
    }

    private Map<String, List<IntlNameAddress>> mapIntlNameAddressesByMan(IntlNameAddress[] intlNameAddresses) {
        Map<String, List<IntlNameAddress>> mappedIntlNameAddressesByMan = new HashMap<>();

        for (IntlNameAddress intlNameAddress : intlNameAddresses) {
            List<IntlNameAddress> intlNameAddressByMan = mappedIntlNameAddressesByMan.get(intlNameAddress.getIntlNameAddressCompositeId().getMan());
            if (intlNameAddressByMan == null) {
                intlNameAddressByMan = new ArrayList<>();
            }
            intlNameAddressByMan.add(intlNameAddress);
            mappedIntlNameAddressesByMan.put(intlNameAddress.getIntlNameAddressCompositeId().getMan(), intlNameAddressByMan);
        }
        return mappedIntlNameAddressesByMan;
    }

    private SQLQuery<IntlNameAddress> createIntlNameAddressQuery() {
        return new SQLQuery<>(IntlNameAddress.class, "addressCtgyId = '1' AND subRecNbr = '12'")
//                .setParameter(1, mans)
//                .setParameter(2, manBillDates)
//                .setParameter(3, origSystemIds)
//                .setParameter(4, bans)
//                .setParameter(5, billDates)
//                .setParameter(6, abans)
                .setProjections("intlNameAddressCompositeId", "ban", "billDate", "aban", "cgiName");
    }

    private Set<Date> getManBillDates(AcctSumT[] acctSumTS) {
        return Arrays.stream(acctSumTS).map(acctSumT -> acctSumT.getAcctSumTCompositeId().getManBillDate()).collect(Collectors.toSet());
    }

    private Set<Date> getBillDates(AcctSumT[] acctSumTS) {
        return Arrays.stream(acctSumTS).map(acctSumT -> acctSumT.getAcctSumTCompositeId().getBillDate()).collect(Collectors.toSet());
    }

    private Set<String> getAbans(AcctSumT[] acctSumTS) {
        return Arrays.stream(acctSumTS).map(acctSumT -> acctSumT.getAcctSumTCompositeId().getAban()).collect(Collectors.toSet());
    }

    private List<Step1AggregatedPojo> getStep1AggregatedPojos() {
        BanSofT[] banSofTS = gigaspace.readMultiple(createBanSofTQuery());

        // get subscriptions
        Set<String> customerAcctNums = getCustomerAcctNums(banSofTS);
        Set<String> origSystemIds = getOrigSystemIds(banSofTS);

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

//        Map<Double, List<CurrentBanT>> mappedCurrentBanTs = Arrays.stream(currentBanTs)
//                .collect(Collectors.toMap(CurrentBanT::getSpOid, Arrays::asList, (value1, value2) -> Arrays.asList(value1, value2)));

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

        List<Step1AggregatedPojo> result = new ArrayList<>();
        for (BanSofT banSofT : banSofTS) {

            if (mappedSecondInnerJoinResult.containsKey(banSofT.getBanSofTCompositeId().getCustomerAcctNum())) {

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
        return result;
    }

    private Double[] getSubscriptionOids(Subscription[] subscriptions) {
        return Arrays.stream(subscriptions).map(Subscription::getSubscriptionOid).toArray(Double[]::new);
    }

    private Set<String> getCustomerAcctNums(BanSofT[] banSofTs) {
        return Arrays.stream(banSofTs).map(banSofT -> banSofT.getBanSofTCompositeId().getCustomerAcctNum()).collect(Collectors.toSet());
    }

    private Set<String> getOrigSystemIds(BanSofT[] banSofTS) {
        return Arrays.stream(banSofTS).map(banSofT -> banSofT.getBanSofTCompositeId().getOrigSystemId()).collect(Collectors.toSet());
    }

    private Set<String> getMans(List<Step1AggregatedPojo> step1AggregatedPojos) {
        return step1AggregatedPojos.stream().map(Step1AggregatedPojo::getMan).collect(Collectors.toSet());
    }

    private Set<String> getBans(List<Step1AggregatedPojo> step1AggregatedPojos) {
        return step1AggregatedPojos.stream().map(Step1AggregatedPojo::getBan).collect(Collectors.toSet());
    }

    private Set<String> getOrigSystemIds(List<Step1AggregatedPojo> step1AggregatedPojos) {
        return step1AggregatedPojos.stream().map(Step1AggregatedPojo::getOrigSystemId).collect(Collectors.toSet());
    }

    private SQLQuery<BanSofT> createBanSofTQuery() {
        return new SQLQuery<>(BanSofT.class, "").setProjections("banSofTCompositeId", "cleId", "cleName");
    }

    private SQLQuery<AcctSumT> createAcctSumTQuery(Set<String> mans, Set<String> bans, Set<String> origSystemIds) {
        return new SQLQuery<>(AcctSumT.class, "acctSumTCompositeId.man IN (?) AND acctSumTCompositeId.ban IN (?) AND acctSumTCompositeId.origSystemId IN (?)")
                .setParameter(1, mans)
                .setParameter(2, bans)
                .setParameter(3, origSystemIds)
                .setProjections("acctSumTCompositeId", "invoiceNbr", "billCurr", "regionCd");
    }

    private SQLQuery<Subscription> createSubscriptionQuery(Set<String> customerAccNum, Set<String> origSystemId) {

//        Collection<String> customerAccNumCollection = Arrays.stream(customerAccNum).collect(Collectors.toSet());
//        Collection<String> origSystemIdCollection = Arrays.stream(origSystemId).collect(Collectors.toSet());

        return new SQLQuery<>(Subscription.class, "customerAcctNum IN (?) OR origSystemId IN (?)")
                .setParameter(1, customerAccNum)
                .setParameter(2, origSystemId)
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
