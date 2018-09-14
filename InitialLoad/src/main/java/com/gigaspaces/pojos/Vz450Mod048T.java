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
@Table(name = "BMGVZP.VZ450_MOD_048_T")
@SpaceClass
public class Vz450Mod048T {

    @EmbeddedId
    private Vz450Mod048TCompositeId vz450Mod048TCompositeId;

    @Column(name = "VZ450_REC_NBR")
    private String vz450RecNbr;
    @Column(name = "VZ450_SUB_REC_NBR")
    private String vz450SubRecNbr;
    @Column(name = "BAN")
    private String ban;
    @Column(name = "ABAN")
    private String aban;
    @Column(name = "BILL_DATE")
    private Date billDate;
    @Column(name = "TAX_TYPE_CDE")
    private String taxTypeCde;
    @Column(name = "TAX_PERCENT")
    private Double taxPercent;
    @Column(name = "TAX_AMT")
    private Double taxAmt;
    @Column(name = "TAX_BASE_AMT")
    private Double taxBaseAmt;
    @Column(name = "PHRASE_CODE")
    private String phraseCode;
    @Column(name = "TAX_CAT_CODE")
    private String taxCatCode;
    @Column(name = "GEO_CODE")
    private String geoCode;
    @Column(name = "M48_TAX_CODE")
    private String m48TaxCode;
    @Column(name = "CODE_DESC_KEY")
    private Integer codeDescKey;
    @Column(name = "ORIG_VZ450_SEQ_NBR")
    private Integer origVz450SeqNbr;
    @Column(name = "FEATURE_INSTANCE_ID")
    private String featureInstanceId;
    @Column(name = "NORMALIZED_EVENT_ID")
    private String normalizedEventId;
    @Column(name = "CHG_TYPE_CD")
    private String chgTypeCd;
    @Column(name = "CHARGE_BEGIN_DATE")
    private String chargeBeginDate;
    @Column(name = "CHARGE_END_DATE")
    private String chargeEndDate;
    @Column(name = "CHARGE_CODE")
    private String chargeCode;
    @Column(name = "VAMLOAD_DATE")
    private Date vamloadDate;

    public Vz450Mod048T(){}

    public String getVz450RecNbr() {
        return vz450RecNbr;
    }

    public void setVz450RecNbr(String vz450RecNbr) {
        this.vz450RecNbr = vz450RecNbr;
    }

    public String getVz450SubRecNbr() {
        return vz450SubRecNbr;
    }

    public void setVz450SubRecNbr(String vz450SubRecNbr) {
        this.vz450SubRecNbr = vz450SubRecNbr;
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

    public String getTaxTypeCde() {
        return taxTypeCde;
    }

    public void setTaxTypeCde(String taxTypeCde) {
        this.taxTypeCde = taxTypeCde;
    }

    public Double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(Double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public Double getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Double getTaxBaseAmt() {
        return taxBaseAmt;
    }

    public void setTaxBaseAmt(Double taxBaseAmt) {
        this.taxBaseAmt = taxBaseAmt;
    }

    public String getPhraseCode() {
        return phraseCode;
    }

    public void setPhraseCode(String phraseCode) {
        this.phraseCode = phraseCode;
    }

    public String getTaxCatCode() {
        return taxCatCode;
    }

    public void setTaxCatCode(String taxCatCode) {
        this.taxCatCode = taxCatCode;
    }

    public String getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }

    public String getM48TaxCode() {
        return m48TaxCode;
    }

    public void setM48TaxCode(String m48TaxCode) {
        this.m48TaxCode = m48TaxCode;
    }

    public Integer getCodeDescKey() {
        return codeDescKey;
    }

    public void setCodeDescKey(Integer codeDescKey) {
        this.codeDescKey = codeDescKey;
    }

    public Integer getOrigVz450SeqNbr() {
        return origVz450SeqNbr;
    }

    public void setOrigVz450SeqNbr(Integer origVz450SeqNbr) {
        this.origVz450SeqNbr = origVz450SeqNbr;
    }

    public String getFeatureInstanceId() {
        return featureInstanceId;
    }

    public void setFeatureInstanceId(String featureInstanceId) {
        this.featureInstanceId = featureInstanceId;
    }

    public String getNormalizedEventId() {
        return normalizedEventId;
    }

    public void setNormalizedEventId(String normalizedEventId) {
        this.normalizedEventId = normalizedEventId;
    }

    public String getChgTypeCd() {
        return chgTypeCd;
    }

    public void setChgTypeCd(String chgTypeCd) {
        this.chgTypeCd = chgTypeCd;
    }

    public String getChargeBeginDate() {
        return chargeBeginDate;
    }

    public void setChargeBeginDate(String chargeBeginDate) {
        this.chargeBeginDate = chargeBeginDate;
    }

    public String getChargeEndDate() {
        return chargeEndDate;
    }

    public void setChargeEndDate(String chargeEndDate) {
        this.chargeEndDate = chargeEndDate;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public Date getVamloadDate() {
        return vamloadDate;
    }

    public void setVamloadDate(Date vamloadDate) {
        this.vamloadDate = vamloadDate;
    }

    @SpaceId
    public Vz450Mod048TCompositeId getVz450Mod048TCompositeId() {
        return vz450Mod048TCompositeId;
    }

    public void setVz450Mod048TCompositeId(Vz450Mod048TCompositeId vz450Mod048TCompositeId) {
        this.vz450Mod048TCompositeId = vz450Mod048TCompositeId;
    }
}
