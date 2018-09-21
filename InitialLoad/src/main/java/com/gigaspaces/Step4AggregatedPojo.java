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
public class Step4AggregatedPojo implements HasMan, HasBan, HasOrigSystemId, HasManBillDate, HasAban, HasBillDate {

    private String id;
    private String man;
    private Date manBillDate;
    private String origSystemId;
    private String ban;
    private Date billDate;
    private String aban;
    private String locationId;
    private String locationInstanceId;
    private String cleId;

    public Step4AggregatedPojo() {
    }

    public Step4AggregatedPojo(Step4AggregatedPojo source) {
        this.man = source.getMan();
        this.manBillDate = source.getManBillDate();
        this.origSystemId = source.getOrigSystemId();
        this.ban = source.getBan();
        this.billDate = source.getBillDate();
        this.aban = source.getAban();
        this.locationId = source.getLocationId();
        this.locationInstanceId = source.getLocationInstanceId();
        this.cleId = source.getCleId();
    }

    public Step4AggregatedPojo(String id, String man, Date manBillDate, String origSystemId, String ban, Date billDate, String aban, String locationId, String locationInstanceId, String cleId) {
        this.id = id;
        this.man = man;
        this.manBillDate = manBillDate;
        this.origSystemId = origSystemId;
        this.ban = ban;
        this.billDate = billDate;
        this.aban = aban;
        this.locationId = locationId;
        this.locationInstanceId = locationInstanceId;
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

    public String getLocationInstanceId() {
        return locationInstanceId;
    }

    public void setLocationInstanceId(String locationInstanceId) {
        this.locationInstanceId = locationInstanceId;
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
        Step4AggregatedPojo that = (Step4AggregatedPojo) o;
        return  Objects.equals(id, that.id) &&
                Objects.equals(man, that.man) &&
                Objects.equals(manBillDate, that.manBillDate) &&
                Objects.equals(origSystemId, that.origSystemId) &&
                Objects.equals(ban, that.ban) &&
                Objects.equals(billDate, that.billDate) &&
                Objects.equals(aban, that.aban) &&
                Objects.equals(locationId, that.locationId) &&
                Objects.equals(locationInstanceId, that.locationInstanceId) &&
                Objects.equals(cleId, that.cleId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, man, manBillDate, origSystemId, ban, billDate, aban, locationId, locationInstanceId, cleId);
    }

    @Override
    public String toString() {
        return "Step4AggregatedPojo{" +
                "id='" + id + '\'' +
                ", man='" + man + '\'' +
                ", manBillDate=" + manBillDate +
                ", origSystemId=" + origSystemId +
                ", ban='" + ban + '\'' +
                ", billDate=" + billDate +
                ", aban='" + aban + '\'' +
                ", locationId='" + locationId + '\'' +
                ", locationInstanceId='" + locationInstanceId + '\'' +
                ", cleId='" + cleId + '\'' +
                '}';
    }
}
