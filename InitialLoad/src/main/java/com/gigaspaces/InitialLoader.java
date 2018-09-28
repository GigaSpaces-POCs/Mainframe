package com.gigaspaces;

import com.gigaspaces.pojos.*;
import org.openspaces.core.GigaSpace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.math.MathContext;
import java.sql.Date;
import java.util.*;
import java.util.stream.Collectors;

import static com.gigaspaces.utils.Extractors.*;
import static com.gigaspaces.utils.QueryCreator.*;

/**
 * @author Denys_Novikov
 * Date: 22.08.2018
 */
public class InitialLoader {

    private static Logger logger = LoggerFactory.getLogger(InitialLoader.class);

    @Autowired
    private GigaSpace gigaspace;

    public void init() throws Exception {

        List<Step1AggregatedPojo> step1AggregatedPojos = getStep1AggregatedPojos();
        logger.info("Step1 step1AggregatedPojos -> " + step1AggregatedPojos.size());
        gigaspace.writeMultiple(step1AggregatedPojos.toArray());

        List<Step2AggregatedPojo> step2AggregatedPojos = getStep2AggregatedPojos(step1AggregatedPojos);
        logger.info("Step2 step2AggregatedPojos -> " + step2AggregatedPojos.size());
        gigaspace.writeMultiple(step2AggregatedPojos.toArray());

        List<Step3AggregatedPojo> step3AggregatedPojos = getStep3AggregatedPojos(step2AggregatedPojos);
        logger.info("Step3 step3AggregatedPojos -> " + step3AggregatedPojos.size());
        gigaspace.writeMultiple(step3AggregatedPojos.toArray());


        List<Step4AggregatedPojo> step4AggregatedPojos = getStep4AggregatedPojos(step2AggregatedPojos);
        logger.info("Step4 step4AggregatedPojos -> " + step4AggregatedPojos.size());
        gigaspace.writeMultiple(step4AggregatedPojos.toArray());

        List<Step5AggregatedPojo> step5AggregatedPojos = getStep5AggregatedPojos(step2AggregatedPojos);
        logger.info("Step5 step5AggregatedPojos -> " + step5AggregatedPojos.size());
        gigaspace.writeMultiple(step5AggregatedPojos.toArray());

    }

