package com.gigaspaces;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.interfaces.*;

import java.sql.Date;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 10.09.2018
 */
@SpaceClass
public class Step2AggregatedPojo implements HasMan, HasBan, HasOrigSystemId, HasManBillDate, HasAban, HasBillDate {

    private String id;
    private String man;
    private Date manBillDate;
    private String ban;
    private String aban;
    private Date billDate;
    private String origSystemId;
    private Integer vz450SeqNbr;
    private String invoiceNbr;
    private String currencyCode;
    private String regionCd;
    private String cgiName;
    private String cleId;

    public Step2AggregatedPojo() {
    }

    public Step2AggregatedPojo(Step2AggregatedPojo source) {
        this.man = source.getMan();
        this.manBillDate = source.getManBillDate();
        this.ban = source.getBan();
        this.aban = source.getAban();
        this.billDate = source.getBillDate();
        this.origSystemId = source.getOrigSystemId();
        this.vz450SeqNbr = source.getVz450SeqNbr();
        this.invoiceNbr = source.getInvoiceNbr();
        this.currencyCode = source.getCurrencyCode();
        this.regionCd = source.getRegionCd();
        this.cgiName = source.getCgiName();
        this.cleId = source.getCleId();
    }


    public Step2AggregatedPojo(String man, Date manBillDate, String ban, String aban, Date billDate, String origSystemId, Integer vz450SeqNbr, String invoiceNbr, String currencyCode, String regionCd, String cgiName, String cleId) {
        this.man = man;
        this.manBillDate = manBillDate;
        this.ban = ban;
        this.aban = aban;
        this.billDate = billDate;
        this.origSystemId = origSystemId;
        this.vz450SeqNbr = vz450SeqNbr;
        this.invoiceNbr = invoiceNbr;
        this.currencyCode = currencyCode;
        this.regionCd = regionCd;
        this.cgiName = cgiName;
        this.cleId = cleId;
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

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
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

    public String getInvoiceNbr() {
        return invoiceNbr;
    }

    public void setInvoiceNbr(String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getRegionCd() {
        return regionCd;
    }

    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    public String getCgiName() {
        return cgiName;
    }

    public void setCgiName(String cgiName) {
        this.cgiName = cgiName;
    }

    public String getCleId() {
        return cleId;
    }

    public void setCleId(String cleId) {
        this.cleId = cleId;
    }

    @SpaceId(autoGenerate = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Step2AggregatedPojo that = (Step2AggregatedPojo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(man, that.man) &&
                Objects.equals(manBillDate, that.manBillDate) &&
                Objects.equals(ban, that.ban) &&
                Objects.equals(aban, that.aban) &&
                Objects.equals(billDate, that.billDate) &&
                Objects.equals(origSystemId, that.origSystemId) &&
                Objects.equals(vz450SeqNbr, that.vz450SeqNbr) &&
                Objects.equals(invoiceNbr, that.invoiceNbr) &&
                Objects.equals(currencyCode, that.currencyCode) &&
                Objects.equals(regionCd, that.regionCd) &&
                Objects.equals(cgiName, that.cgiName) &&
                Objects.equals(cleId, that.cleId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, man, manBillDate, ban, aban, billDate, origSystemId, vz450SeqNbr, invoiceNbr, currencyCode, regionCd, cgiName, cleId);
    }

    @Override
    public String toString() {
        return "Step2AggregatedPojo{" +
                "id='" + id + '\'' +
                ", man='" + man + '\'' +
                ", manBillDate=" + manBillDate +
                ", ban='" + ban + '\'' +
                ", aban='" + aban + '\'' +
                ", billDate=" + billDate +
                ", origSystemId='" + origSystemId + '\'' +
                ", vz450SeqNbr=" + vz450SeqNbr +
                ", invoiceNbr='" + invoiceNbr + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", regionCd='" + regionCd + '\'' +
                ", cgiName='" + cgiName + '\'' +
                ", cleId='" + cleId + '\'' +
                '}';
    }
}
