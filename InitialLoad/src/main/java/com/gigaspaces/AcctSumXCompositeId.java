package com.gigaspaces;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 17.08.2018
 */
@Embeddable
public class AcctSumXCompositeId implements Serializable {

    @Column(name = "MAN_BILL_DATE")
    private Date manBillDate;

    @Column(name = "BAN")
    private String ban;
//
//    private String ABAN;
//
//    private Date BILL_DATE;
//
//    private String ORIG_SYSTEM_ID;
//
//    private Integer VZ450_SEQ_NBR;

    public AcctSumXCompositeId(){}

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public Date getManBillDate() {
        return manBillDate;
    }

    public void setManBillDate(Date manBillDate) {
        this.manBillDate = manBillDate;
    }
//
//    public Date getBILL_DATE() {
//        return BILL_DATE;
//    }
//
//    public void setBILL_DATE(Date BILL_DATE) {
//        this.BILL_DATE = BILL_DATE;
//    }
//
//    public String getABAN() {
//        return ABAN;
//    }
//
//    public void setABAN(String ABAN) {
//        this.ABAN = ABAN;
//    }
//
//    public String getORIG_SYSTEM_ID() {
//        return ORIG_SYSTEM_ID;
//    }
//
//    public void setORIG_SYSTEM_ID(String ORIG_SYSTEM_ID) {
//        this.ORIG_SYSTEM_ID = ORIG_SYSTEM_ID;
//    }
//
//    public Integer getVZ450_SEQ_NBR() {
//        return VZ450_SEQ_NBR;
//    }
//
//    public void setVZ450_SEQ_NBR(Integer VZ450_SEQ_NBR) {
//        this.VZ450_SEQ_NBR = VZ450_SEQ_NBR;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        AcctSumXCompositeId that = (AcctSumXCompositeId) o;
//        return Objects.equals(manBillDate, that.manBillDate) &&
//                Objects.equals(ban, that.ban) &&
//                Objects.equals(ABAN, that.ABAN) &&
//                Objects.equals(BILL_DATE, that.BILL_DATE) &&
//                Objects.equals(ORIG_SYSTEM_ID, that.ORIG_SYSTEM_ID) &&
//                Objects.equals(VZ450_SEQ_NBR, that.VZ450_SEQ_NBR);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(manBillDate, ban, ABAN, BILL_DATE, ORIG_SYSTEM_ID, VZ450_SEQ_NBR);
//    }
//
//    @Override
//    public String toString() {
//        return "AcctSumXCompositeId{" +
//                "manBillDate=" + manBillDate +
//                ", ban='" + ban + '\'' +
//                ", ABAN='" + ABAN + '\'' +
//                ", BILL_DATE=" + BILL_DATE +
//                ", ORIG_SYSTEM_ID='" + ORIG_SYSTEM_ID + '\'' +
//                ", VZ450_SEQ_NBR=" + VZ450_SEQ_NBR +
//                '}';
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcctSumXCompositeId that = (AcctSumXCompositeId) o;
        return Objects.equals(manBillDate, that.manBillDate) &&
                Objects.equals(ban, that.ban);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manBillDate, ban);
    }

    @Override
    public String toString() {
        return "AcctSumXCompositeId{" +
                "manBillDate=" + manBillDate +
                ", ban='" + ban + '\'' +
                '}';
    }
}