    private List<Step5AggregatedPojo> getStep5AggregatedPojos(List<Step2AggregatedPojo> step2AggregatedPojos) {

        Set<String> mans = getMans(step2AggregatedPojos);
        Set<Date> manBillDates = getManBillDates(step2AggregatedPojos);
        Set<String> origSystemIds = getOrigSystemIds(step2AggregatedPojos);
        Set<String> bans = getBans(step2AggregatedPojos);
        Set<Date> billDates = getBillDates(step2AggregatedPojos);
        Set<String> abans = getAbans(step2AggregatedPojos);

        Vz4506200T[] vz4506200Ts = gigaspace.readMultiple(createVz4506200TQuery());

        List<Vz4506200T> vz4506200TsList = Arrays.stream(vz4506200Ts).filter(vz -> mans.contains(vz.getMan())).filter(vz -> manBillDates.contains(vz.getManBillDate()))
                .filter(vz -> origSystemIds.contains(vz.getOrigSystemId())).filter(vz -> bans.contains(vz.getBan()))
                .filter(vz -> billDates.contains(vz.getBillDate())).filter(vz -> abans.contains(vz.getAban()))
                .filter(vz -> vz.getBalancingInd().equals('0')).filter(vz -> vz.getVz4506200TCompositeId().getGrpId2().equals("205260                   "))
                .collect(Collectors.toList());


        Set<Integer> vz450SeqNbrs = getVz450SeqNbrs(vz4506200TsList);

        Vz450Mod077T[] vz450Mod077Ts = gigaspace.readMultiple(createVz450Mod077TQuery(mans, manBillDates, origSystemIds, bans, billDates, abans, vz450SeqNbrs));

        List<Vz450Mod077T> vz450Mod077TsList = Arrays.stream(vz450Mod077Ts).filter(vz -> mans.contains(vz.getMan())).filter(vz -> manBillDates.contains(vz.getManBillDate()))
                .filter(vz -> origSystemIds.contains(vz.getOrigSystemId())).filter(vz -> bans.contains(vz.getBan()))
                .filter(vz -> billDates.contains(vz.getBillDate())).filter(vz -> abans.contains(vz.getAban()))
                .filter(vz -> vz450SeqNbrs.contains(vz.getVz450SeqNbr()))
                .collect(Collectors.toList());

        List<Vz450Mod077T> filteredS225 = vz450Mod077TsList.stream().filter(item -> item.getSuppDataIdCd() == 225).collect(Collectors.toList());
        List<Vz450Mod077T> filteredS259 = vz450Mod077TsList.stream().filter(item -> item.getSuppDataIdCd() == 259).collect(Collectors.toList());
        List<Vz450Mod077T> filteredS222 = vz450Mod077TsList.stream().filter(item -> item.getSuppDataIdCd() == 222).collect(Collectors.toList());

        Set<Integer> termCntryCdIds = Arrays.stream(vz4506200Ts).map(Vz4506200T::getTermCntryCdId).collect(Collectors.toSet());
        RefCodes95T[] refCodes95Ts = gigaspace.readMultiple(createRefCodes95TQuery(termCntryCdIds));

        Map<Integer, RefCodes95T> mappedRefCodes95T = Arrays.stream(refCodes95Ts).collect(Collectors.toMap(RefCodes95T::getCodeDescKey, refCode -> refCode));


        Map<String, Vz4506200T> mappedVz4506200Ts = Arrays.stream(vz4506200Ts).collect(Collectors.toMap(
                vz4506200T -> vz4506200T.getMan() + vz4506200T.getManBillDate() + vz4506200T.getOrigSystemId()
                        + vz4506200T.getBan() + vz4506200T.getAban() + vz4506200T.getBillDate() + vz4506200T.getVz450SeqNbr(), vz4506200T -> vz4506200T));

        Map<String, Vz450Mod077T> mappedFilteredS225 = filteredS225.stream().collect(Collectors.toMap(
                vz450Mod077T -> vz450Mod077T.getMan() + vz450Mod077T.getManBillDate() + vz450Mod077T.getOrigSystemId()
                        + vz450Mod077T.getBan() + vz450Mod077T.getAban() + vz450Mod077T.getBillDate() + vz450Mod077T.getVz450SeqNbr(), vz450Mod077T -> vz450Mod077T));

        Map<String, Vz450Mod077T> mappedFilteredS259 = filteredS259.stream().collect(Collectors.toMap(
                vz450Mod077T -> vz450Mod077T.getMan() + vz450Mod077T.getManBillDate() + vz450Mod077T.getOrigSystemId()
                        + vz450Mod077T.getBan() + vz450Mod077T.getAban() + vz450Mod077T.getBillDate() + vz450Mod077T.getVz450SeqNbr(), vz450Mod077T -> vz450Mod077T));

        Map<String, Vz450Mod077T> mappedFilteredS222 = filteredS222.stream().collect(Collectors.toMap(
                vz450Mod077T -> vz450Mod077T.getMan() + vz450Mod077T.getManBillDate() + vz450Mod077T.getOrigSystemId()
                        + vz450Mod077T.getBan() + vz450Mod077T.getAban() + vz450Mod077T.getBillDate() + vz450Mod077T.getVz450SeqNbr(), vz450Mod077T -> vz450Mod077T));

        List<Step5AggregatedPojo> step5AggregatedPojos = new ArrayList<>();

        for (Map.Entry<String, Vz4506200T> entry : mappedVz4506200Ts.entrySet()) {
            Vz4506200T vz4506200T = entry.getValue();
            Step5AggregatedPojo step5AggregatedPojo = new Step5AggregatedPojo();

            step5AggregatedPojo.setMan(vz4506200T.getMan());
            step5AggregatedPojo.setManBillDate(vz4506200T.getManBillDate());
            step5AggregatedPojo.setOrigSystemId(vz4506200T.getOrigSystemId());
            step5AggregatedPojo.setBan(vz4506200T.getBan());
            step5AggregatedPojo.setBillDate(vz4506200T.getBillDate());
            step5AggregatedPojo.setAban(vz4506200T.getAban());
            step5AggregatedPojo.setLocationId(vz4506200T.getLocationId());

            step5AggregatedPojo.setAmount(vz4506200T.getChargeAmt() == null ? BigDecimal.ZERO :
                    new BigDecimal(vz4506200T.getChargeAmt(), new MathContext(15)).setScale(5));
            step5AggregatedPojo.setAmount(vz4506200T.getDiscountAmt() == null ? BigDecimal.ZERO :
                    new BigDecimal(vz4506200T.getDiscountAmt(), new MathContext(15)).setScale(5));
            step5AggregatedPojo.setAmount(vz4506200T.getTaxAmt() == null ? BigDecimal.ZERO :
                    new BigDecimal(vz4506200T.getTaxAmt(), new MathContext(15)).setScale(5));

            String mins;

            switch (vz4506200T.getBillableUnitsFmt()) {
                case '1':
                    mins = vz4506200T.getBillableUnits().substring(0, 9) + "." + vz4506200T.getBillableUnits().substring(9, 10);
                    break;
                case '2':
                    mins = vz4506200T.getBillableUnits().substring(0, 8) + "." + vz4506200T.getBillableUnits().substring(8, 10);
                    break;
                case '3':
                    mins = vz4506200T.getBillableUnits().substring(0, 6);
                    break;
                case '4':
                    mins = vz4506200T.getBillableUnits().substring(0, 9);
                    break;
                default:
                    mins = "0";
            }

            step5AggregatedPojo.setMins(mins);
            step5AggregatedPojo.setDestination1(vz4506200T.getTermState());

            if (mappedRefCodes95T.containsKey(vz4506200T.getTermCntryCdId())) {
                step5AggregatedPojo.setDestination2(mappedRefCodes95T.get(vz4506200T.getTermCntryCdId()).getDescription());
            }

            boolean serviceIdAdded = false;
            String joinFieldsAsString = entry.getKey();

            if (mappedFilteredS225.containsKey(joinFieldsAsString)) {

                Vz450Mod077T singleS225 = mappedFilteredS225.get(joinFieldsAsString);

                Step5AggregatedPojo pojoWithS225 = new Step5AggregatedPojo(step5AggregatedPojo);
                pojoWithS225.setServiceId(singleS225.getSuppDataId() != null ? singleS225.getSuppDataId() : "");

                boolean contactSofAdded = false;
                if (mappedFilteredS259.containsKey(joinFieldsAsString)) {
                    Vz450Mod077T singleS259 = mappedFilteredS259.get(joinFieldsAsString);
                    if (singleS259 != null) {
                        Step5AggregatedPojo pojoWithS259 = new Step5AggregatedPojo(pojoWithS225);
                        pojoWithS259.setContractSof(singleS259.getSuppDataId());
                        step5AggregatedPojos.add(pojoWithS259);
                        contactSofAdded = true;
                    }
                } else if (mappedFilteredS222.containsKey(joinFieldsAsString)) {
                    Vz450Mod077T singleS222 = mappedFilteredS259.get(joinFieldsAsString);

                    if (singleS222 != null) {
                        Step5AggregatedPojo pojoWithS222 = new Step5AggregatedPojo(pojoWithS225);
                        pojoWithS222.setContractSof(singleS222.getSuppDataId());
                        step5AggregatedPojos.add(pojoWithS222);
                        contactSofAdded = true;
                    }

                } else {
                    pojoWithS225.setContractSof("");
                }

                if (!contactSofAdded) {
                    step5AggregatedPojos.add(pojoWithS225);
                }

                serviceIdAdded = true;
            }
            if (!serviceIdAdded) {
                step5AggregatedPojos.add(step5AggregatedPojo);
            }

        }


        Map<String, List<Step2AggregatedPojo>> mappedPojo2 = step2AggregatedPojos.stream().collect(Collectors.groupingBy(
                step2AggregatedPojo -> step2AggregatedPojo.getMan() + step2AggregatedPojo.getManBillDate() + step2AggregatedPojo.getOrigSystemId()
                        + step2AggregatedPojo.getBan() + step2AggregatedPojo.getBillDate() + step2AggregatedPojo.getAban()));

        Map<String, List<Step5AggregatedPojo>> mappedPojo5 = step5AggregatedPojos.stream().collect(Collectors.groupingBy(
                step3AggregatedPojo -> step3AggregatedPojo.getMan() + step3AggregatedPojo.getManBillDate() + step3AggregatedPojo.getOrigSystemId()
                        + step3AggregatedPojo.getBan() + step3AggregatedPojo.getBillDate() + step3AggregatedPojo.getAban()));

        for (Map.Entry<String, List<Step5AggregatedPojo>> step5pojoEntry : mappedPojo5.entrySet()) {

            if (mappedPojo2.containsKey(step5pojoEntry.getKey())) {
                for (Step5AggregatedPojo step5AggregatedPojo : step5pojoEntry.getValue()) {
                    for (Step2AggregatedPojo step2AggregatedPojo : mappedPojo2.get(step5pojoEntry.getKey())) {
                        step5AggregatedPojo.setCleId(step2AggregatedPojo.getCleId());
                    }
                }
            }
        }
        return step5AggregatedPojos;
    }

