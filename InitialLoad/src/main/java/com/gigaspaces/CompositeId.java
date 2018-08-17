package com.gigaspaces;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 17.08.2018
 */
@Embeddable
public class CompositeId implements Serializable {


    private Date MAN_BILL_DATE;

    private String BAN;
//
//    private String ABAN;
//
//    private Date BILL_DATE;
//
//    private String ORIG_SYSTEM_ID;
//
//    private Integer VZ450_SEQ_NBR;

    public CompositeId(){}
//
//    public CompositeId(Date MAN_BILL_DATE, String BAN, String ABAN, Date BILL_DATE, String ORIG_SYSTEM_ID, Integer VZ450_SEQ_NBR) {
//        this.MAN_BILL_DATE = MAN_BILL_DATE;
//        this.BAN = BAN;
//        this.ABAN = ABAN;
//        this.BILL_DATE = BILL_DATE;
//        this.ORIG_SYSTEM_ID = ORIG_SYSTEM_ID;
//        this.VZ450_SEQ_NBR = VZ450_SEQ_NBR;
//    }

    public String getBAN() {
        return BAN;
    }

    public void setBAN(String BAN) {
        this.BAN = BAN;
    }

    public Date getMAN_BILL_DATE() {
        return MAN_BILL_DATE;
    }

    public void setMAN_BILL_DATE(Date MAN_BILL_DATE) {
        this.MAN_BILL_DATE = MAN_BILL_DATE;
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
//        CompositeId that = (CompositeId) o;
//        return Objects.equals(MAN_BILL_DATE, that.MAN_BILL_DATE) &&
//                Objects.equals(BAN, that.BAN) &&
//                Objects.equals(ABAN, that.ABAN) &&
//                Objects.equals(BILL_DATE, that.BILL_DATE) &&
//                Objects.equals(ORIG_SYSTEM_ID, that.ORIG_SYSTEM_ID) &&
//                Objects.equals(VZ450_SEQ_NBR, that.VZ450_SEQ_NBR);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(MAN_BILL_DATE, BAN, ABAN, BILL_DATE, ORIG_SYSTEM_ID, VZ450_SEQ_NBR);
//    }
//
//    @Override
//    public String toString() {
//        return "CompositeId{" +
//                "MAN_BILL_DATE=" + MAN_BILL_DATE +
//                ", BAN='" + BAN + '\'' +
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
        CompositeId that = (CompositeId) o;
        return Objects.equals(MAN_BILL_DATE, that.MAN_BILL_DATE) &&
                Objects.equals(BAN, that.BAN);
    }

    @Override
    public int hashCode() {

        return Objects.hash(MAN_BILL_DATE, BAN);
    }

    @Override
    public String toString() {
        return "CompositeId{" +
                "MAN_BILL_DATE=" + MAN_BILL_DATE +
                ", BAN='" + BAN + '\'' +
                '}';
    }
}


