package com.gigaspaces.pojos;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author Denys_Novikov
 * Date: 20.08.2018
 */
@Entity
@Table(name = "BMGVZP.CURRENT_BAN_T")
@SpaceClass
public class CurrentBanT {

    @EmbeddedId
    private CurrentBanTCompositeId currentBanTCompositeId;

    @Column(name = "FIRST_DATE")
    private Date firstDate;
    @Column(name = "LAST_DATE")
    private Date lastDate;
    @Column(name = "TOT_BILL_AMT")
    private Double totBillAmt;
    @Column(name = "TOT_CURR_CHGS")
    private Double totCurrChgs;
    @Column(name = "NET_PAST_DUE")
    private Double netPastDue;
    @Column(name = "ENTITY_CD")
    private String entityCd;
    @Column(name = "PREV_BILL_AMT")
    private Double prevBillAmt;
    @Column(name = "TOT_PAYS")
    private Double totPays;
    @Column(name = "TOT_ADJS")
    private Double totAdjs;
    @Column(name = "LATE_PAY_CHGS")
    private Double latePayChgs;
    @Column(name = "DISP_ACCT_NUM")
    private String dispAcctNum;
    @Column(name = "MAN_PARTIAL_IND")
    private Character manPartialInd;
    @Column(name = "ENTERPRISE_ID")
    private Double enterpriseId;
    @Column(name = "SB_OID")
    private Double sbOid;
    @Column(name = "SP_OID")
    private Double spOid;
    @Column(name = "SERVICE_TYPE")
    private String serviceType;
    @Column(name = "SP_STATUS")
    private Character spStatus;
    @Column(name = "SP_STATUS_DATE")
    private String spStatusDate;
    @Column(name = "SP_BACKEND_SYSTEM")
    private String spBackendSystem;
    @Column(name = "INVOICE_NBR")
    private String invoiceNbr;
    @Column(name = "CHANNEL_CD")
    private String channelCd;
    @Column(name = "REMIT_ACCT_IND")
    private Character remitAcctInd;
    @Column(name = "CURRENCY_CD")
    private String currencyCd;
    @Column(name = "REGION_CD")
    private String regionCd;
    @Column(name = "INVOICE_TYPE")
    private Character invoiceType;
    @Column(name = "INTERNATIONAL_IND")
    private Character internationalInd;
    @Column(name = "ACCT_NAME")
    private String acctName;
    @Column(name = "ADDR_SEQ_NBR")
    private Integer addrSeqNbr;
    @Column(name = "ADDR_CITY")
    private String addrCity;
    @Column(name = "ADDR_STATE")
    private String addrState;
    @Column(name = "GBR")
    private String gbr;
    @Column(name = "GBR_OSID")
    private String gbrOsid;
    @Column(name = "GBR_DATE")
    private String gbrDate;
    @Column(name = "PAPER_SUPP_IND")
    private Character paperSuppInd;
    @Column(name = "PAPER_ELIG_IND")
    private Character paperEligInd;
    @Column(name = "PAPER_CONTR_AMEND")
    private Character paperContrAmend;
    @Column(name = "ZIP_CD")
    private String zipCd;
    @Column(name = "PEND_ADJ_AMT")
    private Double pendAdjAmt;
    @Column(name = "PEND_PAY_AMT")
    private Double pendPayAmt;
    @Column(name = "BILL_ADDRESS")
    private String billAddress;
    @Column(name = "SVC_ADDRESS")
    private String svcAddress;
    @Column(name = "CREF")
    private String cref;
    @Column(name = "STAND_ALONE_IND")
    private Character standAloneInd;
    @Column(name = "BILL_PERIOD")
    private String billPeriod;
    @Column(name = "PAPER_CHARGE_CODE")
    private String paperChargeCode;
    @Column(name = "PAPER_CALL_DETAIL")
    private String paperCallDetail;
    @Column(name = "PAPER_OID_STATUS")
    private String paperOidStatus;
    @Column(name = "ACCT_ALIAS")
    private String acctAlias;
    @Column(name = "GBR_CLASS_CD")
    private Character gbrClassCd;
    @Column(name = "GBR_SP_OID")
    private Double gbrSpOid;
    @Column(name = "GBR_SB_OID")
    private Double gbrSbOid;
    @Column(name = "GBR_SERVICE_TYPE")
    private String gbrServiceType;
    @Column(name = "M077_SUPP_DATA_ID")
    private String m077SuppDataId;
    @Column(name = "FREQUENCY")
    private Character frequency;
    @Column(name = "PENDING_LAST_DATE")
    private String pendingLastDate;
    @Column(name = "OPCO")
    private String opco;
    @Column(name = "ACCT_IN_GCP")
    private Character acctInGcp;
    @Column(name = "CORP_IN_GCP")
    private Character corpInGcp;
    @Column(name = "STATE_CODE")
    private String stateCode;
    @Column(name = "LAST_ONLINE_ACTION")
    private Character lastOnlineAction;
    @Column(name = "INQUIRY_PENDING")
    private Character inquiryPending;
    @Column(name = "MAN_DAN")
    private String manDan;
    @Column(name = "LAST_BILL_DATE")
    private Date lastBillDate;
    @Column(name = "MAN_SP_OID")
    private Double manSpOid;
    @Column(name = "RAO")
    private String rao;
    @Column(name = "COMP_SVC_TYPE")
    private Character compSvcType;
    @Column(name = "SUMM_BILL_IND")
    private Character summBillInd;
    @Column(name = "TAX_STATUS_IND_FD")
    private Character taxStatusIndFd;
    @Column(name = "TAX_STATUS_IND_ST")
    private Character taxStatusIndSt;
    @Column(name = "TAX_STATUS_E911")
    private Character taxStatusE911;
    @Column(name = "TAX_STATUS_SCHG")
    private Character taxStatusSchg;
    @Column(name = "TAX_STATUS_IND_LOC")
    private Character taxStatusIndLoc;
    @Column(name = "CLS_OF_SVC_TYPE")
    private Character clsOfSvcType;
    @Column(name = "ACCT_TYPE_CD")
    private Character acctTypeCd;
    @Column(name = "PAYM_OPT_CD")
    private Character paymOptCd;
    @Column(name = "SPEC_PROC_CD")
    private Character specProcCd;
    @Column(name = "WCAS_TAX_CAT")
    private String wcasTaxCat;
    @Column(name = "AR_SYSTEM")
    private String arSystem;
    @Column(name = "Q2C_FLAG")
    private Character q2cFlag;
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;
    @Column(name = "CONF_IND")
    private Character confInd;
    @Column(name = "SUB_CONTRACT_ID")
    private String subContractId;