    private List<Step4AggregatedPojo> getStep4AggregatedPojos(List<Step2AggregatedPojo> step2AggregatedPojos) {

        Set<String> mans = getMans(step2AggregatedPojos);
        Set<Date> manBillDates = getManBillDates(step2AggregatedPojos);
        Set<String> origSystemIds = getOrigSystemIds(step2AggregatedPojos);
        Set<String> bans = getBans(step2AggregatedPojos);
        Set<Date> billDates = getBillDates(step2AggregatedPojos);
        Set<String> abans = getAbans(step2AggregatedPojos);

        AcctSumT[] acctSumTs = gigaspace.readMultiple(createAcctSumTQuery(mans, manBillDates, origSystemIds, bans, billDates, abans));
        Vz450Vmt50106T[] vz450Vmt50106Ts = gigaspace.readMultiple(createVz450Vmt50106TQuery(mans, manBillDates, origSystemIds));

        Map<String, List<AcctSumT>> mappedAcctSumTs = Arrays.stream(acctSumTs).collect(Collectors.groupingBy(
                acctSumT -> acctSumT.getMan() + acctSumT.getManBillDate() + acctSumT.getOrigSystemId()));

        Map<String, List<Vz450Vmt50106T>> mappedVz450Vmt50106Ts = Arrays.stream(vz450Vmt50106Ts).collect(Collectors.groupingBy(
                vz450Vmt50106T -> vz450Vmt50106T.getMan() + vz450Vmt50106T.getManBillDate() + vz450Vmt50106T.getOrigSystemId()));

        Set<Step4AggregatedPojo> step4AggregatedPojos = new HashSet<>();

        for (Map.Entry<String, List<AcctSumT>> acctSumTEntry : mappedAcctSumTs.entrySet()) {

            for (AcctSumT acctSumT : acctSumTEntry.getValue()) {

                Step4AggregatedPojo step4AggregatedPojo = new Step4AggregatedPojo();
                step4AggregatedPojo.setMan(acctSumT.getMan());
                step4AggregatedPojo.setManBillDate(acctSumT.getManBillDate());
                step4AggregatedPojo.setOrigSystemId(acctSumT.getOrigSystemId());
                step4AggregatedPojo.setBan(acctSumT.getBan());
                step4AggregatedPojo.setBillDate(acctSumT.getBillDate());
                step4AggregatedPojo.setAban(acctSumT.getAban());

                if (mappedVz450Vmt50106Ts.containsKey(acctSumTEntry.getKey())) {
                    boolean added = false;

                    for (Vz450Vmt50106T vz450Vmt50106T : mappedVz450Vmt50106Ts.get(acctSumTEntry.getKey())) {
                        if (vz450Vmt50106T.getVz450SeqNbr() >= acctSumT.getVz450SeqNbr() &&
                                vz450Vmt50106T.getVz450SeqNbr() <= acctSumT.getEndVz450SeqNbr()) {

                            Step4AggregatedPojo updatedPojo = new Step4AggregatedPojo(step4AggregatedPojo);
                            updatedPojo.setLocationId(vz450Vmt50106T.getCustIdDeptCd());
                            updatedPojo.setLocationInstanceId(vz450Vmt50106T.getLocationId());
                            step4AggregatedPojos.add(updatedPojo);
                            added = true;
                        }
                    }
                    if (!added) {
                        // to support left join, object will be added even w/o match
                        step4AggregatedPojos.add(step4AggregatedPojo);
                    }
                    continue;
                }
                step4AggregatedPojos.add(step4AggregatedPojo);

            }
        }

        Map<String, List<Step2AggregatedPojo>> mappedPojo2 = step2AggregatedPojos.stream().collect(Collectors.groupingBy(
                step2AggregatedPojo -> step2AggregatedPojo.getMan() + step2AggregatedPojo.getManBillDate() + step2AggregatedPojo.getOrigSystemId()
                        + step2AggregatedPojo.getBan() + step2AggregatedPojo.getBillDate() + step2AggregatedPojo.getAban()));

        Map<String, List<Step4AggregatedPojo>> mappedPojo4 = step4AggregatedPojos.stream().collect(Collectors.groupingBy(
                step3AggregatedPojo -> step3AggregatedPojo.getMan() + step3AggregatedPojo.getManBillDate() + step3AggregatedPojo.getOrigSystemId()
                        + step3AggregatedPojo.getBan() + step3AggregatedPojo.getBillDate() + step3AggregatedPojo.getAban()));

        for (Map.Entry<String, List<Step4AggregatedPojo>> step4pojoEntry : mappedPojo4.entrySet()) {

            if (mappedPojo2.containsKey(step4pojoEntry.getKey())) {
                for (Step4AggregatedPojo step4AggregatedPojo : step4pojoEntry.getValue()) {
                    for (Step2AggregatedPojo step2AggregatedPojo : mappedPojo2.get(step4pojoEntry.getKey())) {
                        step4AggregatedPojo.setCleId(step2AggregatedPojo.getCleId());
                    }
                }
            }
        }
        return new ArrayList<>(step4AggregatedPojos);

    }

