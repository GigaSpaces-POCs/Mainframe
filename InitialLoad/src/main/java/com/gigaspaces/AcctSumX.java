package com.gigaspaces;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Denys_Novikov
 * Date: 15.08.2018
 */
@Entity
@Table(name="BMGVZS.ACCT_SUM_X2")
@SpaceClass
public class AcctSumX {

    @EmbeddedId
    private CompositeId compositeId;

    private String MAN;
    private String STATE_CODE;
    private String DEPT_CD;
    private String PAY_BY_DATE;
    private Float TOT_BILL_AMT;
    private Float PREV_BILL_AMT;
    private Float TOT_PAYS;
    private Float TOT_ADJS;
    private Float TRNSFR_AMT;
    private Float CURR_CHGS_MAN;
    private Float TOT_BILL_CHGS_BANS;
    private Float NET_PAST_DUE;
    private Float LATE_PAY_CHGS;
    private Float TOT_CURR_CHGS;
    private String PMTS_THRU_DATE;
    private Character SUMM_BILL_IND;
    private Character ACCT_STATUS_IND;
    private Character CLS_OF_SVC_TYPE;
    private Character HOLD_BILL_IND;
    private Character ARREARS_IND;
    private Float LATE_PAY_CHG_RATE;
    private Character TAX_STATUS_IND_FD;
    private Character TAX_STATUS_IND_ST;
    private Character TAX_STATUS_E911;
    private Character TAX_STATUS_SCHG;
    private Character TAX_STATUS_IND_LOC;
    private String TAR_CD_INFO;
    private String GEO_CD;
    private Character ACCT_TYPE_CD;
    private Float RESALE_DISC_AMT;
    private Float PACKAGE_DISC_AMT;
    private String ACCSUMXT_DAN;

    private String ACCT_NAME;
    private Integer ADDR_SEQ_NBR;
    private Integer TAR_CD_INFO_ID;
    private Character TXFER_TYPE;
    private Character TEXT_IND;
    private Integer BILL_PAGE_NUMBER;
    private Byte ITEM_NUMBER;
    private String CUST_ID_CD;
    private String CUST_ID_DEPT_CD;
    private Float TOT_CARR_CHGS;
    private Float COLL_REFER_AMT;
    private Character BILL_BASIS_CD;
    private Float AMT_PEND_LEGAL;
    private Float FUTURE_LPAY_RATE;
    private Float AMT_SUBJ_LPAY;
    private Character PAYM_OPT_CD;
    private Float PEND_LPAY_AMT;
    private Float TOLL_CAP_AMT;
    private String CUSTOMER_PIN;
    private Float TRANSFER_PAST_CHGS;
    private String RAO;
    private Character CLASSIFICATION_CD;
    private Character NBBE_CODE;
    private String COMPANY_CODE;
    private Integer END_VZ450_SEQ_NBR;
    private Integer CUST_ID_CD_ID;
    private Integer CUST_ID_DEPT_CD_ID;
    private Integer PAYMADDT_SEQ_NBR;
    private Integer TEXT1_SEQ_NBR;
    private Integer TEXT2_SEQ_NBR;
    private Character ADDL_TEXT_IND;
    private Character FIBER_ACCT_CD;
    private String SUB_CIC;
    private Character COMP_SVC_TYPE;
    private String ISRT_CD;
    private Character ISRT_STATION;
    private Float ISRT_WEIGHT;
    private String CHK_DIGIT_NBR;
    private Character CHK_ACCEPT_IND;
    private String BILL_LINE_ID;
    private Character ACCT_ASSOC_CD;
    private Character ACCT_SYSTEM_ID;
    private String CLSSVC_USOC;
    private String REV_BOOK_CD;
    private Character MERGE_FMT_IND;
    private Character SPEC_REC_ORIG_CD;
    private String ENTITY_CD;
    private String CHANNEL_CD;
    private String NATL_ACCT_ID;
    private String LEGACY_ACCT_ID;
    private Character INV_BILL_IND;
    private String INVOICE_NBR;
    private Integer TEXT_KEY_NBR1;
    private Integer TEXT_KEY_NBR2;
    private Integer TEXT_KEY_NBR3;
    private String IMMEDIATE_MAN;
    private Character RECORD_LEVEL;
    private Character REMIT_ACCT_IND;
    private Character LDEP_IND;
    private String ORG_LEVEL1_CD;
    private String ORG_LEVEL2_CD;
    private Character FREQUENCY;
    private String BILL_CURR;
    private String CONV_CURR;
    private String REGION_CD;
    private String INVOICE_SERIES_NBR;
    private Character COST_CNTR_IND;
    private String WIRELESS_DAN;
    private String MASTER_CHANNEL_CD;
    private String MODULE_084;
    private String OPCO;
    private String MODULE_087;
    private Character SPEC_PROC_CD;
    private String WCAS_TAX_CAT;
    private String MODULE_302;

