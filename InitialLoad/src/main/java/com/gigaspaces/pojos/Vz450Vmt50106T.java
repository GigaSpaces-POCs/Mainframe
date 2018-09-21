package com.gigaspaces.pojos;

/**
 * @author Denys_Novikov
 * Date: 20.08.2018
 */

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.interfaces.HasMan;
import com.gigaspaces.interfaces.HasManBillDate;
import com.gigaspaces.interfaces.HasOrigSystemId;
import com.gigaspaces.interfaces.HasVz450SeqNbr;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "BMGVZP.VZ450_VMT50106_T")
@SpaceClass
public class Vz450Vmt50106T implements HasMan, HasManBillDate, HasOrigSystemId, HasVz450SeqNbr {

    @EmbeddedId
    private Vz450Vmt50106TCompositeId vz450Vmt50106TCompositeId;

    @Column(name = "CUST_ID_DEPT_CD")
    private String custIdDeptCd;
    @Column(name = "LOCATION_ID")
    private String locationId;
    @Column(name = "ADDR_SEQ_CD")
    private Integer addrSeqCd;
    @Column(name = "ADDR_XREF_NBR")
    private Integer addrXrefNbr;
    @Column(name = "CHG_CD")
    private String chgCd;
    @Column(name = "CHG_CD_ID")
    private Integer chgCdId;
    @Column(name = "LOC_CHG_CD")
    private String locChgCd;
    @Column(name = "LOC_CHG_CD_ID")
    private Integer locChgCdId;
    @Column(name = "LOC_CHG_AMT")
    private Double locChgAmt;
    @Column(name = "TOT_CALLS")
    private Double totCalls;
    @Column(name = "TOT_MINUTES")
    private Double totMinutes;
    @Column(name = "BAN")
    private String ban;
    @Column(name = "BILL_DATE")
    private Date billDate;
    @Column(name = "ABAN")
    private String aban;
    @Column(name = "TF_CORP")
    private String tfCorp;
    @Column(name = "MODULE_907")
    private String module907;
    @Column(name = "VAMLOAD_DATE")
    private Date vamloadDate;

    public Vz450Vmt50106T(){}

    public String getCustIdDeptCd() {
        return custIdDeptCd;
    }

    public void setCustIdDeptCd(String custIdDeptCd) {
        this.custIdDeptCd = custIdDeptCd;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Integer getAddrSeqCd() {
        return addrSeqCd;
    }

    public void setAddrSeqCd(Integer addrSeqCd) {
        this.addrSeqCd = addrSeqCd;
    }

    public Integer getAddrXrefNbr() {
        return addrXrefNbr;
    }

    public void setAddrXrefNbr(Integer addrXrefNbr) {
        this.addrXrefNbr = addrXrefNbr;
    }

    public String getChgCd() {
        return chgCd;
    }

    public void setChgCd(String chgCd) {
        this.chgCd = chgCd;
    }

    public Integer getChgCdId() {
        return chgCdId;
    }

    public void setChgCdId(Integer chgCdId) {
        this.chgCdId = chgCdId;
    }

    public String getLocChgCd() {
        return locChgCd;
    }

    public void setLocChgCd(String locChgCd) {
        this.locChgCd = locChgCd;
    }

    public Integer getLocChgCdId() {
        return locChgCdId;
    }

    public void setLocChgCdId(Integer locChgCdId) {
        this.locChgCdId = locChgCdId;
    }

    public Double getLocChgAmt() {
        return locChgAmt;
    }

    public void setLocChgAmt(Double locChgAmt) {
        this.locChgAmt = locChgAmt;
    }

    public Double getTotCalls() {
        return totCalls;
    }

    public void setTotCalls(Double totCalls) {
        this.totCalls = totCalls;
    }

    public Double getTotMinutes() {
        return totMinutes;
    }

    public void setTotMinutes(Double totMinutes) {
        this.totMinutes = totMinutes;
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

    public String getTfCorp() {
        return tfCorp;
    }

    public void setTfCorp(String tfCorp) {
        this.tfCorp = tfCorp;
    }

    public String getModule907() {
        return module907;
    }

    public void setModule907(String module907) {
        this.module907 = module907;
    }

    public Date getVamloadDate() {
        return vamloadDate;
    }

    public void setVamloadDate(Date vamloadDate) {
        this.vamloadDate = vamloadDate;
    }

    @SpaceId
    public Vz450Vmt50106TCompositeId getVz450Vmt50106TCompositeId() {
        return vz450Vmt50106TCompositeId;
    }

    public void setVz450Vmt50106TCompositeId(Vz450Vmt50106TCompositeId vz450Vmt50106TCompositeId) {
        this.vz450Vmt50106TCompositeId = vz450Vmt50106TCompositeId;
    }

    @Override
    public String getMan() {
        return vz450Vmt50106TCompositeId.getMan();
    }

    @Override
    public Date getManBillDate() {
        return vz450Vmt50106TCompositeId.getManBillDate();
    }

    @Override
    public String getOrigSystemId() {
        return vz450Vmt50106TCompositeId.getOrigSystemId();
    }

    @Override
    public Integer getVz450SeqNbr() {
        return vz450Vmt50106TCompositeId.getVz450SeqNbr();
    }
}
