package com.gigaspaces.utils;

import com.gigaspaces.pojos.*;
import com.j_spaces.core.client.SQLQuery;

import java.sql.Date;
import java.util.Set;

/**
 * @author Denys_Novikov
 * Date: 13.09.2018
 */
public class QueryCreator {

    public static SQLQuery<BanSofT> createBanSofTQuery() {
        return new SQLQuery<>(BanSofT.class, "").setProjections("banSofTCompositeId", "cleId", "cleName");
    }

    public static SQLQuery<IntlNameAddress> createIntlNameAddressQueryStep2Join() {
        return new SQLQuery<>(IntlNameAddress.class, "addressCtgyId = '1' AND subRecNbr = '12'")
                .setProjections("intlNameAddressCompositeId", "ban", "billDate", "aban", "cgiName");
    }

    public static SQLQuery<AcctSumT> createAcctSumTQuery(Set<String> mans, Set<String> bans, Set<String> origSystemIds) {
        return new SQLQuery<>(AcctSumT.class, "acctSumTCompositeId.man IN (?) AND acctSumTCompositeId.ban IN (?) AND acctSumTCompositeId.origSystemId IN (?)")
                .setParameter(1, mans)
                .setParameter(2, bans)
                .setParameter(3, origSystemIds)
                .setProjections("acctSumTCompositeId", "invoiceNbr", "billCurr", "regionCd");
    }

    public static SQLQuery<AcctSumT> createAcctSumTQuery(Set<String> mans, Set<Date> manBillDates, Set<String> origSystemIds, Set<String> bans, Set<Date> billDates, Set<String> abans) {
        return new SQLQuery<>(AcctSumT.class, "acctSumTCompositeId.man IN (?) AND acctSumTCompositeId.manBillDate IN (?) AND acctSumTCompositeId.origSystemId IN (?)" +
                "AND acctSumTCompositeId.ban IN (?) AND acctSumTCompositeId.billDate IN (?) AND acctSumTCompositeId.aban IN (?)")
                .setParameter(1, mans)
                .setParameter(2, manBillDates)
                .setParameter(3, origSystemIds)
                .setParameter(4, bans)
                .setParameter(5, billDates)
                .setParameter(6, abans)
                .setProjections("acctSumTCompositeId", "endVz450SeqNbr");
    }

    public static SQLQuery<Vz450Vmt50106T> createVz450Vmt50106TQuery(Set<String> mans, Set<Date> manBillDates, Set<String> origSystemIds) {
        return new SQLQuery<>(Vz450Vmt50106T.class, "vz450Vmt50106TCompositeId.man IN (?) AND vz450Vmt50106TCompositeId.manBillDate IN (?) AND vz450Vmt50106TCompositeId.origSystemId IN (?)")
                .setParameter(1, mans)
                .setParameter(2, manBillDates)
                .setParameter(3, origSystemIds)
                .setProjections("vz450Vmt50106TCompositeId", "custIdDeptCd", "locationId");
    }

    public static SQLQuery<Subscription> createSubscriptionQuery(Set<String> customerAccNum, Set<String> origSystemId) {
        return new SQLQuery<>(Subscription.class, "customerAcctNum IN (?) OR origSystemId IN (?)")
                .setParameter(1, customerAccNum)
                .setParameter(2, origSystemId)
                .setProjections("customerAcctNum", "origSystemId", "subscriptionOid");
    }

    public static SQLQuery<CurrentBanT> createCurrentBanTQuery(Set<Double> subscriptionOids) {
        return new SQLQuery<>(CurrentBanT.class, "spOid IN (?)")
                .setParameter(1, subscriptionOids)
                .setProjections("spOid", "currentBanTCompositeId");
    }

    public static SQLQuery<IntlNameAddress> createIntlNameAddressQueryStep3Join(Set<String> mans, Set<Date> manBillDates, Set<String> origSystemIds, Set<String> bans, Set<Date> billDates, Set<String> abans) {
        return new SQLQuery<>(IntlNameAddress.class, "intlNameAddressCompositeId.man IN (?) AND intlNameAddressCompositeId.manBillDate IN (?) " +
                "AND intlNameAddressCompositeId.origSystemId IN (?) AND ban IN (?) AND billDate IN (?) AND aban IN (?) AND  addressCtgyId = 'X'")
                .setParameter(1, mans)
                .setParameter(2, manBillDates)
                .setParameter(3, origSystemIds)
                .setParameter(4, bans)
                .setParameter(5, billDates)
                .setParameter(6, abans)
                .setProjections("intlNameAddressCompositeId", "ban", "billDate", "aban", "locationId", "acctName",
                        "address1", "address2", "address3", "city", "state", "country", "postalCd", "countryName");
    }

    public static SQLQuery<Vz450Mod079T> createVz450Mod079TQuery(Set<String> mans, Set<Date> manBillDates, Set<String> origSystemIds, Set<String> bans, Set<Date> billDates, Set<String> abans, Set<Integer> vz450SeqNbrs) {
        return new SQLQuery<>(Vz450Mod079T.class, "vz450Mod079TCompositeId.man IN (?) AND vz450Mod079TCompositeId.manBillDate IN (?) " +
                "AND vz450Mod079TCompositeId.origSystemId IN (?) AND ban IN (?) AND billDate IN (?) AND aban IN (?) AND vz450Mod079TCompositeId.vz450SeqNbr IN (?)  " +
                "AND suppDataIdCd = '196'")
                .setParameter(1, mans)
                .setParameter(2, manBillDates)
                .setParameter(3, origSystemIds)
                .setParameter(4, bans)
                .setParameter(5, billDates)
                .setParameter(6, abans)
                .setParameter(7, vz450SeqNbrs)
                .setProjections("vz450Mod079TCompositeId", "ban", "billDate", "aban", "suppDataId");


    }
}