    private List<Step3AggregatedPojo> getStep3AggregatedPojos(List<Step2AggregatedPojo> step2AggregatedPojos) {
        Set<String> mans = getMans(step2AggregatedPojos);
        Set<Date> manBillDates = getManBillDates(step2AggregatedPojos);
        Set<String> origSystemIds = getOrigSystemIds(step2AggregatedPojos);
        Set<String> bans = getBans(step2AggregatedPojos);
        Set<Date> billDates = getBillDates(step2AggregatedPojos);
        Set<String> abans = getAbans(step2AggregatedPojos);

        IntlNameAddress[] intlNameAddresses = gigaspace.readMultiple(createIntlNameAddressQueryStep3Join(mans, manBillDates, origSystemIds, bans, billDates, abans));

        List<IntlNameAddress> addresses = Arrays.asList(intlNameAddresses);

        Set<String> intlNameAddrMans = getMans(addresses);
        Set<Date> intlNameAddrManBillDates = getManBillDates(addresses);
        Set<String> intlNameAddrOrigSystemIds = getOrigSystemIds(addresses);
        Set<String> intlNameAddrBans = getBans(addresses);
        Set<Date> intlNameAddrBillDates = getBillDates(addresses);
        Set<String> intlNameAddrAbans = getAbans(addresses);
        Set<Integer> intlNameAddrVz450SeqNbrs = getVz450SeqNbrs(addresses);

        Vz450Mod079T[] vz450Mod079Ts = gigaspace.readMultiple(createVz450Mod079TQuery(intlNameAddrMans, intlNameAddrManBillDates, intlNameAddrOrigSystemIds, intlNameAddrBans, intlNameAddrBillDates, intlNameAddrAbans, intlNameAddrVz450SeqNbrs));

        Map<String, List<IntlNameAddress>> mappedIntlNameAddresses = addresses.stream().collect(Collectors.groupingBy(
                intlNameAddress -> intlNameAddress.getMan() + intlNameAddress.getManBillDate() + intlNameAddress.getOrigSystemId() +
                         intlNameAddress.getBan() + intlNameAddress.getAban() + intlNameAddress.getBillDate() + intlNameAddress.getVz450SeqNbr()));

        Map<String, Vz450Mod079T> mappedVz450Mod079Ts = Arrays.stream(vz450Mod079Ts).collect(Collectors.toMap(
                vz450Mod079T -> vz450Mod079T.getMan() + vz450Mod079T.getManBillDate() + vz450Mod079T.getOrigSystemId() +
                        vz450Mod079T.getBan() + vz450Mod079T.getAban() + vz450Mod079T.getBillDate() + vz450Mod079T.getVz450SeqNbr(),
                vz450Mod079T -> vz450Mod079T));



        List<Step3AggregatedPojo> step3AggregatedPojos = new ArrayList<>();

        for (Map.Entry<String, List<IntlNameAddress>> intlNameAddressEntry : mappedIntlNameAddresses.entrySet()) {

            for (IntlNameAddress intlNameAddress : intlNameAddressEntry.getValue()) {

                Step3AggregatedPojo step3AggregatedPojo = new Step3AggregatedPojo();
                step3AggregatedPojo.setMan(intlNameAddress.getMan());
                step3AggregatedPojo.setManBillDate(intlNameAddress.getManBillDate());
                step3AggregatedPojo.setOrigSystemId(intlNameAddress.getOrigSystemId());
                step3AggregatedPojo.setBan(intlNameAddress.getBan());
                step3AggregatedPojo.setBillDate(intlNameAddress.getBillDate());
                step3AggregatedPojo.setAban(intlNameAddress.getAban());
                step3AggregatedPojo.setLocationId(intlNameAddress.getLocationId());
                step3AggregatedPojo.setAcctName(intlNameAddress.getAcctName());
                step3AggregatedPojo.setAddress1(intlNameAddress.getAddress1());
                step3AggregatedPojo.setAddress2(intlNameAddress.getAddress2());
                step3AggregatedPojo.setAddress3(intlNameAddress.getAddress3());
                step3AggregatedPojo.setCity(intlNameAddress.getCity());
                step3AggregatedPojo.setState(intlNameAddress.getState());
                step3AggregatedPojo.setCountry(intlNameAddress.getCountry());
                step3AggregatedPojo.setPostalCd(intlNameAddress.getPostalCd());
                step3AggregatedPojo.setCountryName(intlNameAddress.getCountryName());


                if (mappedVz450Mod079Ts.containsKey(intlNameAddressEntry.getKey())) {
                    step3AggregatedPojo.setLocationInstanceId(mappedVz450Mod079Ts.get(intlNameAddressEntry.getKey()).getSuppDataId());
                }

                step3AggregatedPojos.add(step3AggregatedPojo);
            }
        }

        Map<String, List<Step2AggregatedPojo>> mappedPojo2 = step2AggregatedPojos.stream().collect(Collectors.groupingBy(
                step2AggregatedPojo -> step2AggregatedPojo.getMan() + step2AggregatedPojo.getManBillDate() + step2AggregatedPojo.getOrigSystemId()
                                + step2AggregatedPojo.getBan() + step2AggregatedPojo.getBillDate() + step2AggregatedPojo.getAban()));

        Map<String, List<Step3AggregatedPojo>> mappedPojo3 = step3AggregatedPojos.stream().collect(Collectors.groupingBy(
                step3AggregatedPojo -> step3AggregatedPojo.getMan() + step3AggregatedPojo.getManBillDate() + step3AggregatedPojo.getOrigSystemId()
                        + step3AggregatedPojo.getBan() + step3AggregatedPojo.getBillDate() + step3AggregatedPojo.getAban()));

        for (Map.Entry<String, List<Step3AggregatedPojo>> step3pojoEntry : mappedPojo3.entrySet()) {

            if (mappedPojo2.containsKey(step3pojoEntry.getKey())) {
                for (Step3AggregatedPojo step3AggregatedPojo : step3pojoEntry.getValue()) {
                    for (Step2AggregatedPojo step2AggregatedPojo : mappedPojo2.get(step3pojoEntry.getKey())) {
                        step3AggregatedPojo.setCleId(step2AggregatedPojo.getCleId());
                    }
                }
            }
        }

        return step3AggregatedPojos;

    }

