package com.gigaspaces.pojos;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author Denys_Novikov
 * Date: 20.08.2018
 */
@Entity
@Table(name = "BMGVZP.SUBSCRIPTION")
@SpaceClass
public class Subscription {

    @Id
    @Column(name = "SUBSCRIPTION_OID")
    private Double subscriptionOid;
    @Column(name = "SERVICE_ID")
    private String serviceId;
    @Column(name = "SERVICE_TYPE")
    private String serviceType;
    @Column(name = "SERVICE_ORDER_NUM")
    private String serviceOrderNum;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "STATUS_DATE")
    private Date statusDate;
    @Column(name = "CUSTOMER_CODE")
    private String customerCode;
    @Column(name = "CUSTOMER_ACCT_NUM")
    private String customerAcctNum;
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;
    @Column(name = "BACKEND_SYSTEM")
    private String backendSystem;
    @Column(name = "REGION")
    private String region;
    @Column(name = "ORIG_SYSTEM_ID")
    private String origSystemId;
    @Column(name = "KEY_EFFECTIVE_DATE")
    private Date keyEffectiveDate;
    @Column(name = "STATE")
    private String state;
    @Column(name = "CHANNEL_CODE")
    private String channelCode;
    @Column(name = "BILL_PERIOD")
    private String billPeriod;
    @Column(name = "LAST_BILL_DATE")
    private Date lastBillDate;
    @Column(name = "NEXT_BILL_DATE")
    private Date nextBillDate;
    @Column(name = "USER_ID")
    private Double userId;
    @Column(name = "TIMESTAMP")
    private Timestamp timestamp;
    @Column(name = "INTERNAL_LABEL")
    private String internalLabel;
    @Column(name = "EXTERNAL_LABEL")
    private String externalLabel;
    @Column(name = "DUNS_CODE")
    private String dunsCode;
    @Column(name = "NATIVE_LOB")
    private String nativeLob;
    @Column(name = "BACKEND_DB")
    private String backendDb;
    @Column(name = "PAPER_SUPPRESS_IND")
    private Character paperSuppressInd;
    @Column(name = "PAPER_SUPP_USER")
    private Double paperSuppUser;
    @Column(name = "BUYER_CODE")
    private String buyerCode;
    @Column(name = "REMIT_ACCT_IND")
    private Character remitAcctInd;
    @Column(name = "PAPER_CHARGE_CODE")
    private String paperChargeCode;
    @Column(name = "PAPER_CALL_DETAIL")
    private String paperCallDetail;
    @Column(name = "PAPER_OIR_STATUS")
    private String paperOirStatus;
    @Column(name = "ENTITY_CD")
    private String entityCd;
    @Column(name = "ACCNT_NAME")
    private String accntName;
    @Column(name = "PAP_CONTRACT_AMEND")
    private Character papContractAmend;
    @Column(name = "ENTP_ID")
    private Double entpId;
    @Column(name = "PAPER_SUPP_ELIG")
    private Character paperSuppElig;
    @Column(name = "SPLIT_BILL_IND")
    private Character splitBillInd;
    @Column(name = "SENSITIVITY_LVL")
    private String sensitivityLvl;
    @Column(name = "ROOT_ACCOUNT")
    private Character rootAccount;
    @Column(name = "CREDIT_CARD_IND")
    private Character creditCardInd;
    @Column(name = "MIXED_SVC_IND")
    private Character mixedSvcInd;
    @Column(name = "SV_BILLED_IND")
    private Character svBilledInd;
    @Column(name = "OPCO")
    private String opco;
    @Column(name = "REVLOC_ID")
    private String revlocId;
    @Column(name = "DOMESTIC_INDC")
    private Character domesticIndc;
    @Column(name = "PREFERRED_CURRENCY")
    private String preferredCurrency;
    @Column(name = "Q2C_FLAG")
    private Character q2cFlag;
    @Column(name = "BILL_FMT")
    private String billFmt;
    @Column(name = "PENDING_BILL_FMT")
    private String pendingBillFmt;
    @Column(name = "PREFERRED_LANG")
    private String preferredLang;
    @Column(name = "TAX_REG_NBR")
    private String taxRegNbr;
    @Column(name = "PREFER_CRC_OUTPUT")
    private Character preferCrcOutput;
    @Column(name = "PAYMENT_TERMS")
    private String paymentTerms;
    @Column(name = "ACCOUNT_CATEGORY")
    private String accountCategory;
    @Column(name = "ON_DEMAND_BILL_CYC")
    private Character onDemandBillCyc;
    @Column(name = "GSAM_SENSITIVITY_LVL")
    private String gsamSensitivityLvl;
    @Column(name = "AR_SYSTEM")
    private String arSystem;
    @Column(name = "CONF_IND")
    private Character confInd;
    @Column(name = "BILL_DAY")
    private Double billDay;
    @Column(name = "GCH_SENSITIVITY_LEVEL")
    private Character gchSensitivityLevel;

    public Subscription(){}

    @SpaceId
    public Double getSubscriptionOid() {
        return subscriptionOid;
    }

    public void setSubscriptionOid(Double subscriptionOid) {
        this.subscriptionOid = subscriptionOid;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceOrderNum() {
        return serviceOrderNum;
    }

    public void setServiceOrderNum(String serviceOrderNum) {
        this.serviceOrderNum = serviceOrderNum;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerAcctNum() {
        return customerAcctNum;
    }

    public void setCustomerAcctNum(String customerAcctNum) {
        this.customerAcctNum = customerAcctNum;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBackendSystem() {
        return backendSystem;
    }

    public void setBackendSystem(String backendSystem) {
        this.backendSystem = backendSystem;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getOrigSystemId() {
        return origSystemId;
    }

    public void setOrigSystemId(String origSystemId) {
        this.origSystemId = origSystemId;
    }

    public Date getKeyEffectiveDate() {
        return keyEffectiveDate;
    }

    public void setKeyEffectiveDate(Date keyEffectiveDate) {
        this.keyEffectiveDate = keyEffectiveDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
    }

    public Date getLastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(Date lastBillDate) {
        this.lastBillDate = lastBillDate;
    }

    public Date getNextBillDate() {
        return nextBillDate;
    }

    public void setNextBillDate(Date nextBillDate) {
        this.nextBillDate = nextBillDate;
    }

    public Double getUserId() {
        return userId;
    }

    public void setUserId(Double userId) {
        this.userId = userId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getInternalLabel() {
        return internalLabel;
    }

    public void setInternalLabel(String internalLabel) {
        this.internalLabel = internalLabel;
    }

    public String getExternalLabel() {
        return externalLabel;
    }

    public void setExternalLabel(String externalLabel) {
        this.externalLabel = externalLabel;
    }

    public String getDunsCode() {
        return dunsCode;
    }

    public void setDunsCode(String dunsCode) {
        this.dunsCode = dunsCode;
    }

    public String getNativeLob() {
        return nativeLob;
    }

    public void setNativeLob(String nativeLob) {
        this.nativeLob = nativeLob;
    }

    public String getBackendDb() {
        return backendDb;
    }

    public void setBackendDb(String backendDb) {
        this.backendDb = backendDb;
    }

    public Character getPaperSuppressInd() {
        return paperSuppressInd;
    }

    public void setPaperSuppressInd(Character paperSuppressInd) {
        this.paperSuppressInd = paperSuppressInd;
    }

    public Double getPaperSuppUser() {
        return paperSuppUser;
    }

    public void setPaperSuppUser(Double paperSuppUser) {
        this.paperSuppUser = paperSuppUser;
    }

    public String getBuyerCode() {
        return buyerCode;
    }

    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
    }

    public Character getRemitAcctInd() {
        return remitAcctInd;
    }

    public void setRemitAcctInd(Character remitAcctInd) {
        this.remitAcctInd = remitAcctInd;
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

    public String getPaperOirStatus() {
        return paperOirStatus;
    }

    public void setPaperOirStatus(String paperOirStatus) {
        this.paperOirStatus = paperOirStatus;
    }

    public String getEntityCd() {
        return entityCd;
    }

    public void setEntityCd(String entityCd) {
        this.entityCd = entityCd;
    }

    public String getAccntName() {
        return accntName;
    }

    public void setAccntName(String accntName) {
        this.accntName = accntName;
    }

    public Character getPapContractAmend() {
        return papContractAmend;
    }

    public void setPapContractAmend(Character papContractAmend) {
        this.papContractAmend = papContractAmend;
    }

    public Double getEntpId() {
        return entpId;
    }

    public void setEntpId(Double entpId) {
        this.entpId = entpId;
    }

    public Character getPaperSuppElig() {
        return paperSuppElig;
    }

    public void setPaperSuppElig(Character paperSuppElig) {
        this.paperSuppElig = paperSuppElig;
    }

    public Character getSplitBillInd() {
        return splitBillInd;
    }

    public void setSplitBillInd(Character splitBillInd) {
        this.splitBillInd = splitBillInd;
    }

    public String getSensitivityLvl() {
        return sensitivityLvl;
    }

    public void setSensitivityLvl(String sensitivityLvl) {
        this.sensitivityLvl = sensitivityLvl;
    }

    public Character getRootAccount() {
        return rootAccount;
    }

    public void setRootAccount(Character rootAccount) {
        this.rootAccount = rootAccount;
    }

    public Character getCreditCardInd() {
        return creditCardInd;
    }

    public void setCreditCardInd(Character creditCardInd) {
        this.creditCardInd = creditCardInd;
    }

    public Character getMixedSvcInd() {
        return mixedSvcInd;
    }

    public void setMixedSvcInd(Character mixedSvcInd) {
        this.mixedSvcInd = mixedSvcInd;
    }

    public Character getSvBilledInd() {
        return svBilledInd;
    }

    public void setSvBilledInd(Character svBilledInd) {
        this.svBilledInd = svBilledInd;
    }

    public String getOpco() {
        return opco;
    }

    public void setOpco(String opco) {
        this.opco = opco;
    }

    public String getRevlocId() {
        return revlocId;
    }

    public void setRevlocId(String revlocId) {
        this.revlocId = revlocId;
    }

    public Character getDomesticIndc() {
        return domesticIndc;
    }

    public void setDomesticIndc(Character domesticIndc) {
        this.domesticIndc = domesticIndc;
    }

    public String getPreferredCurrency() {
        return preferredCurrency;
    }

    public void setPreferredCurrency(String preferredCurrency) {
        this.preferredCurrency = preferredCurrency;
    }

    public Character getQ2cFlag() {
        return q2cFlag;
    }

    public void setQ2cFlag(Character q2cFlag) {
        this.q2cFlag = q2cFlag;
    }

    public String getBillFmt() {
        return billFmt;
    }

    public void setBillFmt(String billFmt) {
        this.billFmt = billFmt;
    }

    public String getPendingBillFmt() {
        return pendingBillFmt;
    }

    public void setPendingBillFmt(String pendingBillFmt) {
        this.pendingBillFmt = pendingBillFmt;
    }

    public String getPreferredLang() {
        return preferredLang;
    }

    public void setPreferredLang(String preferredLang) {
        this.preferredLang = preferredLang;
    }

    public String getTaxRegNbr() {
        return taxRegNbr;
    }

    public void setTaxRegNbr(String taxRegNbr) {
        this.taxRegNbr = taxRegNbr;
    }

    public Character getPreferCrcOutput() {
        return preferCrcOutput;
    }

    public void setPreferCrcOutput(Character preferCrcOutput) {
        this.preferCrcOutput = preferCrcOutput;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public String getAccountCategory() {
        return accountCategory;
    }

    public void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory;
    }

    public Character getOnDemandBillCyc() {
        return onDemandBillCyc;
    }

    public void setOnDemandBillCyc(Character onDemandBillCyc) {
        this.onDemandBillCyc = onDemandBillCyc;
    }

    public String getGsamSensitivityLvl() {
        return gsamSensitivityLvl;
    }

    public void setGsamSensitivityLvl(String gsamSensitivityLvl) {
        this.gsamSensitivityLvl = gsamSensitivityLvl;
    }

    public String getArSystem() {
        return arSystem;
    }

    public void setArSystem(String arSystem) {
        this.arSystem = arSystem;
    }

    public Character getConfInd() {
        return confInd;
    }

    public void setConfInd(Character confInd) {
        this.confInd = confInd;
    }

    public Double getBillDay() {
        return billDay;
    }

    public void setBillDay(Double billDay) {
        this.billDay = billDay;
    }

    public Character getGchSensitivityLevel() {
        return gchSensitivityLevel;
    }

    public void setGchSensitivityLevel(Character gchSensitivityLevel) {
        this.gchSensitivityLevel = gchSensitivityLevel;
    }
}