    public CurrentBanT() {
    }

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public Double getTotBillAmt() {
        return totBillAmt;
    }

    public void setTotBillAmt(Double totBillAmt) {
        this.totBillAmt = totBillAmt;
    }

    public Double getTotCurrChgs() {
        return totCurrChgs;
    }

    public void setTotCurrChgs(Double totCurrChgs) {
        this.totCurrChgs = totCurrChgs;
    }

    public Double getNetPastDue() {
        return netPastDue;
    }

    public void setNetPastDue(Double netPastDue) {
        this.netPastDue = netPastDue;
    }

    public String getEntityCd() {
        return entityCd;
    }

    public void setEntityCd(String entityCd) {
        this.entityCd = entityCd;
    }

    public Double getPrevBillAmt() {
        return prevBillAmt;
    }

    public void setPrevBillAmt(Double prevBillAmt) {
        this.prevBillAmt = prevBillAmt;
    }

    public Double getTotPays() {
        return totPays;
    }

    public void setTotPays(Double totPays) {
        this.totPays = totPays;
    }

    public Double getTotAdjs() {
        return totAdjs;
    }

    public void setTotAdjs(Double totAdjs) {
        this.totAdjs = totAdjs;
    }

    public Double getLatePayChgs() {
        return latePayChgs;
    }

    public void setLatePayChgs(Double latePayChgs) {
        this.latePayChgs = latePayChgs;
    }

    public String getDispAcctNum() {
        return dispAcctNum;
    }

    public void setDispAcctNum(String dispAcctNum) {
        this.dispAcctNum = dispAcctNum;
    }

    public Character getManPartialInd() {
        return manPartialInd;
    }

    public void setManPartialInd(Character manPartialInd) {
        this.manPartialInd = manPartialInd;
    }

    public Double getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Double enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Double getSbOid() {
        return sbOid;
    }

    public void setSbOid(Double sbOid) {
        this.sbOid = sbOid;
    }

    public Double getSpOid() {
        return spOid;
    }