    public AcctSumX(){}

    public String getMAN() {
        return MAN;
    }

    public void setMAN(String MAN) {
        this.MAN = MAN;
    }


    public String getSTATE_CODE() {
        return STATE_CODE;
    }

    public void setSTATE_CODE(String STATE_CODE) {
        this.STATE_CODE = STATE_CODE;
    }


    public String getDEPT_CD() {
        return DEPT_CD;
    }

    public void setDEPT_CD(String DEPT_CD) {
        this.DEPT_CD = DEPT_CD;
    }

    public String getPAY_BY_DATE() {
        return PAY_BY_DATE;
    }

    public void setPAY_BY_DATE(String PAY_BY_DATE) {
        this.PAY_BY_DATE = PAY_BY_DATE;
    }

    public Float getTOT_BILL_AMT() {
        return TOT_BILL_AMT;
    }

    public void setTOT_BILL_AMT(Float TOT_BILL_AMT) {
        this.TOT_BILL_AMT = TOT_BILL_AMT;
    }

    public Float getPREV_BILL_AMT() {
        return PREV_BILL_AMT;
    }

    public void setPREV_BILL_AMT(Float PREV_BILL_AMT) {
        this.PREV_BILL_AMT = PREV_BILL_AMT;
    }

    public Float getTOT_PAYS() {
        return TOT_PAYS;
    }

    public void setTOT_PAYS(Float TOT_PAYS) {
        this.TOT_PAYS = TOT_PAYS;
    }

    public Float getTOT_ADJS() {
        return TOT_ADJS;
    }

    public void setTOT_ADJS(Float TOT_ADJS) {
        this.TOT_ADJS = TOT_ADJS;
    }

    public Float getTRNSFR_AMT() {
        return TRNSFR_AMT;
    }

    public void setTRNSFR_AMT(Float TRNSFR_AMT) {
        this.TRNSFR_AMT = TRNSFR_AMT;
    }

    public Float getCURR_CHGS_MAN() {
        return CURR_CHGS_MAN;
    }

    public void setCURR_CHGS_MAN(Float CURR_CHGS_MAN) {
        this.CURR_CHGS_MAN = CURR_CHGS_MAN;
    }

    public Float getTOT_BILL_CHGS_BANS() {
        return TOT_BILL_CHGS_BANS;
    }

    public void setTOT_BILL_CHGS_BANS(Float TOT_BILL_CHGS_BANS) {
        this.TOT_BILL_CHGS_BANS = TOT_BILL_CHGS_BANS;
    }

    public Float getNET_PAST_DUE() {
        return NET_PAST_DUE;
    }

    public void setNET_PAST_DUE(Float NET_PAST_DUE) {
        this.NET_PAST_DUE = NET_PAST_DUE;
    }

    public Float getLATE_PAY_CHGS() {
        return LATE_PAY_CHGS;
    }

    public void setLATE_PAY_CHGS(Float LATE_PAY_CHGS) {
        this.LATE_PAY_CHGS = LATE_PAY_CHGS;
    }

