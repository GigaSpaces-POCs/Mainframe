package com.gigaspaces.pojos;

import com.gigaspaces.annotation.pojo.*;
import com.gigaspaces.interfaces.*;
import com.gigaspaces.metadata.index.SpaceIndexType;

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
@Table(name = "BMGVZP.VZ450_6200_T")
@SpaceClass
public class Vz4506200T implements HasMan, HasManBillDate, HasBan, HasBillDate, HasOrigSystemId, HasVz450SeqNbr, HasAban {

    @EmbeddedId
    private Vz4506200TCompositeId vz4506200TCompositeId;

    @Column(name = "BAN")
    private String ban;
    @Column(name = "ABAN")
    private String aban;
    @Column(name = "BILL_DATE")
    private Date billDate;
    @Column(name = "WORKING_TEL_NBR")
    private String workingTelNbr;
    @Column(name = "STATE_CODE")
    private String stateCode;
    @Column(name = "ENTITY_CD")
    private String entityCd;
    @Column(name = "ENTITY_CD_ID")
    private Integer entityCdId;
    @Column(name = "INV_BILL_IND")
    private Character invBillInd;
    @Column(name = "ASSOC_CHG_CD")
    private String assocChgCd;
    @Column(name = "ASSOC_CHG_CD_ID")
    private Integer assocChgCdId;
    @Column(name = "CLASSIFICATION_CD")
    private Character classificationCd;
    @Column(name = "MODULE_IND")
    private Character moduleInd;
    @Column(name = "PRICING_PLAN_CD")
    private String pricingPlanCd;
    @Column(name = "PRICING_PLAN_CD_ID")
    private Integer pricingPlanCdId;
    @Column(name = "CUST_ID_DEPT_CD")
    private String custIdDeptCd;
    @Column(name = "CUST_ID_DEPT_CD_ID")
    private Integer custIdDeptCdId;
    @Column(name = "CUST_ID_CD")
    private String custIdCd;
    @Column(name = "CUST_ID_CD_ID")
    private Integer custIdCdId;
    @Column(name = "GLOBAL_REF_NBR")
    private Integer globalRefNbr;
    @Column(name = "SUB_CIC")
    private String subCic;
    @Column(name = "SUB_CIC_ID")
    private Integer subCicId;
    @Column(name = "BASIC_SVC_CD")
    private Character basicSvcCd;
    @Column(name = "ADJUST_LN_CD")
    private Character adjustLnCd;
    @Column(name = "TEXT_IND")
    private Character textInd;
    @Column(name = "DISPLAY_CD")
    private Character displayCd;
    @Column(name = "BILL_PAGE_NUMBER")
    private Integer billPageNumber;
    @Column(name = "ITEM_NUMBER")
    private Integer itemNumber;
    @Column(name = "REV_ID_CD")
    private Character revIdCd;
    @Column(name = "REV_ID")
    private String revId;
    @Column(name = "PAPER_BILL_IND")
    private Character paperBillInd;
    @Column(name = "ASSOC_BILL_SECT_CD")
    private String assocBillSectCd;
    @Column(name = "FIBER_LINE_CD")
    private Character fiberLineCd;
    @Column(name = "GROUP_ID")
    private String groupId;
    @Column(name = "SPECIAL_PROC_CD")
    private Character specialProcCd;
    @Column(name = "SPECIAL_REC_TYPE")
    private Character specialRecType;
    @Column(name = "SPECIAL_ORIG_CD")
    private Character specialOrigCd;
    @Column(name = "LOCATION_ID")
    private String locationId;
    @Column(name = "GRP_ID_1")
    private String grpId1;
    @Column(name = "GRP_ID_3")
    private String grpId3;
    @Column(name = "ID_OR_ACCTG_CD")
    private String idOrAcctgCd;
    @Column(name = "CALLING_CARD_NBR")
    private String callingCardNbr;
    @Column(name = "CONF_ID")
    private String confId;
    @Column(name = "USAGE_EVENT_DATE")
    private String usageEventDate;
    @Column(name = "CONNECT_TIME")
    private String connectTime;
    @Column(name = "USAGE_TYPE_IND")
    private String usageTypeInd;
    @Column(name = "BILLABLE_UNITS_FMT")
    private Character billableUnitsFmt;
    @Column(name = "BILLABLE_UNITS")
    private String billableUnits;
    @Column(name = "ORIG_NBR")
    private String origNbr;
    @Column(name = "ORIG_CITY_COUNTRY")
    private String origCityCountry;
    @Column(name = "ORIG_STATE")
    private String origState;
    @Column(name = "ORIG_COUNTRY_CD")
    private String origCountryCd;
    @Column(name = "TERM_NBR")
    private String termNbr;
    @Column(name = "TERM_CITY_COUNTRY")
    private String termCityCountry;
    @Column(name = "TERM_STATE")
    private String termState;
    @Column(name = "TERM_COUNTRY_CD")
    private String termCountryCd;
    @Column(name = "CHARGE_AMT")
    private Double chargeAmt;
    @Column(name = "PPHONE_USAGE_CHG")
    private Double pphoneUsageChg;
    @Column(name = "CHARGE_AMT_SUR")
    private Double chargeAmtSur;
    @Column(name = "TAX_AMT")
    private Double taxAmt;
    @Column(name = "DISCOUNT_AMT")
    private Double discountAmt;
    @Column(name = "INBND_OUTBND_IND")
    private Character inbndOutbndInd;
    @Column(name = "TOLLFREE_IND")
    private Character tollfreeInd;
    @Column(name = "BALANCING_IND")
    private Character balancingInd;
    @Column(name = "NETWK_ORIG_TERM_CD")
    private Character netwkOrigTermCd;
    @Column(name = "JURISDICTION_TX_CD")
    private Character jurisdictionTxCd;
    @Column(name = "PRICING_METHOD")
    private Character pricingMethod;
    @Column(name = "RATE_PERIOD")
    private String ratePeriod;
    @Column(name = "CALL_TYPE")
    private String callType;
    @Column(name = "BLOCK_FROM_DISP")
    private Character blockFromDisp;
    @Column(name = "ACCESS_CODE_CONF")
    private Character accessCodeConf;
    @Column(name = "CELLULAR_CALLS")
    private Character cellularCalls;
    @Column(name = "CELL_USAGE_TYPE")
    private Character cellUsageType;
    @Column(name = "CPN_IND")
    private Character cpnInd;
    @Column(name = "CCID")
    private Character ccid;
    @Column(name = "DATA_CALL_SPEED")
    private Character dataCallSpeed;
    @Column(name = "ADV_CARD_FEAT_CD")
    private Character advCardFeatCd;
    @Column(name = "ENHANCED_FEAT_CD")
    private Character enhancedFeatCd;
    @Column(name = "NCP_CODE")
    private Character ncpCode;
    @Column(name = "OP_ASSISTED_CODE")
    private Character opAssistedCode;
    @Column(name = "PRODUCT_FAMILY")
    private Character productFamily;
    @Column(name = "PRODUCT_ID_TYPE")
    private Character productIdType;
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Column(name = "PIC_DIRECTIONAL_CD")
    private Character picDirectionalCd;
    @Column(name = "PPHONE_INFO_DIGITS")
    private String pphoneInfoDigits;
    @Column(name = "SERVICE_METHOD")
    private Character serviceMethod;
    @Column(name = "USAGE_ENTITY_CD")
    private Character usageEntityCd;
    @Column(name = "TEXT_KEY_NBR1")
    private Integer textKeyNbr1;
    @Column(name = "TEXT_KEY_NBR2")
    private Integer textKeyNbr2;
    @Column(name = "TEXT_KEY_NBR3")
    private Integer textKeyNbr3;
    @Column(name = "DNIS_ID")
    private String dnisId;
    @Column(name = "NIVR_SIVR_IND")
    private Character nivrSivrInd;
    @Column(name = "SWITCH_CD")
    private String switchCd;
    @Column(name = "QTY")
    private String qty;
    @Column(name = "PLAT_MINS")
    private Double platMins;
    @Column(name = "PLAT_USAGE_CHG")
    private Double platUsageChg;
    @Column(name = "XPORT_USAGE_CHG")
    private Double xportUsageChg;
    @Column(name = "CALL_TAKEBK_COUNT")
    private Integer callTakebkCount;
    @Column(name = "MENU_ROUTING_COUNT")
    private Integer menuRoutingCount;
    @Column(name = "MSG_ANNOUNCE_COUNT")
    private Integer msgAnnounceCount;
    @Column(name = "DB_ROUTING_COUNT")
    private Integer dbRoutingCount;
    @Column(name = "BUSY_ACC_COUNT")
    private Integer busyAccCount;
    @Column(name = "TAKEBK_XFER_COUNT")
    private Integer takebk_xferCount;
    @Column(name = "CALING_CD_DISP_IND")
    private Character calingCdDispInd;
    @Column(name = "USAGE_SUB_CAT")
    private String usageSubCat;
    @Column(name = "ECR_LEGEND_CD")
    private String ecrLegendCd;
    @Column(name = "TRANSPORT_MINS")
    private Double transportMins;
    @Column(name = "QUEUING_MINS")
    private Double queuingMins;
    @Column(name = "QUEUING_USG_CHGS")
    private Double queuingUsgChgs;
    @Column(name = "ORIG_LATA")
    private Integer origLata;
    @Column(name = "TERM_LATA")
    private Integer termLata;
    @Column(name = "FREQ_CALL_NBR")
    private Integer freqCallNbr;
    @Column(name = "TOTAL_FREQ_CALLS")
    private Integer totalFreqCalls;
    @Column(name = "FREQ_TOTAL_AMT")
    private Double freqTotalAmt;
    @Column(name = "SVC_METHOD")
    private String svcMethod;
    @Column(name = "TRAFFIC_USE_CLASS")
    private Character trafficUseClass;
    @Column(name = "SUB_CLASS_ITEM")
    private Character subClassItem;
    @Column(name = "ORIG_CNTRY_CD_ID")
    private Integer origCntryCdId;
    @Column(name = "TERM_CNTRY_CD_ID")
    private Integer termCntryCdId;
    @Column(name = "GRP_ID_1_ID")
    private Integer grpId1Id;
    @Column(name = "GRP_ID_2_ID")
    private Integer grpId2Id;
    @Column(name = "GRP_ID_3_ID")
    private Integer grpId3Id;
    @Column(name = "PROJECT_NBR")
    private String projectNbr;
    @Column(name = "ACCT_CD_ID")
    private Integer acctCdId;
    @Column(name = "CONF_ID_ID")
    private Integer confIdId;
    @Column(name = "MOD_PHRASE_CD")
    private String modPhraseCd;
    @Column(name = "PRODUCT_ID_ID")
    private Integer productIdId;
    @Column(name = "CONN_ANNOUNCE_CNT")
    private Integer connAnnounceCnt;
    @Column(name = "CLI_USE_IND")
    private String cliUseInd;
    @Column(name = "CLI_NUM")
    private String cliNum;
    @Column(name = "DIAL_CODE")
    private String dialCode;
    @Column(name = "CCID_EMEA")
    private String ccidEmea;
    @Column(name = "EXTENSION")
    private String extension;
    @Column(name = "TERM_CITY_CNTRY")
    private String termCityCntry;
    @Column(name = "LINE_TYPE")
    private Character lineType;
    @Column(name = "COST_CENTER_CD")
    private String costCenterCd;
    @Column(name = "GRP_CD")
    private String grpCd;
    @Column(name = "DESCR_GRP")
    private String descrGrp;
    @Column(name = "MOD_PHRASE_CD_ID")
    private Integer modPhraseCdId;
    @Column(name = "NBR_ACCUMUL_RECS")
    private Integer nbrAccumulRecs;
    @Column(name = "USAGE_SUB_CAT_ID")
    private Integer usageSubCatId;
    @Column(name = "MODULE_046")
    private String module046;
    @Column(name = "MODULE_124")
    private String module124;
    @Column(name = "JURISDICTN_DISP_CD")
    private Character jurisdictnDispCd;
    @Column(name = "ECR_JURIS_DISP_CD")
    private Character ecrJurisDispCd;
    @Column(name = "MODULE_028")
    private String module028;
    @Column(name = "MODULE_065")
    private String module065;
    @Column(name = "MODULE_129")
    private String module129;
    @Column(name = "NETWRK_INGRES_IND")
    private Character netwrkIngresInd;
    @Column(name = "MOD_46_PTRS")
    private String mod46Ptrs;
    @Column(name = "MODULE_056")
    private String module056;
    @Column(name = "MODULE_094")
    private String module094;
    @Column(name = "INTL_RATE")
    private String intlRate;
    @Column(name = "INTL_DEST_GRP")
    private String intlDestGrp;
    @Column(name = "TF_CORP")
    private String tfCorp;
    @Column(name = "MODULE_066")
    private String module066;
    @Column(name = "M067_CODE_ID")
    private Integer m067CodeId;
    @Column(name = "M067_CODE_VALUE")
    private String m067Code_value;
    @Column(name = "M067_CODE_DESC_KEY")
    private Integer m067CodeDescKey;
    @Column(name = "ECR_ADDL_FEATURES")
    private Character ecrAddlFeatures;
    @Column(name = "MODULE_160")
    private String module160;
    @Column(name = "M045_PROD_LINE_ID")
    private String m045ProdLineId;
    @Column(name = "M045_PROD_ID_CD")
    private String m045ProdIdCd;
    @Column(name = "M045_PROD_LINE_ID_ID")
    private Integer m045ProdLineIdId;
    @Column(name = "M045_PROD_ID_CD_ID")
    private Integer m045ProdIdCdId;
    @Column(name = "BIN_FILE_SEQ_NBR")
    private Integer binFileSeqNbr;
    @Column(name = "M099_01")
    private String m099_01;
    @Column(name = "M099_02")
    private String m099_02;
    @Column(name = "MODULE_300")
    private String module300;
    @Column(name = "VAMLOAD_DATE")
    private Date vamloadDate;
    @Column(name = "MODULE_301")
    private String module301;

