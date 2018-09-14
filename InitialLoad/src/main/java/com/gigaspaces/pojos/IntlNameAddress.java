package com.gigaspaces.pojos;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.interfaces.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author DenysNovikov
 * Date: 20.08.2018
 */
@Entity
@Table(name = "BMGVZP.INTL_NAME_ADDRESS")
@SpaceClass
public class IntlNameAddress implements HasMan, HasManBillDate, HasBan, HasBillDate, HasOrigSystemId, HasAban, HasVz450SeqNbr {

    @EmbeddedId
    private IntlNameAddressCompositeId intlNameAddressCompositeId;

    @Column(name = "BAN")
    private String ban;
    @Column(name = "BILL_DATE")
    private Date billDate;
    @Column(name = "ABAN")
    private String aban;
    @Column(name = "ADDRESS_CTGY_ID")
    private Character addressCtgyId;
    @Column(name = "ACCT_NAME")
    private String acctName;
    @Column(name = "CONTACT_NAME")
    private String contactName;
    @Column(name = "ADDRESS_1")
    private String address1;
    @Column(name = "ADDRESS_2")
    private String address2;
    @Column(name = "ADDRESS_3")
    private String address3;
    @Column(name = "ADDRESS_4")
    private String address4;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "DISTRICT")
    private String district;
    @Column(name = "PROVINCE")
    private String province;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "POSTAL_CD")
    private String postalCd;
    @Column(name = "COUNTRY_NAME")
    private String countryName;
    @Column(name = "ADDR_SEQ_NBR")
    private Integer addrSeqNbr;
    @Column(name = "ADDR_SEQ_CD")
    private Integer addrSeqCd;
    @Column(name = "LOCATION_ID")
    private String locationId;
    @Column(name = "ADDRESS_5")
    private String address5;
    @Column(name = "SUB_REC_NBR")
    private String subRecNbr;
    @Column(name = "BIN_FILE_SEQ_NBR")
    private Integer binFileSeqNbr;
    @Column(name = "TEXT_POINTER_CD")
    private String textPointerCd;
    @Column(name = "SUB_CIC")
    private String subCic;
    @Column(name = "CGI_NAME")
    private String cgiName;
    @Column(name = "VAMLOAD_DATE")
    private Date vamloadDate;

    public IntlNameAddress() {
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

    public Character getAddressCtgyId() {
        return addressCtgyId;
    }

    public void setAddressCtgyId(Character addressCtgyId) {
        this.addressCtgyId = addressCtgyId;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
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

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public Integer getAddrSeqNbr() {
        return addrSeqNbr;
    }

    public void setAddrSeqNbr(Integer addrSeqNbr) {
        this.addrSeqNbr = addrSeqNbr;
    }

    public Integer getAddrSeqCd() {
        return addrSeqCd;
    }

    public void setAddrSeqCd(Integer addrSeqCd) {
        this.addrSeqCd = addrSeqCd;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getAddress5() {
        return address5;
    }

    public void setAddress5(String address5) {
        this.address5 = address5;
    }

    public String getSubRecNbr() {
        return subRecNbr;
    }

    public void setSubRecNbr(String subRecNbr) {
        this.subRecNbr = subRecNbr;
    }

    public Integer getBinFileSeqNbr() {
        return binFileSeqNbr;
    }

    public void setBinFileSeqNbr(Integer binFileSeqNbr) {
        this.binFileSeqNbr = binFileSeqNbr;
    }

    public String getTextPointerCd() {
        return textPointerCd;
    }

    public void setTextPointerCd(String textPointerCd) {
        this.textPointerCd = textPointerCd;
    }

    public String getSubCic() {
        return subCic;
    }

    public void setSubCic(String subCic) {
        this.subCic = subCic;
    }

    public String getCgiName() {
        return cgiName;
    }

    public void setCgiName(String cgiName) {
        this.cgiName = cgiName;
    }

    public Date getVamloadDate() {
        return vamloadDate;
    }

    public void setVamloadDate(Date vamloadDate) {
        this.vamloadDate = vamloadDate;
    }

    @SpaceId
    public IntlNameAddressCompositeId getIntlNameAddressCompositeId() {
        return intlNameAddressCompositeId;
    }

    public void setIntlNameAddressCompositeId(IntlNameAddressCompositeId intlNameAddressCompositeId) {
        this.intlNameAddressCompositeId = intlNameAddressCompositeId;
    }

    @Override
    public String getMan() {
        return intlNameAddressCompositeId.getMan();
    }

    @Override
    public Date getManBillDate() {
        return intlNameAddressCompositeId.getManBillDate();
    }

    @Override
    public String getOrigSystemId() {
        return intlNameAddressCompositeId.getOrigSystemId();
    }

    @Override
    public Integer getVz450SeqNbr() {
        return intlNameAddressCompositeId.getVz450SeqNbr();
    }
}