    public Float getTOT_CURR_CHGS() {
        return TOT_CURR_CHGS;
    }

    public void setTOT_CURR_CHGS(Float TOT_CURR_CHGS) {
        this.TOT_CURR_CHGS = TOT_CURR_CHGS;
    }

    public String getPMTS_THRU_DATE() {
        return PMTS_THRU_DATE;
    }

    public void setPMTS_THRU_DATE(String PMTS_THRU_DATE) {
        this.PMTS_THRU_DATE = PMTS_THRU_DATE;
    }

    public Character getSUMM_BILL_IND() {
        return SUMM_BILL_IND;
    }

    public void setSUMM_BILL_IND(Character SUMM_BILL_IND) {
        this.SUMM_BILL_IND = SUMM_BILL_IND;
    }

    public Character getACCT_STATUS_IND() {
        return ACCT_STATUS_IND;
    }

    public void setACCT_STATUS_IND(Character ACCT_STATUS_IND) {
        this.ACCT_STATUS_IND = ACCT_STATUS_IND;
    }

    public Character getCLS_OF_SVC_TYPE() {
        return CLS_OF_SVC_TYPE;
    }

    public void setCLS_OF_SVC_TYPE(Character CLS_OF_SVC_TYPE) {
        this.CLS_OF_SVC_TYPE = CLS_OF_SVC_TYPE;
    }

    public Character getHOLD_BILL_IND() {
        return HOLD_BILL_IND;
    }

    public void setHOLD_BILL_IND(Character HOLD_BILL_IND) {
        this.HOLD_BILL_IND = HOLD_BILL_IND;
    }

    public Character getARREARS_IND() {
        return ARREARS_IND;
    }

    public void setARREARS_IND(Character ARREARS_IND) {
        this.ARREARS_IND = ARREARS_IND;
    }

    public Float getLATE_PAY_CHG_RATE() {
        return LATE_PAY_CHG_RATE;
    }

    public void setLATE_PAY_CHG_RATE(Float LATE_PAY_CHG_RATE) {
        this.LATE_PAY_CHG_RATE = LATE_PAY_CHG_RATE;
    }

    public Character getTAX_STATUS_IND_FD() {
        return TAX_STATUS_IND_FD;
    }

    public void setTAX_STATUS_IND_FD(Character TAX_STATUS_IND_FD) {
        this.TAX_STATUS_IND_FD = TAX_STATUS_IND_FD;
    }

    public Character getTAX_STATUS_IND_ST() {
        return TAX_STATUS_IND_ST;
    }

    public void setTAX_STATUS_IND_ST(Character TAX_STATUS_IND_ST) {
        this.TAX_STATUS_IND_ST = TAX_STATUS_IND_ST;
    }

    public Character getTAX_STATUS_E911() {
        return TAX_STATUS_E911;
    }

    public void setTAX_STATUS_E911(Character TAX_STATUS_E911) {
        this.TAX_STATUS_E911 = TAX_STATUS_E911;
    }

    public Character getTAX_STATUS_SCHG() {
        return TAX_STATUS_SCHG;
    }

    public void setTAX_STATUS_SCHG(Character TAX_STATUS_SCHG) {
        this.TAX_STATUS_SCHG = TAX_STATUS_SCHG;
    }

    public Character getTAX_STATUS_IND_LOC() {
        return TAX_STATUS_IND_LOC;
    }

    public void setTAX_STATUS_IND_LOC(Character TAX_STATUS_IND_LOC) {
        this.TAX_STATUS_IND_LOC = TAX_STATUS_IND_LOC;
    }

    public String getTAR_CD_INFO() {
        return TAR_CD_INFO;
    }

    public void setTAR_CD_INFO(String TAR_CD_INFO) {
        this.TAR_CD_INFO = TAR_CD_INFO;
    }

    public String getGEO_CD() {
        return GEO_CD;
    }

    public void setGEO_CD(String GEO_CD) {
        this.GEO_CD = GEO_CD;
    }

