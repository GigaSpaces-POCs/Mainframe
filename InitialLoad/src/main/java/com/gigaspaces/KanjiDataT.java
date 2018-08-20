package com.gigaspaces;

import com.gigaspaces.annotation.pojo.SpaceClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author Denys_Novikov
 * Date: 20.08.2018
 */
@Entity
@Table(name="BMGVZP.KANJI_DATA_T")
@SpaceClass
public class KanjiDataT {
    @Column(name = "TEXT_XREF_NBR")
    private Integer textXrefNbr;
    @Column(name = "TEXT_LINE_NUM")
    private Integer textLineNum;
    @Column(name = "TEXT_POINTER_CD")
    private String textPointerCd;
    @Column(name = "TEXT_KEY")
    private String textKey;
    @Column(name = "TEXT_STRING")
    private String textString;
    @Column(name = "VAMLOAD_DATE")
    private Date vamloadDate;

    public KanjiDataT(){}

    public Integer getTextXrefNbr() {
        return textXrefNbr;
    }

    public void setTextXrefNbr(Integer textXrefNbr) {
        this.textXrefNbr = textXrefNbr;
    }

    public Integer getTextLineNum() {
        return textLineNum;
    }

    public void setTextLineNum(Integer textLineNum) {
        this.textLineNum = textLineNum;
    }

    public String getTextPointerCd() {
        return textPointerCd;
    }

    public void setTextPointerCd(String textPointerCd) {
        this.textPointerCd = textPointerCd;
    }

    public String getTextKey() {
        return textKey;
    }

    public void setTextKey(String textKey) {
        this.textKey = textKey;
    }

    public String getTextString() {
        return textString;
    }

    public void setTextString(String textString) {
        this.textString = textString;
    }

    public Date getVamloadDate() {
        return vamloadDate;
    }

    public void setVamloadDate(Date vamloadDate) {
        this.vamloadDate = vamloadDate;
    }
}