    public void setSpOid(Double spOid) {
        this.spOid = spOid;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Character getSpStatus() {
        return spStatus;
    }

    public void setSpStatus(Character spStatus) {
        this.spStatus = spStatus;
    }

    public String getSpStatusDate() {
        return spStatusDate;
    }

    public void setSpStatusDate(String spStatusDate) {
        this.spStatusDate = spStatusDate;
    }

    public String getSpBackendSystem() {
        return spBackendSystem;
    }

    public void setSpBackendSystem(String spBackendSystem) {
        this.spBackendSystem = spBackendSystem;
    }

    public String getInvoiceNbr() {
        return invoiceNbr;
    }

    public void setInvoiceNbr(String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    public String getChannelCd() {
        return channelCd;
    }

    public void setChannelCd(String channelCd) {
        this.channelCd = channelCd;
    }

    public Character getRemitAcctInd() {
        return remitAcctInd;
    }

    public void setRemitAcctInd(Character remitAcctInd) {
        this.remitAcctInd = remitAcctInd;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd;
    }

    public String getRegionCd() {
        return regionCd;
    }

    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    public Character getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Character invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Character getInternationalInd() {
        return internationalInd;
    }

    public void setInternationalInd(Character internationalInd) {
        this.internationalInd = internationalInd;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public Integer getAddrSeqNbr() {
        return addrSeqNbr;
    }

    public void setAddrSeqNbr(Integer addrSeqNbr) {
        this.addrSeqNbr = addrSeqNbr;
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    public String getAddrState() {
        return addrState;
    }

    public void setAddrState(String addrState) {
        this.addrState = addrState;
    }

    public String getGbr() {
        return gbr;
    }

    public void setGbr(String gbr) {
        this.gbr = gbr;
    }

    public String getGbrOsid() {
        return gbrOsid;
    }

    public void setGbrOsid(String gbrOsid) {
        this.gbrOsid = gbrOsid;
    }

    public String getGbrDate() {
        return gbrDate;
    }

    public void setGbrDate(String gbrDate) {
        this.gbrDate = gbrDate;
    }

    public Character getPaperSuppInd() {
        return paperSuppInd;
    }

    public void setPaperSuppInd(Character paperSuppInd) {
        this.paperSuppInd = paperSuppInd;
    }

    public Character getPaperEligInd() {
        return paperEligInd;
    }

    public void setPaperEligInd(Character paperEligInd) {
        this.paperEligInd = paperEligInd;
    }

    public Character getPaperContrAmend() {
        return paperContrAmend;
    }

    public void setPaperContrAmend(Character paperContrAmend) {
        this.paperContrAmend = paperContrAmend;
    }

    public String getZipCd() {
        return zipCd;
    }

    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

    public Double getPendAdjAmt() {
        return pendAdjAmt;
    }

    public void setPendAdjAmt(Double pendAdjAmt) {
        this.pendAdjAmt = pendAdjAmt;
    }

    public Double getPendPayAmt() {
        return pendPayAmt;
    }

    public void setPendPayAmt(Double pendPayAmt) {
        this.pendPayAmt = pendPayAmt;
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress;
    }

    public String getSvcAddress() {
        return svcAddress;
    }

    public void setSvcAddress(String svcAddress) {
        this.svcAddress = svcAddress;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public Character getStandAloneInd() {
        return standAloneInd;
    }

    public void setStandAloneInd(Character standAloneInd) {
        this.standAloneInd = standAloneInd;
    }

    public String getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
    }

    public String getPaperChargeCode() {
        return paperChargeCode;
    }

    public void setPaperChargeCode(String paperChargeCode) {
        this.paperChargeCode = paperChargeCode;
    }

    public String getPaperCallDetail() {
        return paperCallDetail;
    }

    public void setPaperCallDetail(String paperCallDetail) {
        this.paperCallDetail = paperCallDetail;
    }

    public String getPaperOidStatus() {
        return paperOidStatus;
    }

    public void setPaperOidStatus(String paperOidStatus) {
        this.paperOidStatus = paperOidStatus;
    }

    public String getAcctAlias() {
        return acctAlias;
    }

    public void setAcctAlias(String acctAlias) {
        this.acctAlias = acctAlias;
    }

    public Character getGbrClassCd() {
        return gbrClassCd;
    }

    public void setGbrClassCd(Character gbrClassCd) {
        this.gbrClassCd = gbrClassCd;
    }

    public Double getGbrSpOid() {
        return gbrSpOid;
    }

    public void setGbrSpOid(Double gbrSpOid) {
        this.gbrSpOid = gbrSpOid;
    }

    public Double getGbrSbOid() {
        return gbrSbOid;
    }

    public void setGbrSbOid(Double gbrSbOid) {
        this.gbrSbOid = gbrSbOid;
    }

    public String getGbrServiceType() {
        return gbrServiceType;
    }

    public void setGbrServiceType(String gbrServiceType) {
        this.gbrServiceType = gbrServiceType;
    }

    public String getM077SuppDataId() {
        return m077SuppDataId;
    }

    public void setM077SuppDataId(String m077SuppDataId) {
        this.m077SuppDataId = m077SuppDataId;
    }

    public Character getFrequency() {
        return frequency;
    }

    public void setFrequency(Character frequency) {
        this.frequency = frequency;
    }

    public String getPendingLastDate() {
        return pendingLastDate;
    }

    public void setPendingLastDate(String pendingLastDate) {
        this.pendingLastDate = pendingLastDate;
    }

    public String getOpco() {
        return opco;
    }

    public void setOpco(String opco) {
        this.opco = opco;
    }

    public Character getAcctInGcp() {
        return acctInGcp;
    }

    public void setAcctInGcp(Character acctInGcp) {
        this.acctInGcp = acctInGcp;
    }

    public Character getCorpInGcp() {
        return corpInGcp;
    }

    public void setCorpInGcp(Character corpInGcp) {
        this.corpInGcp = corpInGcp;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public Character getLastOnlineAction() {
        return lastOnlineAction;
    }

    public void setLastOnlineAction(Character lastOnlineAction) {
        this.lastOnlineAction = lastOnlineAction;
    }

    public Character getInquiryPending() {
        return inquiryPending;
    }

    public void setInquiryPending(Character inquiryPending) {
        this.inquiryPending = inquiryPending;
    }

    public String getManDan() {
        return manDan;
    }

    public void setManDan(String manDan) {
        this.manDan = manDan;
    }

    public Date getLastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(Date lastBillDate) {
        this.lastBillDate = lastBillDate;
    }

    public Double getManSpOid() {
        return manSpOid;
    }

    public void setManSpOid(Double manSpOid) {
        this.manSpOid = manSpOid;
    }

    public String getRao() {
        return rao;
    }

    public void setRao(String rao) {
        this.rao = rao;
    }

    public Character getCompSvcType() {
        return compSvcType;
    }

    public void setCompSvcType(Character compSvcType) {
        this.compSvcType = compSvcType;
    }

    public Character getSummBillInd() {
        return summBillInd;
    }

    public void setSummBillInd(Character summBillInd) {
        this.summBillInd = summBillInd;
    }

    public Character getTaxStatusIndFd() {
        return taxStatusIndFd;
    }

    public void setTaxStatusIndFd(Character taxStatusIndFd) {
        this.taxStatusIndFd = taxStatusIndFd;
    }

    public Character getTaxStatusIndSt() {
        return taxStatusIndSt;
    }

    public void setTaxStatusIndSt(Character taxStatusIndSt) {
        this.taxStatusIndSt = taxStatusIndSt;
    }

    public Character getTaxStatusE911() {
        return taxStatusE911;
    }

    public void setTaxStatusE911(Character taxStatusE911) {
        this.taxStatusE911 = taxStatusE911;
    }

    public Character getTaxStatusSchg() {
        return taxStatusSchg;
    }

    public void setTaxStatusSchg(Character taxStatusSchg) {
        this.taxStatusSchg = taxStatusSchg;
    }

    public Character getTaxStatusIndLoc() {
        return taxStatusIndLoc;
    }

    public void setTaxStatusIndLoc(Character taxStatusIndLoc) {
        this.taxStatusIndLoc = taxStatusIndLoc;
    }

    public Character getClsOfSvcType() {
        return clsOfSvcType;
    }

    public void setClsOfSvcType(Character clsOfSvcType) {
        this.clsOfSvcType = clsOfSvcType;
    }

    public Character getAcctTypeCd() {
        return acctTypeCd;
    }

    public void setAcctTypeCd(Character acctTypeCd) {
        this.acctTypeCd = acctTypeCd;
    }

    public Character getPaymOptCd() {
        return paymOptCd;
    }

    public void setPaymOptCd(Character paymOptCd) {
        this.paymOptCd = paymOptCd;
    }

    public Character getSpecProcCd() {
        return specProcCd;
    }

    public void setSpecProcCd(Character specProcCd) {
        this.specProcCd = specProcCd;
    }

    public String getWcasTaxCat() {
        return wcasTaxCat;
    }

    public void setWcasTaxCat(String wcasTaxCat) {
        this.wcasTaxCat = wcasTaxCat;
    }

    public String getArSystem() {
        return arSystem;
    }

    public void setArSystem(String arSystem) {
        this.arSystem = arSystem;
    }

    public Character getQ2cFlag() {
        return q2cFlag;
    }

    public void setQ2cFlag(Character q2cFlag) {
        this.q2cFlag = q2cFlag;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Character getConfInd() {
        return confInd;
    }

    public void setConfInd(Character confInd) {
        this.confInd = confInd;
    }

    public String getSubContractId() {
        return subContractId;
    }

    public void setSubContractId(String subContractId) {
        this.subContractId = subContractId;
    }

    @SpaceId
    public CurrentBanTCompositeId getCurrentBanTCompositeId() {
        return currentBanTCompositeId;
    }

    public void setCurrentBanTCompositeId(CurrentBanTCompositeId currentBanTCompositeId) {
        this.currentBanTCompositeId = currentBanTCompositeId;
    }
}