    public Character getACCT_TYPE_CD() {
        return ACCT_TYPE_CD;
    }

    public void setACCT_TYPE_CD(Character ACCT_TYPE_CD) {
        this.ACCT_TYPE_CD = ACCT_TYPE_CD;
    }

    public Float getRESALE_DISC_AMT() {
        return RESALE_DISC_AMT;
    }

    public void setRESALE_DISC_AMT(Float RESALE_DISC_AMT) {
        this.RESALE_DISC_AMT = RESALE_DISC_AMT;
    }

    public Float getPACKAGE_DISC_AMT() {
        return PACKAGE_DISC_AMT;
    }

    public void setPACKAGE_DISC_AMT(Float PACKAGE_DISC_AMT) {
        this.PACKAGE_DISC_AMT = PACKAGE_DISC_AMT;
    }

    public String getACCSUMXT_DAN() {
        return ACCSUMXT_DAN;
    }

    public void setACCSUMXT_DAN(String ACCSUMXT_DAN) {
        this.ACCSUMXT_DAN = ACCSUMXT_DAN;
    }

    public String getACCT_NAME() {
        return ACCT_NAME;
    }

    public void setACCT_NAME(String ACCT_NAME) {
        this.ACCT_NAME = ACCT_NAME;
    }

    public Integer getADDR_SEQ_NBR() {
        return ADDR_SEQ_NBR;
    }

    public void setADDR_SEQ_NBR(Integer ADDR_SEQ_NBR) {
        this.ADDR_SEQ_NBR = ADDR_SEQ_NBR;
    }

    public Integer getTAR_CD_INFO_ID() {
        return TAR_CD_INFO_ID;
    }

    public void setTAR_CD_INFO_ID(Integer TAR_CD_INFO_ID) {
        this.TAR_CD_INFO_ID = TAR_CD_INFO_ID;
    }


    public Character getTXFER_TYPE() {
        return TXFER_TYPE;
    }

    public void setTXFER_TYPE(Character TXFER_TYPE) {
        this.TXFER_TYPE = TXFER_TYPE;
    }

    public Character getTEXT_IND() {
        return TEXT_IND;
    }

    public void setTEXT_IND(Character TEXT_IND) {
        this.TEXT_IND = TEXT_IND;
    }

    public Integer getBILL_PAGE_NUMBER() {
        return BILL_PAGE_NUMBER;
    }

    public void setBILL_PAGE_NUMBER(Integer BILL_PAGE_NUMBER) {
        this.BILL_PAGE_NUMBER = BILL_PAGE_NUMBER;
    }

    public Byte getITEM_NUMBER() {
        return ITEM_NUMBER;
    }

    public void setITEM_NUMBER(Byte ITEM_NUMBER) {
        this.ITEM_NUMBER = ITEM_NUMBER;
    }

    public String getCUST_ID_CD() {
        return CUST_ID_CD;
    }

    public void setCUST_ID_CD(String CUST_ID_CD) {
        this.CUST_ID_CD = CUST_ID_CD;
    }

    public String getCUST_ID_DEPT_CD() {
        return CUST_ID_DEPT_CD;
    }

    public void setCUST_ID_DEPT_CD(String CUST_ID_DEPT_CD) {
        this.CUST_ID_DEPT_CD = CUST_ID_DEPT_CD;
    }

    public Float getTOT_CARR_CHGS() {
        return TOT_CARR_CHGS;
    }

    public void setTOT_CARR_CHGS(Float TOT_CARR_CHGS) {
        this.TOT_CARR_CHGS = TOT_CARR_CHGS;
    }

    public Float getCOLL_REFER_AMT() {
        return COLL_REFER_AMT;
    }

    public void setCOLL_REFER_AMT(Float COLL_REFER_AMT) {
        this.COLL_REFER_AMT = COLL_REFER_AMT;
    }

    public Character getBILL_BASIS_CD() {
        return BILL_BASIS_CD;
    }

    public void setBILL_BASIS_CD(Character BILL_BASIS_CD) {
        this.BILL_BASIS_CD = BILL_BASIS_CD;
    }

