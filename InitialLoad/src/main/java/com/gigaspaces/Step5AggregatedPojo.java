package com.gigaspaces;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.interfaces.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 24.09.2018
 */
@SpaceClass
public class Step5AggregatedPojo implements HasMan, HasBan, HasOrigSystemId, HasManBillDate, HasAban, HasBillDate {

    private String id;
    private String man;
    private Date manBillDate;
    private String origSystemId;
    private String ban;
    private Date billDate;
    private String aban;
    private String locationId;
    private BigDecimal amount;
    private Double discPromos;
    private Double taxesSurchgs;
    private String serviceId;
    private String contractSof;
    private String mins;
    private String destination1;
    private String destination2;
    private String cleId;

    public Step5AggregatedPojo() {
    }

    public Step5AggregatedPojo(Step5AggregatedPojo source) {
        this.man = source.getMan();
        this.manBillDate = source.getManBillDate();
        this.origSystemId = source.getOrigSystemId();
        this.ban = source.getBan();
        this.billDate = source.getBillDate();
        this.aban = source.getAban();
        this.locationId = source.getLocationId();
        this.amount = source.getAmount();
        this.discPromos = source.getDiscPromos();
        this.taxesSurchgs = source.getTaxesSurchgs();
        this.serviceId = source.getServiceId();
        this.contractSof = source.getContractSof();
        this.mins = source.getMins();
        this.destination1 = source.getDestination1();
        this.destination2 = source.getDestination2();
        this.cleId = source.getCleId();
    }

    public Step5AggregatedPojo(String id, String man, Date manBillDate, String origSystemId, String ban, Date billDate, String aban, String locationId, BigDecimal amount, Double discPromos, Double taxesSurchgs, String serviceId, String contractSof, String mins, String destination1, String destination2, String cleId) {
        this.id = id;
        this.man = man;
        this.manBillDate = manBillDate;
        this.origSystemId = origSystemId;
        this.ban = ban;
        this.billDate = billDate;
        this.aban = aban;
        this.locationId = locationId;
        this.amount = amount;
        this.discPromos = discPromos;
        this.taxesSurchgs = taxesSurchgs;
        this.serviceId = serviceId;
        this.contractSof = contractSof;
        this.mins = mins;
        this.destination1 = destination1;
        this.destination2 = destination2;
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

    @SpaceId(autoGenerate = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Double getDiscPromos() {
        return discPromos;
    }

    public void setDiscPromos(Double discPromos) {
        this.discPromos = discPromos;
    }

    public Double getTaxesSurchgs() {
        return taxesSurchgs;
    }

    public void setTaxesSurchgs(Double taxesSurchgs) {
        this.taxesSurchgs = taxesSurchgs;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getContractSof() {
        return contractSof;
    }

    public void setContractSof(String contractSof) {
        this.contractSof = contractSof;
    }

    public String getMins() {
        return mins;
    }

    public void setMins(String mins) {
        this.mins = mins;
    }

    public String getDestination1() {
        return destination1;
    }

    public void setDestination1(String destination1) {
        this.destination1 = destination1;
    }

    public String getDestination2() {
        return destination2;
    }

    public void setDestination2(String destination2) {
        this.destination2 = destination2;
    }

    public String getCleId() {
        return cleId;
    }

    public void setCleId(String cleId) {
        this.cleId = cleId;
    }

    @Override
    public String getOrigSystemId() {
        return origSystemId;
    }

    public void setOrigSystemId(String origSystemId) {
        this.origSystemId = origSystemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Step5AggregatedPojo that = (Step5AggregatedPojo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(man, that.man) &&
                Objects.equals(manBillDate, that.manBillDate) &&
                Objects.equals(origSystemId, that.origSystemId) &&
                Objects.equals(ban, that.ban) &&
                Objects.equals(billDate, that.billDate) &&
                Objects.equals(aban, that.aban) &&
                Objects.equals(locationId, that.locationId) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(discPromos, that.discPromos) &&
                Objects.equals(taxesSurchgs, that.taxesSurchgs) &&
                Objects.equals(serviceId, that.serviceId) &&
                Objects.equals(contractSof, that.contractSof) &&
                Objects.equals(mins, that.mins) &&
                Objects.equals(destination1, that.destination1) &&
                Objects.equals(destination2, that.destination2) &&
                Objects.equals(cleId, that.cleId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, man, manBillDate, origSystemId, ban, billDate, aban, locationId, amount, discPromos, taxesSurchgs, serviceId, contractSof, mins, destination1, destination2, cleId);
    }

    @Override
    public String toString() {
        return "Step5AggregatedPojo{" +
                "id='" + id + '\'' +
                ", man='" + man + '\'' +
                ", manBillDate=" + manBillDate +
                ", origSystemId='" + origSystemId + '\'' +
                ", ban='" + ban + '\'' +
                ", billDate=" + billDate +
                ", aban='" + aban + '\'' +
                ", locationId='" + locationId + '\'' +
                ", amount=" + amount +
                ", discPromos=" + discPromos +
                ", taxesSurchgs=" + taxesSurchgs +
                ", serviceId='" + serviceId + '\'' +
                ", contractSof='" + contractSof + '\'' +
                ", mins=" + mins +
                ", destination1='" + destination1 + '\'' +
                ", destination2='" + destination2 + '\'' +
                ", cleId='" + cleId + '\'' +
                '}';
    }
}
