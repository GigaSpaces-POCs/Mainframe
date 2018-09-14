package com.gigaspaces.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 05.09.2018
 */
@Embeddable
public class Vz450Vmt50106TCompositeId implements Serializable {

    @Column(name = "MAN")
    private String man;
    @Column(name = "MAN_BILL_DATE")
    private Date manBillDate;
    @Column(name = "ORIG_SYSTEM_ID")
    private String origSystemId;
    @Column(name = "VZ450_BASE_REC_SEQ")
    private Integer vz450BaseRecSeq;
    @Column(name = "VZ450_SEQ_NBR")
    private Integer vz450SeqNbr;
    @Column(name = "DUP_NUM")
    private Integer dupNum;


    public Vz450Vmt50106TCompositeId() {
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public Date getManBillDate() {
        return manBillDate;
    }

    public void setManBillDate(Date manBillDate) {
        this.manBillDate = manBillDate;
    }

    public String getOrigSystemId() {
        return origSystemId;
    }

    public void setOrigSystemId(String origSystemId) {
        this.origSystemId = origSystemId;
    }

    public Integer getVz450BaseRecSeq() {
        return vz450BaseRecSeq;
    }

    public void setVz450BaseRecSeq(Integer vz450BaseRecSeq) {
        this.vz450BaseRecSeq = vz450BaseRecSeq;
    }

    public Integer getVz450SeqNbr() {
        return vz450SeqNbr;
    }

    public void setVz450SeqNbr(Integer vz450SeqNbr) {
        this.vz450SeqNbr = vz450SeqNbr;
    }

    public Integer getDupNum() {
        return dupNum;
    }

    public void setDupNum(Integer dupNum) {
        this.dupNum = dupNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vz450Vmt50106TCompositeId that = (Vz450Vmt50106TCompositeId) o;
        return Objects.equals(man, that.man) &&
                Objects.equals(manBillDate, that.manBillDate) &&
                Objects.equals(origSystemId, that.origSystemId) &&
                Objects.equals(vz450BaseRecSeq, that.vz450BaseRecSeq) &&
                Objects.equals(vz450SeqNbr, that.vz450SeqNbr) &&
                Objects.equals(dupNum, that.dupNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(man, manBillDate, origSystemId, vz450BaseRecSeq, vz450SeqNbr, dupNum);
    }

    @Override
    public String toString() {
        return "Vz450Vmt50106TCompositeId{" +
                "man='" + man + '\'' +
                ", manBillDate=" + manBillDate +
                ", origSystemId='" + origSystemId + '\'' +
                ", vz450BaseRecSeq=" + vz450BaseRecSeq +
                ", vz450SeqNbr=" + vz450SeqNbr +
                ", dupNum=" + dupNum +
                '}';
    }
}
