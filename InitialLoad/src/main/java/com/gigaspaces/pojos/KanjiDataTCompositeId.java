package com.gigaspaces.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 04.09.2018
 */
@Embeddable
public class KanjiDataTCompositeId implements Serializable {

    @Column(name = "TEXT_XREF_NBR")
    private Integer textXrefNbr;
    @Column(name = "TEXT_LINE_NUM")
    private Integer textLineNum;

    public KanjiDataTCompositeId() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KanjiDataTCompositeId that = (KanjiDataTCompositeId) o;
        return Objects.equals(textXrefNbr, that.textXrefNbr) &&
                Objects.equals(textLineNum, that.textLineNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(textXrefNbr, textLineNum);
    }

    @Override
    public String toString() {
        return "KanjiDataTCompositeId{" +
                "textXrefNbr=" + textXrefNbr +
                ", textLineNum=" + textLineNum +
                '}';
    }
}
