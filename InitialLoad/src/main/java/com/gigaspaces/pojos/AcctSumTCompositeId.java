package com.gigaspaces.pojos;

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
public class AcctSumTCompositeId implements Serializable {


    @Column(name = "MAN")
    private String man;
    @Column(name = "MAN_BILL_DATE")
    private Date manBillDate;
    @Column(name = "BAN")
    private String ban;
    @Column(name = "ABAN")
    private String aban;
    @Column(name = "BILL_DATE")
    private Date billDate;
    @Column(name = "ORIG_SYSTEM_ID")
    private String origSystemId;
    @Column(name = "VZ450_SEQ_NBR")
    private Integer vz450SeqNbr;

    public AcctSumTCompositeId() {
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

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

    public String getAban() {
        return aban;
    }

    public void setAban(String aban) {
        this.aban = aban;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getOrigSystemId() {
        return origSystemId;
    }

    public void setOrigSystemId(String origSystemId) {
        this.origSystemId = origSystemId;
    }

    public Integer getVz450SeqNbr() {
        return vz450SeqNbr;
    }

    public void setVz450SeqNbr(Integer vz450SeqNbr) {
        this.vz450SeqNbr = vz450SeqNbr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcctSumTCompositeId that = (AcctSumTCompositeId) o;
        return Objects.equals(man, that.man) &&
                Objects.equals(manBillDate, that.manBillDate) &&
                Objects.equals(ban, that.ban) &&
                Objects.equals(aban, that.aban) &&
                Objects.equals(billDate, that.billDate) &&
                Objects.equals(origSystemId, that.origSystemId) &&
                Objects.equals(vz450SeqNbr, that.vz450SeqNbr);
    }

    @Override
    public int hashCode() {

        return Objects.hash(man, manBillDate, ban, aban, billDate, origSystemId, vz450SeqNbr);
    }

    @Override
    public String toString() {
        return "AcctSumTCompositeId{" +
                "man='" + man + '\'' +
                ", manBillDate=" + manBillDate +
                ", ban='" + ban + '\'' +
                ", aban='" + aban + '\'' +
                ", billDate=" + billDate +
                ", origSystemId='" + origSystemId + '\'' +
                ", vz450SeqNbr=" + vz450SeqNbr +
                '}';
    }
}