    public Float getAMT_PEND_LEGAL() {
        return AMT_PEND_LEGAL;
    }

    public void setAMT_PEND_LEGAL(Float AMT_PEND_LEGAL) {
        this.AMT_PEND_LEGAL = AMT_PEND_LEGAL;
    }

    public Float getFUTURE_LPAY_RATE() {
        return FUTURE_LPAY_RATE;
    }

    public void setFUTURE_LPAY_RATE(Float FUTURE_LPAY_RATE) {
        this.FUTURE_LPAY_RATE = FUTURE_LPAY_RATE;
    }

    public Float getAMT_SUBJ_LPAY() {
        return AMT_SUBJ_LPAY;
    }

    public void setAMT_SUBJ_LPAY(Float AMT_SUBJ_LPAY) {
        this.AMT_SUBJ_LPAY = AMT_SUBJ_LPAY;
    }

    public Character getPAYM_OPT_CD() {
        return PAYM_OPT_CD;
    }

    public void setPAYM_OPT_CD(Character PAYM_OPT_CD) {
        this.PAYM_OPT_CD = PAYM_OPT_CD;
    }

    public Float getPEND_LPAY_AMT() {
        return PEND_LPAY_AMT;
    }

    public void setPEND_LPAY_AMT(Float PEND_LPAY_AMT) {
        this.PEND_LPAY_AMT = PEND_LPAY_AMT;
    }

    public Float getTOLL_CAP_AMT() {
        return TOLL_CAP_AMT;
    }

    public void setTOLL_CAP_AMT(Float TOLL_CAP_AMT) {
        this.TOLL_CAP_AMT = TOLL_CAP_AMT;
    }

    public String getCUSTOMER_PIN() {
        return CUSTOMER_PIN;
    }

    public void setCUSTOMER_PIN(String CUSTOMER_PIN) {
        this.CUSTOMER_PIN = CUSTOMER_PIN;
    }

    public Float getTRANSFER_PAST_CHGS() {
        return TRANSFER_PAST_CHGS;
    }

    public void setTRANSFER_PAST_CHGS(Float TRANSFER_PAST_CHGS) {
        this.TRANSFER_PAST_CHGS = TRANSFER_PAST_CHGS;
    }

    public String getRAO() {
        return RAO;
    }

    public void setRAO(String RAO) {
        this.RAO = RAO;
    }

    public Character getCLASSIFICATION_CD() {
        return CLASSIFICATION_CD;
    }

    public void setCLASSIFICATION_CD(Character CLASSIFICATION_CD) {
        this.CLASSIFICATION_CD = CLASSIFICATION_CD;
    }

    public Character getNBBE_CODE() {
        return NBBE_CODE;
    }

    public void setNBBE_CODE(Character NBBE_CODE) {
        this.NBBE_CODE = NBBE_CODE;
    }

    public String getCOMPANY_CODE() {
        return COMPANY_CODE;
    }

    public void setCOMPANY_CODE(String COMPANY_CODE) {
        this.COMPANY_CODE = COMPANY_CODE;
    }

    public Integer getEND_VZ450_SEQ_NBR() {
        return END_VZ450_SEQ_NBR;
    }

    public void setEND_VZ450_SEQ_NBR(Integer END_VZ450_SEQ_NBR) {
        this.END_VZ450_SEQ_NBR = END_VZ450_SEQ_NBR;
    }


    public Integer getCUST_ID_CD_ID() {
        return CUST_ID_CD_ID;
    }

    public void setCUST_ID_CD_ID(Integer CUST_ID_CD_ID) {
        this.CUST_ID_CD_ID = CUST_ID_CD_ID;
    }

    public Integer getCUST_ID_DEPT_CD_ID() {
        return CUST_ID_DEPT_CD_ID;
    }

    public void setCUST_ID_DEPT_CD_ID(Integer CUST_ID_DEPT_CD_ID) {
        this.CUST_ID_DEPT_CD_ID = CUST_ID_DEPT_CD_ID;
    }