    private List<Step2AggregatedPojo> getStep2AggregatedPojos(List<Step1AggregatedPojo> step1AggregatedPojos) {
        Set<String> mans = getMans(step1AggregatedPojos);
        Set<String> bans = getBans(step1AggregatedPojos);
        Set<String> origSystemIds = getOrigSystemIds(step1AggregatedPojos);

        AcctSumT[] acctSumTs = gigaspace.readMultiple(createAcctSumTQuery(mans, bans, origSystemIds));

        IntlNameAddress[] intlNameAddresses = gigaspace.readMultiple(createIntlNameAddressQueryStep2Join());

        Map<String, List<AcctSumT>> mappedAcctSumTs = Arrays.stream(acctSumTs).collect(Collectors.groupingBy(
                acctSumT -> acctSumT.getMan() + acctSumT.getManBillDate() + acctSumT.getOrigSystemId()
                        + acctSumT.getBan() + acctSumT.getBillDate() + acctSumT.getAban()));


        Map<String, List<IntlNameAddress>> mappedIntlNameAddresses = Arrays.stream(intlNameAddresses).collect(Collectors.groupingBy(
                intlNameAddress -> intlNameAddress.getMan() + intlNameAddress.getManBillDate() + intlNameAddress.getOrigSystemId()
                        + intlNameAddress.getBan() + intlNameAddress.getBillDate() + intlNameAddress.getAban()));


        List<Step2AggregatedPojo> step2AggregatedPojos = new ArrayList<>();
        for (Map.Entry<String, List<AcctSumT>> acctSumTEntry : mappedAcctSumTs.entrySet()) {

            for (AcctSumT acctSumT : acctSumTEntry.getValue()) {

                Step2AggregatedPojo step2AggregatedPojo = new Step2AggregatedPojo();
                step2AggregatedPojo.setMan(acctSumT.getMan());
                step2AggregatedPojo.setManBillDate(acctSumT.getManBillDate());
                step2AggregatedPojo.setOrigSystemId(acctSumT.getOrigSystemId());
                step2AggregatedPojo.setBan(acctSumT.getBan());
                step2AggregatedPojo.setBillDate(acctSumT.getBillDate());
                step2AggregatedPojo.setAban(acctSumT.getAban());
                step2AggregatedPojo.setInvoiceNbr(acctSumT.getInvoiceNbr());
                step2AggregatedPojo.setRegionCd(acctSumT.getRegionCd());
                step2AggregatedPojo.setCurrencyCode(acctSumT.getBillCurr());

                if (mappedIntlNameAddresses.containsKey(acctSumTEntry.getKey())) {
                    for (IntlNameAddress intlNameAddress : mappedIntlNameAddresses.get(acctSumTEntry.getKey())) {
                        step2AggregatedPojo.setCgiName(intlNameAddress.getCgiName());
                        step2AggregatedPojos.add(step2AggregatedPojo);
                    }
                    continue;
                }
                step2AggregatedPojos.add(step2AggregatedPojo);
            }
        }

        // move cleId from step1pojo to step2pojo

        Map<String, Step1AggregatedPojo> mappedPojo1 = step1AggregatedPojos.stream().collect(
                Collectors.toMap(step1AggregatedPojo -> step1AggregatedPojo.getMan() + step1AggregatedPojo.getBan() + step1AggregatedPojo.getOrigSystemId(),
                        step1AggregatedPojo -> step1AggregatedPojo));

        Map<String, List<Step2AggregatedPojo>> mappedPojo2 = step2AggregatedPojos.stream().collect(Collectors.groupingBy(
                step2AggregatedPojo -> step2AggregatedPojo.getMan() + step2AggregatedPojo.getBan() + step2AggregatedPojo.getOrigSystemId()));

        List<Step2AggregatedPojo> step2result = new ArrayList<>();
        for (Map.Entry<String, List<Step2AggregatedPojo>> step2entry : mappedPojo2.entrySet()) {
            if (mappedPojo1.containsKey(step2entry.getKey())) {
                List<Step2AggregatedPojo> values = step2entry.getValue();
                values.forEach(value -> value.setCleId(mappedPojo1.get(step2entry.getKey()).getCleId()));
                step2result.addAll(values);
            }
        }

        return step2result;
    }

