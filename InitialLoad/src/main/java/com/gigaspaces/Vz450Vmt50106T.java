package com.gigaspaces;

/**
 * @author Denys_Novikov
 * Date: 20.08.2018
 */

import com.gigaspaces.annotation.pojo.SpaceClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "BMGVZP.VZ450_VMT50106_T")
@SpaceClass
public class Vz450Vmt50106T {

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
}