    public Integer getPAYMADDT_SEQ_NBR() {
        return PAYMADDT_SEQ_NBR;
    }

    public void setPAYMADDT_SEQ_NBR(Integer PAYMADDT_SEQ_NBR) {
        this.PAYMADDT_SEQ_NBR = PAYMADDT_SEQ_NBR;
    }

    public Integer getTEXT1_SEQ_NBR() {
        return TEXT1_SEQ_NBR;
    }

    public void setTEXT1_SEQ_NBR(Integer TEXT1_SEQ_NBR) {
        this.TEXT1_SEQ_NBR = TEXT1_SEQ_NBR;
    }

    public Integer getTEXT2_SEQ_NBR() {
        return TEXT2_SEQ_NBR;
    }

    public void setTEXT2_SEQ_NBR(Integer TEXT2_SEQ_NBR) {
        this.TEXT2_SEQ_NBR = TEXT2_SEQ_NBR;
    }

    public Character getADDL_TEXT_IND() {
        return ADDL_TEXT_IND;
    }

    public void setADDL_TEXT_IND(Character ADDL_TEXT_IND) {
        this.ADDL_TEXT_IND = ADDL_TEXT_IND;
    }

    public Character getFIBER_ACCT_CD() {
        return FIBER_ACCT_CD;
    }

    public void setFIBER_ACCT_CD(Character FIBER_ACCT_CD) {
        this.FIBER_ACCT_CD = FIBER_ACCT_CD;
    }

    public String getSUB_CIC() {
        return SUB_CIC;
    }

    public void setSUB_CIC(String SUB_CIC) {
        this.SUB_CIC = SUB_CIC;
    }

    public Character getCOMP_SVC_TYPE() {
        return COMP_SVC_TYPE;
    }

    public void setCOMP_SVC_TYPE(Character COMP_SVC_TYPE) {
        this.COMP_SVC_TYPE = COMP_SVC_TYPE;
    }

    public String getISRT_CD() {
        return ISRT_CD;
    }

    public void setISRT_CD(String ISRT_CD) {
        this.ISRT_CD = ISRT_CD;
    }

    public Character getISRT_STATION() {
        return ISRT_STATION;
    }

    public void setISRT_STATION(Character ISRT_STATION) {
        this.ISRT_STATION = ISRT_STATION;
    }

    public Float getISRT_WEIGHT() {
        return ISRT_WEIGHT;
    }

    public void setISRT_WEIGHT(Float ISRT_WEIGHT) {
        this.ISRT_WEIGHT = ISRT_WEIGHT;
    }

    public String getCHK_DIGIT_NBR() {
        return CHK_DIGIT_NBR;
    }

    public void setCHK_DIGIT_NBR(String CHK_DIGIT_NBR) {
        this.CHK_DIGIT_NBR = CHK_DIGIT_NBR;
    }

    public Character getCHK_ACCEPT_IND() {
        return CHK_ACCEPT_IND;
    }

    public void setCHK_ACCEPT_IND(Character CHK_ACCEPT_IND) {
        this.CHK_ACCEPT_IND = CHK_ACCEPT_IND;
    }

    public String getBILL_LINE_ID() {
        return BILL_LINE_ID;
    }

    public void setBILL_LINE_ID(String BILL_LINE_ID) {
        this.BILL_LINE_ID = BILL_LINE_ID;
    }

    public Character getACCT_ASSOC_CD() {
        return ACCT_ASSOC_CD;
    }

    public void setACCT_ASSOC_CD(Character ACCT_ASSOC_CD) {
        this.ACCT_ASSOC_CD = ACCT_ASSOC_CD;
    }

    public Character getACCT_SYSTEM_ID() {
        return ACCT_SYSTEM_ID;
    }

    public void setACCT_SYSTEM_ID(Character ACCT_SYSTEM_ID) {
        this.ACCT_SYSTEM_ID = ACCT_SYSTEM_ID;
    }

