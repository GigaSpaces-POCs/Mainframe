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
public class IntlNameAddressCompositeId implements Serializable {

    @Column(name = "MAN")
    private String man;
    @Column(name = "MAN_BILL_DATE")
    private Date manBillDate;
    @Column(name = "ORIG_SYSTEM_ID")
    private String origSystemId;
    @Column(name = "VZ450_SEQ_NBR")
    private Integer vz450SeqNbr;

    public IntlNameAddressCompositeId(){}

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
        IntlNameAddressCompositeId that = (IntlNameAddressCompositeId) o;
        return Objects.equals(man, that.man) &&
                Objects.equals(manBillDate, that.manBillDate) &&
                Objects.equals(origSystemId, that.origSystemId) &&
                Objects.equals(vz450SeqNbr, that.vz450SeqNbr);
    }

    @Override
    public int hashCode() {

        return Objects.hash(man, manBillDate, origSystemId, vz450SeqNbr);
    }

    @Override
    public String toString() {
        return "IntlNameAddressCompositeId{" +
                "man='" + man + '\'' +
                ", manBillDate=" + manBillDate +
                ", origSystemId='" + origSystemId + '\'' +
                ", vz450SeqNbr=" + vz450SeqNbr +
                '}';
    }
}


