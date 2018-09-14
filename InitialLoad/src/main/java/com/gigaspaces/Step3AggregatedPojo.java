package com.gigaspaces;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.interfaces.HasBan;
import com.gigaspaces.interfaces.HasMan;

import java.sql.Date;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 10.09.2018
 */
@SpaceClass
public class Step3AggregatedPojo implements HasMan, HasBan {

    private String id;
    private String man;
    private Date manBillDate;
    private String origSystemId;
    private String ban;
    private Date billDate;
    private String aban;
    private String locationId;
    private String acctName;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String state;
    private String country;
    private String postalCd;
    private String countryName;
    private String locationInstanceId;
    private String cleId;

    public Step3AggregatedPojo() {
    }

    public Step3AggregatedPojo(String man, Date manBillDate, String origSystemId, String ban, Date billDate, String aban, String locationId, String acctName, String address1, String address2, String address3, String city, String state, String country, String postalCd, String countryName, String locationInstanceId, String cleId) {
        this.man = man;
        this.manBillDate = manBillDate;
        this.origSystemId = origSystemId;
        this.ban = ban;
        this.billDate = billDate;
        this.aban = aban;
        this.locationId = locationId;
        this.acctName = acctName;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCd = postalCd;
        this.countryName = countryName;
        this.locationInstanceId = locationInstanceId;
        this.cleId = cleId;
    }

    public Step3AggregatedPojo(Step3AggregatedPojo step3AggregatedPojo) {
        this.man = step3AggregatedPojo.getMan();
        this.manBillDate = step3AggregatedPojo.getManBillDate();
        this.origSystemId = step3AggregatedPojo.getOrigSystemId();
        this.ban = step3AggregatedPojo.getBan();
        this.billDate = step3AggregatedPojo.getBillDate();
        this.aban = step3AggregatedPojo.getAban();
        this.locationId = step3AggregatedPojo.getLocationId();
        this.acctName = step3AggregatedPojo.getAcctName();
        this.address1 = step3AggregatedPojo.getAddress1();
        this.address2 = step3AggregatedPojo.getAddress2();
        this.address3 = step3AggregatedPojo.getAddress3();
        this.city = step3AggregatedPojo.getCity();
        this.state = step3AggregatedPojo.getState();
        this.country = step3AggregatedPojo.getCountry();
        this.postalCd = step3AggregatedPojo.getPostalCd();
        this.countryName = step3AggregatedPojo.getCountryName();
        this.locationInstanceId = step3AggregatedPojo.getLocationInstanceId();
        this.cleId = step3AggregatedPojo.getCleId();
    }

    @SpaceId(autoGenerate = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getAban() {
        return aban;
    }

    public void setAban(String aban) {
        this.aban = aban;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCd() {
        return postalCd;
    }

    public void setPostalCd(String postalCd) {
        this.postalCd = postalCd;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Step3AggregatedPojo that = (Step3AggregatedPojo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(man, that.man) &&
                Objects.equals(manBillDate, that.manBillDate) &&
                Objects.equals(origSystemId, that.origSystemId) &&
                Objects.equals(ban, that.ban) &&
                Objects.equals(billDate, that.billDate) &&
                Objects.equals(aban, that.aban) &&
                Objects.equals(locationId, that.locationId) &&
                Objects.equals(acctName, that.acctName) &&
                Objects.equals(address1, that.address1) &&
                Objects.equals(address2, that.address2) &&
                Objects.equals(address3, that.address3) &&
                Objects.equals(city, that.city) &&
                Objects.equals(state, that.state) &&
                Objects.equals(country, that.country) &&
                Objects.equals(postalCd, that.postalCd) &&
                Objects.equals(countryName, that.countryName) &&
                Objects.equals(locationInstanceId, that.locationInstanceId) &&
                Objects.equals(cleId, that.cleId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, man, manBillDate, origSystemId, ban, billDate, aban, locationId, acctName, address1, address2, address3, city, state, country, postalCd, countryName, locationInstanceId, cleId);
    }

    @Override
    public String toString() {
        return "Step3AggregatedPojo{" +
                "id='" + id + '\'' +
                ", man='" + man + '\'' +
                ", manBillDate=" + manBillDate +
                ", origSystemId=" + origSystemId +
                ", ban='" + ban + '\'' +
                ", billDate=" + billDate +
                ", aban='" + aban + '\'' +
                ", locationId='" + locationId + '\'' +
                ", acctName='" + acctName + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCd='" + postalCd + '\'' +
                ", countryName='" + countryName + '\'' +
                ", locationInstanceId='" + locationInstanceId + '\'' +
                ", cleId='" + cleId + '\'' +
                '}';
    }

}