    public String getCLSSVC_USOC() {
        return CLSSVC_USOC;
    }

    public void setCLSSVC_USOC(String CLSSVC_USOC) {
        this.CLSSVC_USOC = CLSSVC_USOC;
    }

    public String getREV_BOOK_CD() {
        return REV_BOOK_CD;
    }

    public void setREV_BOOK_CD(String REV_BOOK_CD) {
        this.REV_BOOK_CD = REV_BOOK_CD;
    }

    public Character getMERGE_FMT_IND() {
        return MERGE_FMT_IND;
    }

    public void setMERGE_FMT_IND(Character MERGE_FMT_IND) {
        this.MERGE_FMT_IND = MERGE_FMT_IND;
    }

    public Character getSPEC_REC_ORIG_CD() {
        return SPEC_REC_ORIG_CD;
    }

    public void setSPEC_REC_ORIG_CD(Character SPEC_REC_ORIG_CD) {
        this.SPEC_REC_ORIG_CD = SPEC_REC_ORIG_CD;
    }

    public String getENTITY_CD() {
        return ENTITY_CD;
    }

    public void setENTITY_CD(String ENTITY_CD) {
        this.ENTITY_CD = ENTITY_CD;
    }

    public String getCHANNEL_CD() {
        return CHANNEL_CD;
    }

    public void setCHANNEL_CD(String CHANNEL_CD) {
        this.CHANNEL_CD = CHANNEL_CD;
    }

    public String getNATL_ACCT_ID() {
        return NATL_ACCT_ID;
    }

    public void setNATL_ACCT_ID(String NATL_ACCT_ID) {
        this.NATL_ACCT_ID = NATL_ACCT_ID;
    }

    public String getLEGACY_ACCT_ID() {
        return LEGACY_ACCT_ID;
    }

    public void setLEGACY_ACCT_ID(String LEGACY_ACCT_ID) {
        this.LEGACY_ACCT_ID = LEGACY_ACCT_ID;
    }

    public Character getINV_BILL_IND() {
        return INV_BILL_IND;
    }

    public void setINV_BILL_IND(Character INV_BILL_IND) {
        this.INV_BILL_IND = INV_BILL_IND;
    }

    public String getINVOICE_NBR() {
        return INVOICE_NBR;
    }

    public void setINVOICE_NBR(String INVOICE_NBR) {
        this.INVOICE_NBR = INVOICE_NBR;
    }

    public Integer getTEXT_KEY_NBR1() {
        return TEXT_KEY_NBR1;
    }

    public void setTEXT_KEY_NBR1(Integer TEXT_KEY_NBR1) {
        this.TEXT_KEY_NBR1 = TEXT_KEY_NBR1;
    }

    public Integer getTEXT_KEY_NBR2() {
        return TEXT_KEY_NBR2;
    }

    public void setTEXT_KEY_NBR2(Integer TEXT_KEY_NBR2) {
        this.TEXT_KEY_NBR2 = TEXT_KEY_NBR2;
    }

    public Integer getTEXT_KEY_NBR3() {
        return TEXT_KEY_NBR3;
    }

    public void setTEXT_KEY_NBR3(Integer TEXT_KEY_NBR3) {
        this.TEXT_KEY_NBR3 = TEXT_KEY_NBR3;
    }

    public String getIMMEDIATE_MAN() {
        return IMMEDIATE_MAN;
    }

    public void setIMMEDIATE_MAN(String IMMEDIATE_MAN) {
        this.IMMEDIATE_MAN = IMMEDIATE_MAN;
    }

    public Character getRECORD_LEVEL() {
        return RECORD_LEVEL;
    }

    public void setRECORD_LEVEL(Character RECORD_LEVEL) {
        this.RECORD_LEVEL = RECORD_LEVEL;
    }

    public Character getREMIT_ACCT_IND() {
        return REMIT_ACCT_IND;
    }

    public void setREMIT_ACCT_IND(Character REMIT_ACCT_IND) {
        this.REMIT_ACCT_IND = REMIT_ACCT_IND;
    }