    private List<Step1AggregatedPojo> getStep1AggregatedPojos() {
        BanSofT[] banSofTS = gigaspace.readMultiple(createBanSofTQuery());

        // get subscriptions
        Set<String> customerAcctNums = getCustomerAcctNums(banSofTS);
        Set<String> origSystemIds = getOrigSystemIds(Arrays.asList(banSofTS));

        Subscription[] subscriptions = gigaspace.readMultiple(createSubscriptionQuery(customerAcctNums, origSystemIds));

        // get current ban t
        Set<Double> subscriptionOids = getSubscriptionOids(subscriptions);

        CurrentBanT[] currentBanTs = gigaspace.readMultiple(createCurrentBanTQuery(subscriptionOids));

        //do second join (CURRENT_BAT_T with SUBSCRIPTION) on SUBSCRIPTION_OID
        Map<Double, List<CurrentBanT>> mappedCurrentBanTs = Arrays.stream(currentBanTs).collect(Collectors.groupingBy(CurrentBanT::getSpOid));

        List<CurrentBanTSubscriptionJoinResult> secondInnerJoinResult = new ArrayList<>();

        for (Subscription subscription : subscriptions) {
            if (mappedCurrentBanTs.containsKey(subscription.getSubscriptionOid())) {

                List<CurrentBanT> currentBanT = mappedCurrentBanTs.get(subscription.getSubscriptionOid());

                currentBanT.forEach(singleValue -> secondInnerJoinResult.add(new CurrentBanTSubscriptionJoinResult(
                        subscription.getCustomerAcctNum(),
                        singleValue.getCurrentBanTCompositeId().getOrigSystemId(),
                        singleValue.getCurrentBanTCompositeId().getMan(),
                        singleValue.getCurrentBanTCompositeId().getBan())));

            }
        }
//         do first join (BAN_SOF_T with SUBSCRIPTION) ON CUSTOMER_ACCT_NUM, ORIG_SYSTEM_ID
        Map<String, List<CurrentBanTSubscriptionJoinResult>> mappedSecondInnerJoinResult = secondInnerJoinResult.stream()
                .collect(Collectors.groupingBy(CurrentBanTSubscriptionJoinResult::getCustomerAcctNum));

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

    private Set<Double> getSubscriptionOids(Subscription[] subscriptions) {
        return Arrays.stream(subscriptions).map(Subscription::getSubscriptionOid).collect(Collectors.toSet());
    }

}