    public Vz4506200T(){}

    @SpaceIndex(type = SpaceIndexType.EQUAL)
    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    @SpaceIndex(type = SpaceIndexType.EQUAL)
    public String getAban() {
        return aban;
    }

    public void setAban(String aban) {
        this.aban = aban;
    }

    @SpaceIndex(type = SpaceIndexType.EQUAL)
    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getWorkingTelNbr() {
        return workingTelNbr;
    }

    public void setWorkingTelNbr(String workingTelNbr) {
        this.workingTelNbr = workingTelNbr;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getEntityCd() {
        return entityCd;
    }

    public void setEntityCd(String entityCd) {
        this.entityCd = entityCd;
    }

    public Integer getEntityCdId() {
        return entityCdId;
    }

    public void setEntityCdId(Integer entityCdId) {
        this.entityCdId = entityCdId;
    }

    public Character getInvBillInd() {
        return invBillInd;
    }

    public void setInvBillInd(Character invBillInd) {
        this.invBillInd = invBillInd;
    }

    public String getAssocChgCd() {
        return assocChgCd;
    }

    public void setAssocChgCd(String assocChgCd) {
        this.assocChgCd = assocChgCd;
    }

    public Integer getAssocChgCdId() {
        return assocChgCdId;
    }

    public void setAssocChgCdId(Integer assocChgCdId) {
        this.assocChgCdId = assocChgCdId;
    }

    public Character getClassificationCd() {
        return classificationCd;
    }

    public void setClassificationCd(Character classificationCd) {
        this.classificationCd = classificationCd;
    }

    public Character getModuleInd() {
        return moduleInd;
    }

    public void setModuleInd(Character moduleInd) {
        this.moduleInd = moduleInd;
    }

    public String getPricingPlanCd() {
        return pricingPlanCd;
    }

    public void setPricingPlanCd(String pricingPlanCd) {
        this.pricingPlanCd = pricingPlanCd;
    }

    public Integer getPricingPlanCdId() {
        return pricingPlanCdId;
    }

    public void setPricingPlanCdId(Integer pricingPlanCdId) {
        this.pricingPlanCdId = pricingPlanCdId;
    }

    public String getCustIdDeptCd() {
        return custIdDeptCd;
    }

    public void setCustIdDeptCd(String custIdDeptCd) {
        this.custIdDeptCd = custIdDeptCd;
    }

    public Integer getCustIdDeptCdId() {
        return custIdDeptCdId;
    }

    public void setCustIdDeptCdId(Integer custIdDeptCdId) {
        this.custIdDeptCdId = custIdDeptCdId;
    }

    public String getCustIdCd() {
        return custIdCd;
    }

    public void setCustIdCd(String custIdCd) {
        this.custIdCd = custIdCd;
    }

    public Integer getCustIdCdId() {
        return custIdCdId;
    }

    public void setCustIdCdId(Integer custIdCdId) {
        this.custIdCdId = custIdCdId;
    }

    public Integer getGlobalRefNbr() {
        return globalRefNbr;
    }

    public void setGlobalRefNbr(Integer globalRefNbr) {
        this.globalRefNbr = globalRefNbr;
    }

    public String getSubCic() {
        return subCic;
    }

    public void setSubCic(String subCic) {
        this.subCic = subCic;
    }

    public Integer getSubCicId() {
        return subCicId;
    }

    public void setSubCicId(Integer subCicId) {
        this.subCicId = subCicId;
    }

    public Character getBasicSvcCd() {
        return basicSvcCd;
    }

    public void setBasicSvcCd(Character basicSvcCd) {
        this.basicSvcCd = basicSvcCd;
    }

    public Character getAdjustLnCd() {
        return adjustLnCd;
    }

    public void setAdjustLnCd(Character adjustLnCd) {
        this.adjustLnCd = adjustLnCd;
    }

    public Character getTextInd() {
        return textInd;
    }

    public void setTextInd(Character textInd) {
        this.textInd = textInd;
    }

    public Character getDisplayCd() {
        return displayCd;
    }

    public void setDisplayCd(Character displayCd) {
        this.displayCd = displayCd;
    }

    public Integer getBillPageNumber() {
        return billPageNumber;
    }

    public void setBillPageNumber(Integer billPageNumber) {
        this.billPageNumber = billPageNumber;
    }

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Character getRevIdCd() {
        return revIdCd;
    }

    public void setRevIdCd(Character revIdCd) {
        this.revIdCd = revIdCd;
    }

    public String getRevId() {
        return revId;
    }

    public void setRevId(String revId) {
        this.revId = revId;
    }

    public Character getPaperBillInd() {
        return paperBillInd;
    }

    public void setPaperBillInd(Character paperBillInd) {
        this.paperBillInd = paperBillInd;
    }

    public String getAssocBillSectCd() {
        return assocBillSectCd;
    }

    public void setAssocBillSectCd(String assocBillSectCd) {
        this.assocBillSectCd = assocBillSectCd;
    }

    public Character getFiberLineCd() {
        return fiberLineCd;
    }

    public void setFiberLineCd(Character fiberLineCd) {
        this.fiberLineCd = fiberLineCd;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Character getSpecialProcCd() {
        return specialProcCd;
    }

    public void setSpecialProcCd(Character specialProcCd) {
        this.specialProcCd = specialProcCd;
    }

    public Character getSpecialRecType() {
        return specialRecType;
    }

    public void setSpecialRecType(Character specialRecType) {
        this.specialRecType = specialRecType;
    }

    public Character getSpecialOrigCd() {
        return specialOrigCd;
    }

    public void setSpecialOrigCd(Character specialOrigCd) {
        this.specialOrigCd = specialOrigCd;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getGrpId1() {
        return grpId1;
    }

    public void setGrpId1(String grpId1) {
        this.grpId1 = grpId1;
    }

    public String getGrpId3() {
        return grpId3;
    }

    public void setGrpId3(String grpId3) {
        this.grpId3 = grpId3;
    }

    public String getIdOrAcctgCd() {
        return idOrAcctgCd;
    }

    public void setIdOrAcctgCd(String idOrAcctgCd) {
        this.idOrAcctgCd = idOrAcctgCd;
    }

    public String getCallingCardNbr() {
        return callingCardNbr;
    }

    public void setCallingCardNbr(String callingCardNbr) {
        this.callingCardNbr = callingCardNbr;
    }

    public String getConfId() {
        return confId;
    }

    public void setConfId(String confId) {
        this.confId = confId;
    }

    public String getUsageEventDate() {
        return usageEventDate;
    }

    public void setUsageEventDate(String usageEventDate) {
        this.usageEventDate = usageEventDate;
    }

    public String getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(String connectTime) {
        this.connectTime = connectTime;
    }

    public String getUsageTypeInd() {
        return usageTypeInd;
    }

    public void setUsageTypeInd(String usageTypeInd) {
        this.usageTypeInd = usageTypeInd;
    }

    public Character getBillableUnitsFmt() {
        return billableUnitsFmt;
    }

    public void setBillableUnitsFmt(Character billableUnitsFmt) {
        this.billableUnitsFmt = billableUnitsFmt;
    }

    public String getBillableUnits() {
        return billableUnits;
    }

    public void setBillableUnits(String billableUnits) {
        this.billableUnits = billableUnits;
    }

    public String getOrigNbr() {
        return origNbr;
    }

    public void setOrigNbr(String origNbr) {
        this.origNbr = origNbr;
    }

    public String getOrigCityCountry() {
        return origCityCountry;
    }

    public void setOrigCityCountry(String origCityCountry) {
        this.origCityCountry = origCityCountry;
    }

    public String getOrigState() {
        return origState;
    }

    public void setOrigState(String origState) {
        this.origState = origState;
    }

    public String getOrigCountryCd() {
        return origCountryCd;
    }

    public void setOrigCountryCd(String origCountryCd) {
        this.origCountryCd = origCountryCd;
    }

    public String getTermNbr() {
        return termNbr;
    }

    public void setTermNbr(String termNbr) {
        this.termNbr = termNbr;
    }

    public String getTermCityCountry() {
        return termCityCountry;
    }

    public void setTermCityCountry(String termCityCountry) {
        this.termCityCountry = termCityCountry;
    }

    public String getTermState() {
        return termState;
    }

    public void setTermState(String termState) {
        this.termState = termState;
    }

    public String getTermCountryCd() {
        return termCountryCd;
    }

    public void setTermCountryCd(String termCountryCd) {
        this.termCountryCd = termCountryCd;
    }

    public Double getChargeAmt() {
        return chargeAmt;
    }

    public void setChargeAmt(Double chargeAmt) {
        this.chargeAmt = chargeAmt;
    }

    public Double getPphoneUsageChg() {
        return pphoneUsageChg;
    }

    public void setPphoneUsageChg(Double pphoneUsageChg) {
        this.pphoneUsageChg = pphoneUsageChg;
    }

    public Double getChargeAmtSur() {
        return chargeAmtSur;
    }

    public void setChargeAmtSur(Double chargeAmtSur) {
        this.chargeAmtSur = chargeAmtSur;
    }

    public Double getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Double getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(Double discountAmt) {
        this.discountAmt = discountAmt;
    }

    public Character getInbndOutbndInd() {
        return inbndOutbndInd;
    }

    public void setInbndOutbndInd(Character inbndOutbndInd) {
        this.inbndOutbndInd = inbndOutbndInd;
    }

    public Character getTollfreeInd() {
        return tollfreeInd;
    }

    public void setTollfreeInd(Character tollfreeInd) {
        this.tollfreeInd = tollfreeInd;
    }

    @SpaceIndex(type = SpaceIndexType.EQUAL)
    public Character getBalancingInd() {
        return balancingInd;
    }

    public void setBalancingInd(Character balancingInd) {
        this.balancingInd = balancingInd;
    }

    public Character getNetwkOrigTermCd() {
        return netwkOrigTermCd;
    }

    public void setNetwkOrigTermCd(Character netwkOrigTermCd) {
        this.netwkOrigTermCd = netwkOrigTermCd;
    }

    public Character getJurisdictionTxCd() {
        return jurisdictionTxCd;
    }

    public void setJurisdictionTxCd(Character jurisdictionTxCd) {
        this.jurisdictionTxCd = jurisdictionTxCd;
    }

    public Character getPricingMethod() {
        return pricingMethod;
    }

    public void setPricingMethod(Character pricingMethod) {
        this.pricingMethod = pricingMethod;
    }

    public String getRatePeriod() {
        return ratePeriod;
    }

    public void setRatePeriod(String ratePeriod) {
        this.ratePeriod = ratePeriod;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public Character getBlockFromDisp() {
        return blockFromDisp;
    }

    public void setBlockFromDisp(Character blockFromDisp) {
        this.blockFromDisp = blockFromDisp;
    }

    public Character getAccessCodeConf() {
        return accessCodeConf;
    }

    public void setAccessCodeConf(Character accessCodeConf) {
        this.accessCodeConf = accessCodeConf;
    }

    public Character getCellularCalls() {
        return cellularCalls;
    }

    public void setCellularCalls(Character cellularCalls) {
        this.cellularCalls = cellularCalls;
    }

    public Character getCellUsageType() {
        return cellUsageType;
    }

    public void setCellUsageType(Character cellUsageType) {
        this.cellUsageType = cellUsageType;
    }

    public Character getCpnInd() {
        return cpnInd;
    }

    public void setCpnInd(Character cpnInd) {
        this.cpnInd = cpnInd;
    }

    public Character getCcid() {
        return ccid;
    }

    public void setCcid(Character ccid) {
        this.ccid = ccid;
    }

    public Character getDataCallSpeed() {
        return dataCallSpeed;
    }

    public void setDataCallSpeed(Character dataCallSpeed) {
        this.dataCallSpeed = dataCallSpeed;
    }

    public Character getAdvCardFeatCd() {
        return advCardFeatCd;
    }

    public void setAdvCardFeatCd(Character advCardFeatCd) {
        this.advCardFeatCd = advCardFeatCd;
    }

    public Character getEnhancedFeatCd() {
        return enhancedFeatCd;
    }

    public void setEnhancedFeatCd(Character enhancedFeatCd) {
        this.enhancedFeatCd = enhancedFeatCd;
    }

    public Character getNcpCode() {
        return ncpCode;
    }

    public void setNcpCode(Character ncpCode) {
        this.ncpCode = ncpCode;
    }

    public Character getOpAssistedCode() {
        return opAssistedCode;
    }

    public void setOpAssistedCode(Character opAssistedCode) {
        this.opAssistedCode = opAssistedCode;
    }

    public Character getProductFamily() {
        return productFamily;
    }

    public void setProductFamily(Character productFamily) {
        this.productFamily = productFamily;
    }

    public Character getProductIdType() {
        return productIdType;
    }

    public void setProductIdType(Character productIdType) {
        this.productIdType = productIdType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Character getPicDirectionalCd() {
        return picDirectionalCd;
    }

    public void setPicDirectionalCd(Character picDirectionalCd) {
        this.picDirectionalCd = picDirectionalCd;
    }

    public String getPphoneInfoDigits() {
        return pphoneInfoDigits;
    }

    public void setPphoneInfoDigits(String pphoneInfoDigits) {
        this.pphoneInfoDigits = pphoneInfoDigits;
    }

    public Character getServiceMethod() {
        return serviceMethod;
    }

    public void setServiceMethod(Character serviceMethod) {
        this.serviceMethod = serviceMethod;
    }

    public Character getUsageEntityCd() {
        return usageEntityCd;
    }

    public void setUsageEntityCd(Character usageEntityCd) {
        this.usageEntityCd = usageEntityCd;
    }

    public Integer getTextKeyNbr1() {
        return textKeyNbr1;
    }

    public void setTextKeyNbr1(Integer textKeyNbr1) {
        this.textKeyNbr1 = textKeyNbr1;
    }

    public Integer getTextKeyNbr2() {
        return textKeyNbr2;
    }

    public void setTextKeyNbr2(Integer textKeyNbr2) {
        this.textKeyNbr2 = textKeyNbr2;
    }

    public Integer getTextKeyNbr3() {
        return textKeyNbr3;
    }

    public void setTextKeyNbr3(Integer textKeyNbr3) {
        this.textKeyNbr3 = textKeyNbr3;
    }

    public String getDnisId() {
        return dnisId;
    }

    public void setDnisId(String dnisId) {
        this.dnisId = dnisId;
    }

    public Character getNivrSivrInd() {
        return nivrSivrInd;
    }

    public void setNivrSivrInd(Character nivrSivrInd) {
        this.nivrSivrInd = nivrSivrInd;
    }

    public String getSwitchCd() {
        return switchCd;
    }

    public void setSwitchCd(String switchCd) {
        this.switchCd = switchCd;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public Double getPlatMins() {
        return platMins;
    }

    public void setPlatMins(Double platMins) {
        this.platMins = platMins;
    }

    public Double getPlatUsageChg() {
        return platUsageChg;
    }

    public void setPlatUsageChg(Double platUsageChg) {
        this.platUsageChg = platUsageChg;
    }

    public Double getXportUsageChg() {
        return xportUsageChg;
    }

    public void setXportUsageChg(Double xportUsageChg) {
        this.xportUsageChg = xportUsageChg;
    }

    public Integer getCallTakebkCount() {
        return callTakebkCount;
    }

    public void setCallTakebkCount(Integer callTakebkCount) {
        this.callTakebkCount = callTakebkCount;
    }

    public Integer getMenuRoutingCount() {
        return menuRoutingCount;
    }

    public void setMenuRoutingCount(Integer menuRoutingCount) {
        this.menuRoutingCount = menuRoutingCount;
    }

    public Integer getMsgAnnounceCount() {
        return msgAnnounceCount;
    }

    public void setMsgAnnounceCount(Integer msgAnnounceCount) {
        this.msgAnnounceCount = msgAnnounceCount;
    }

    public Integer getDbRoutingCount() {
        return dbRoutingCount;
    }

    public void setDbRoutingCount(Integer dbRoutingCount) {
        this.dbRoutingCount = dbRoutingCount;
    }

    public Integer getBusyAccCount() {
        return busyAccCount;
    }

    public void setBusyAccCount(Integer busyAccCount) {
        this.busyAccCount = busyAccCount;
    }

    public Integer getTakebk_xferCount() {
        return takebk_xferCount;
    }

    public void setTakebk_xferCount(Integer takebk_xferCount) {
        this.takebk_xferCount = takebk_xferCount;
    }

    public Character getCalingCdDispInd() {
        return calingCdDispInd;
    }

    public void setCalingCdDispInd(Character calingCdDispInd) {
        this.calingCdDispInd = calingCdDispInd;
    }

    public String getUsageSubCat() {
        return usageSubCat;
    }

    public void setUsageSubCat(String usageSubCat) {
        this.usageSubCat = usageSubCat;
    }

    public String getEcrLegendCd() {
        return ecrLegendCd;
    }

    public void setEcrLegendCd(String ecrLegendCd) {
        this.ecrLegendCd = ecrLegendCd;
    }

    public Double getTransportMins() {
        return transportMins;
    }

    public void setTransportMins(Double transportMins) {
        this.transportMins = transportMins;
    }

    public Double getQueuingMins() {
        return queuingMins;
    }

    public void setQueuingMins(Double queuingMins) {
        this.queuingMins = queuingMins;
    }

    public Double getQueuingUsgChgs() {
        return queuingUsgChgs;
    }

    public void setQueuingUsgChgs(Double queuingUsgChgs) {
        this.queuingUsgChgs = queuingUsgChgs;
    }

    public Integer getOrigLata() {
        return origLata;
    }

    public void setOrigLata(Integer origLata) {
        this.origLata = origLata;
    }

    public Integer getTermLata() {
        return termLata;
    }

    public void setTermLata(Integer termLata) {
        this.termLata = termLata;
    }

    public Integer getFreqCallNbr() {
        return freqCallNbr;
    }

    public void setFreqCallNbr(Integer freqCallNbr) {
        this.freqCallNbr = freqCallNbr;
    }

    public Integer getTotalFreqCalls() {
        return totalFreqCalls;
    }

    public void setTotalFreqCalls(Integer totalFreqCalls) {
        this.totalFreqCalls = totalFreqCalls;
    }

    public Double getFreqTotalAmt() {
        return freqTotalAmt;
    }

    public void setFreqTotalAmt(Double freqTotalAmt) {
        this.freqTotalAmt = freqTotalAmt;
    }

    public String getSvcMethod() {
        return svcMethod;
    }

    public void setSvcMethod(String svcMethod) {
        this.svcMethod = svcMethod;
    }

    public Character getTrafficUseClass() {
        return trafficUseClass;
    }

    public void setTrafficUseClass(Character trafficUseClass) {
        this.trafficUseClass = trafficUseClass;
    }

    public Character getSubClassItem() {
        return subClassItem;
    }

    public void setSubClassItem(Character subClassItem) {
        this.subClassItem = subClassItem;
    }

    public Integer getOrigCntryCdId() {
        return origCntryCdId;
    }

    public void setOrigCntryCdId(Integer origCntryCdId) {
        this.origCntryCdId = origCntryCdId;
    }

    public Integer getTermCntryCdId() {
        return termCntryCdId;
    }

    public void setTermCntryCdId(Integer termCntryCdId) {
        this.termCntryCdId = termCntryCdId;
    }

    public Integer getGrpId1Id() {
        return grpId1Id;
    }

    public void setGrpId1Id(Integer grpId1Id) {
        this.grpId1Id = grpId1Id;
    }

    public Integer getGrpId2Id() {
        return grpId2Id;
    }

    public void setGrpId2Id(Integer grpId2Id) {
        this.grpId2Id = grpId2Id;
    }

    public Integer getGrpId3Id() {
        return grpId3Id;
    }

    public void setGrpId3Id(Integer grpId3Id) {
        this.grpId3Id = grpId3Id;
    }

    public String getProjectNbr() {
        return projectNbr;
    }

    public void setProjectNbr(String projectNbr) {
        this.projectNbr = projectNbr;
    }

    public Integer getAcctCdId() {
        return acctCdId;
    }

    public void setAcctCdId(Integer acctCdId) {
        this.acctCdId = acctCdId;
    }

    public Integer getConfIdId() {
        return confIdId;
    }

    public void setConfIdId(Integer confIdId) {
        this.confIdId = confIdId;
    }

    public String getModPhraseCd() {
        return modPhraseCd;
    }

    public void setModPhraseCd(String modPhraseCd) {
        this.modPhraseCd = modPhraseCd;
    }

    public Integer getProductIdId() {
        return productIdId;
    }

    public void setProductIdId(Integer productIdId) {
        this.productIdId = productIdId;
    }

    public Integer getConnAnnounceCnt() {
        return connAnnounceCnt;
    }

    public void setConnAnnounceCnt(Integer connAnnounceCnt) {
        this.connAnnounceCnt = connAnnounceCnt;
    }

    public String getCliUseInd() {
        return cliUseInd;
    }

    public void setCliUseInd(String cliUseInd) {
        this.cliUseInd = cliUseInd;
    }

    public String getCliNum() {
        return cliNum;
    }

    public void setCliNum(String cliNum) {
        this.cliNum = cliNum;
    }

    public String getDialCode() {
        return dialCode;
    }

    public void setDialCode(String dialCode) {
        this.dialCode = dialCode;
    }

    public String getCcidEmea() {
        return ccidEmea;
    }

    public void setCcidEmea(String ccidEmea) {
        this.ccidEmea = ccidEmea;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getTermCityCntry() {
        return termCityCntry;
    }

    public void setTermCityCntry(String termCityCntry) {
        this.termCityCntry = termCityCntry;
    }

    public Character getLineType() {
        return lineType;
    }

    public void setLineType(Character lineType) {
        this.lineType = lineType;
    }

    public String getCostCenterCd() {
        return costCenterCd;
    }

    public void setCostCenterCd(String costCenterCd) {
        this.costCenterCd = costCenterCd;
    }

    public String getGrpCd() {
        return grpCd;
    }

    public void setGrpCd(String grpCd) {
        this.grpCd = grpCd;
    }

    public String getDescrGrp() {
        return descrGrp;
    }

    public void setDescrGrp(String descrGrp) {
        this.descrGrp = descrGrp;
    }

    public Integer getModPhraseCdId() {
        return modPhraseCdId;
    }

    public void setModPhraseCdId(Integer modPhraseCdId) {
        this.modPhraseCdId = modPhraseCdId;
    }

    public Integer getNbrAccumulRecs() {
        return nbrAccumulRecs;
    }

    public void setNbrAccumulRecs(Integer nbrAccumulRecs) {
        this.nbrAccumulRecs = nbrAccumulRecs;
    }

    public Integer getUsageSubCatId() {
        return usageSubCatId;
    }

    public void setUsageSubCatId(Integer usageSubCatId) {
        this.usageSubCatId = usageSubCatId;
    }

    public String getModule046() {
        return module046;
    }

    public void setModule046(String module046) {
        this.module046 = module046;
    }

    public String getModule124() {
        return module124;
    }

    public void setModule124(String module124) {
        this.module124 = module124;
    }

    public Character getJurisdictnDispCd() {
        return jurisdictnDispCd;
    }

    public void setJurisdictnDispCd(Character jurisdictnDispCd) {
        this.jurisdictnDispCd = jurisdictnDispCd;
    }

    public Character getEcrJurisDispCd() {
        return ecrJurisDispCd;
    }

    public void setEcrJurisDispCd(Character ecrJurisDispCd) {
        this.ecrJurisDispCd = ecrJurisDispCd;
    }

    public String getModule028() {
        return module028;
    }

    public void setModule028(String module028) {
        this.module028 = module028;
    }

    public String getModule065() {
        return module065;
    }

    public void setModule065(String module065) {
        this.module065 = module065;
    }

    public String getModule129() {
        return module129;
    }

    public void setModule129(String module129) {
        this.module129 = module129;
    }

    public Character getNetwrkIngresInd() {
        return netwrkIngresInd;
    }

    public void setNetwrkIngresInd(Character netwrkIngresInd) {
        this.netwrkIngresInd = netwrkIngresInd;
    }

    public String getMod46Ptrs() {
        return mod46Ptrs;
    }

    public void setMod46Ptrs(String mod46Ptrs) {
        this.mod46Ptrs = mod46Ptrs;
    }

    public String getModule056() {
        return module056;
    }

    public void setModule056(String module056) {
        this.module056 = module056;
    }

    public String getModule094() {
        return module094;
    }

    public void setModule094(String module094) {
        this.module094 = module094;
    }

    public String getIntlRate() {
        return intlRate;
    }

    public void setIntlRate(String intlRate) {
        this.intlRate = intlRate;
    }

    public String getIntlDestGrp() {
        return intlDestGrp;
    }

    public void setIntlDestGrp(String intlDestGrp) {
        this.intlDestGrp = intlDestGrp;
    }

    public String getTfCorp() {
        return tfCorp;
    }

    public void setTfCorp(String tfCorp) {
        this.tfCorp = tfCorp;
    }

    public String getModule066() {
        return module066;
    }

    public void setModule066(String module066) {
        this.module066 = module066;
    }

    public Integer getM067CodeId() {
        return m067CodeId;
    }

    public void setM067CodeId(Integer m067CodeId) {
        this.m067CodeId = m067CodeId;
    }

    public String getM067Code_value() {
        return m067Code_value;
    }

    public void setM067Code_value(String m067Code_value) {
        this.m067Code_value = m067Code_value;
    }

    public Integer getM067CodeDescKey() {
        return m067CodeDescKey;
    }

    public void setM067CodeDescKey(Integer m067CodeDescKey) {
        this.m067CodeDescKey = m067CodeDescKey;
    }

    public Character getEcrAddlFeatures() {
        return ecrAddlFeatures;
    }

    public void setEcrAddlFeatures(Character ecrAddlFeatures) {
        this.ecrAddlFeatures = ecrAddlFeatures;
    }

    public String getModule160() {
        return module160;
    }

    public void setModule160(String module160) {
        this.module160 = module160;
    }

    public String getM045ProdLineId() {
        return m045ProdLineId;
    }

    public void setM045ProdLineId(String m045ProdLineId) {
        this.m045ProdLineId = m045ProdLineId;
    }

    public String getM045ProdIdCd() {
        return m045ProdIdCd;
    }

    public void setM045ProdIdCd(String m045ProdIdCd) {
        this.m045ProdIdCd = m045ProdIdCd;
    }

    public Integer getM045ProdLineIdId() {
        return m045ProdLineIdId;
    }

    public void setM045ProdLineIdId(Integer m045ProdLineIdId) {
        this.m045ProdLineIdId = m045ProdLineIdId;
    }

    public Integer getM045ProdIdCdId() {
        return m045ProdIdCdId;
    }

    public void setM045ProdIdCdId(Integer m045ProdIdCdId) {
        this.m045ProdIdCdId = m045ProdIdCdId;
    }

    public Integer getBinFileSeqNbr() {
        return binFileSeqNbr;
    }

    public void setBinFileSeqNbr(Integer binFileSeqNbr) {
        this.binFileSeqNbr = binFileSeqNbr;
    }

    public String getM099_01() {
        return m099_01;
    }

    public void setM099_01(String m099_01) {
        this.m099_01 = m099_01;
    }

    public String getM099_02() {
        return m099_02;
    }

    public void setM099_02(String m099_02) {
        this.m099_02 = m099_02;
    }

    public String getModule300() {
        return module300;
    }

    public void setModule300(String module300) {
        this.module300 = module300;
    }

    public Date getVamloadDate() {
        return vamloadDate;
    }

    public void setVamloadDate(Date vamloadDate) {
        this.vamloadDate = vamloadDate;
    }

    public String getModule301() {
        return module301;
    }

    public void setModule301(String module301) {
        this.module301 = module301;
    }

    @SpaceId
    @SpaceIndexes({@SpaceIndex(path = "man", type = SpaceIndexType.EQUAL),
            @SpaceIndex(path = "manBillDate", type = SpaceIndexType.EQUAL),
            @SpaceIndex(path = "origSystemId", type = SpaceIndexType.EQUAL),
            @SpaceIndex(path = "grpId2", type = SpaceIndexType.EQUAL)})
    public Vz4506200TCompositeId getVz4506200TCompositeId() {
        return vz4506200TCompositeId;
    }

    public void setVz4506200TCompositeId(Vz4506200TCompositeId vz4506200TCompositeId) {
        this.vz4506200TCompositeId = vz4506200TCompositeId;
    }

    @Override
    public String getMan() {
        return vz4506200TCompositeId.getMan();
    }

    @Override
    public Date getManBillDate() {
        return vz4506200TCompositeId.getManBillDate();
    }

    @Override
    public String getOrigSystemId() {
        return vz4506200TCompositeId.getOrigSystemId();
    }

    @Override
    public Integer getVz450SeqNbr() {
        return vz4506200TCompositeId.getVz450SeqNbr();
    }
}
