package com.gigaspaces.pojos;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.annotation.pojo.SpaceIndex;
import com.gigaspaces.metadata.index.SpaceIndexType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Denys_Novikov
 * Date: 20.08.2018
 */
@Entity
@Table(name = "BMGVZP.REF_CODES_95_T")
@SpaceClass
public class RefCodes95T {
    @Id
    @Column(name = "CODE_DESC_KEY")
    private Integer codeDescKey;
    @Column(name = "CODE")
    private String code;                                         
    @Column(name = "TYPE")
    private String type;
    @Column(name = "SOURCE_REC_NUM")
    private String sourceRecNum;
    @Column(name = "SOURCE_SUB_REC_NUM")
    private String sourceSubRecNum;
    @Column(name = "SOURCE_TYPE")
    private String sourceType;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LANG_CD")
    private String langCd;
    @Column(name = "TEXT_TYPE_CODE")
    private String textTypeCode;
    @Column(name = "DESCRIPTION_2")
    private String description2;
    @Column(name = "DESCRIPTION_1")
    private String description1;

    public RefCodes95T(){}

    @SpaceId
    @SpaceIndex(type = SpaceIndexType.EQUAL)
    public Integer getCodeDescKey() {
        return codeDescKey;
    }

    public void setCodeDescKey(Integer codeDescKey) {
        this.codeDescKey = codeDescKey;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSourceRecNum() {
        return sourceRecNum;
    }

    public void setSourceRecNum(String sourceRecNum) {
        this.sourceRecNum = sourceRecNum;
    }

    public String getSourceSubRecNum() {
        return sourceSubRecNum;
    }

    public void setSourceSubRecNum(String sourceSubRecNum) {
        this.sourceSubRecNum = sourceSubRecNum;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLangCd() {
        return langCd;
    }

    public void setLangCd(String langCd) {
        this.langCd = langCd;
    }

    public String getTextTypeCode() {
        return textTypeCode;
    }

    public void setTextTypeCode(String textTypeCode) {
        this.textTypeCode = textTypeCode;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }
}