    public Character getLDEP_IND() {
        return LDEP_IND;
    }

    public void setLDEP_IND(Character LDEP_IND) {
        this.LDEP_IND = LDEP_IND;
    }

    public String getORG_LEVEL1_CD() {
        return ORG_LEVEL1_CD;
    }

    public void setORG_LEVEL1_CD(String ORG_LEVEL1_CD) {
        this.ORG_LEVEL1_CD = ORG_LEVEL1_CD;
    }

    public String getORG_LEVEL2_CD() {
        return ORG_LEVEL2_CD;
    }

    public void setORG_LEVEL2_CD(String ORG_LEVEL2_CD) {
        this.ORG_LEVEL2_CD = ORG_LEVEL2_CD;
    }

    public Character getFREQUENCY() {
        return FREQUENCY;
    }

    public void setFREQUENCY(Character FREQUENCY) {
        this.FREQUENCY = FREQUENCY;
    }

    public String getBILL_CURR() {
        return BILL_CURR;
    }

    public void setBILL_CURR(String BILL_CURR) {
        this.BILL_CURR = BILL_CURR;
    }

    public String getCONV_CURR() {
        return CONV_CURR;
    }

    public void setCONV_CURR(String CONV_CURR) {
        this.CONV_CURR = CONV_CURR;
    }

    public String getREGION_CD() {
        return REGION_CD;
    }

    public void setREGION_CD(String REGION_CD) {
        this.REGION_CD = REGION_CD;
    }

    public String getINVOICE_SERIES_NBR() {
        return INVOICE_SERIES_NBR;
    }

    public void setINVOICE_SERIES_NBR(String INVOICE_SERIES_NBR) {
        this.INVOICE_SERIES_NBR = INVOICE_SERIES_NBR;
    }

    public Character getCOST_CNTR_IND() {
        return COST_CNTR_IND;
    }

    public void setCOST_CNTR_IND(Character COST_CNTR_IND) {
        this.COST_CNTR_IND = COST_CNTR_IND;
    }

    public String getWIRELESS_DAN() {
        return WIRELESS_DAN;
    }

    public void setWIRELESS_DAN(String WIRELESS_DAN) {
        this.WIRELESS_DAN = WIRELESS_DAN;
    }

    public String getMASTER_CHANNEL_CD() {
        return MASTER_CHANNEL_CD;
    }

    public void setMASTER_CHANNEL_CD(String MASTER_CHANNEL_CD) {
        this.MASTER_CHANNEL_CD = MASTER_CHANNEL_CD;
    }

    public String getMODULE_084() {
        return MODULE_084;
    }

    public void setMODULE_084(String MODULE_084) {
        this.MODULE_084 = MODULE_084;
    }

    public String getOPCO() {
        return OPCO;
    }

    public void setOPCO(String OPCO) {
        this.OPCO = OPCO;
    }

    public String getMODULE_087() {
        return MODULE_087;
    }

    public void setMODULE_087(String MODULE_087) {
        this.MODULE_087 = MODULE_087;
    }

    public Character getSPEC_PROC_CD() {
        return SPEC_PROC_CD;
    }

    public void setSPEC_PROC_CD(Character SPEC_PROC_CD) {
        this.SPEC_PROC_CD = SPEC_PROC_CD;
    }

    public String getWCAS_TAX_CAT() {
        return WCAS_TAX_CAT;
    }

    public void setWCAS_TAX_CAT(String WCAS_TAX_CAT) {
        this.WCAS_TAX_CAT = WCAS_TAX_CAT;
    }

    public String getMODULE_302() {
        return MODULE_302;
    }

    public void setMODULE_302(String MODULE_302) {
        this.MODULE_302 = MODULE_302;
    }

    @SpaceId
    public CompositeId getCompositeId() {
        return compositeId;
    }

    public void setCompositeId(CompositeId compositeId) {
        this.compositeId = compositeId;
    }


}
