package com.gigaspaces.pojos;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Denys_Novikov
 * Date: 20.08.2018
 */
@Entity
@Table(name = "BMGVZP.REFERENCE_CODES_T")
@SpaceClass
public class ReferanceCodesT {

    @EmbeddedId
    private ReferanceCodesTCompositeId referanceCodesTCompositeId;
    
    @Column(name = "REC_NBR")
    private String recNbr;
    @Column(name = "SUB_REC_NBR")
    private String subRecNbr;
    @Column(name = "TYPE_DATA")
    private String typeData;
    @Column(name = "COLUMN_DESC")
    private String columnDesc;
    @Column(name = "CODE_DESC_KEY_XREF")
    private Integer codeDescKeyXref;

    public ReferanceCodesT(){}

    public String getRecNbr() {
        return recNbr;
    }

    public void setRecNbr(String recNbr) {
        this.recNbr = recNbr;
    }

    public String getSubRecNbr() {
        return subRecNbr;
    }

    public void setSubRecNbr(String subRecNbr) {
        this.subRecNbr = subRecNbr;
    }

    public String getTypeData() {
        return typeData;
    }

    public void setTypeData(String typeData) {
        this.typeData = typeData;
    }

    public String getColumnDesc() {
        return columnDesc;
    }

    public void setColumnDesc(String columnDesc) {
        this.columnDesc = columnDesc;
    }

    public Integer getCodeDescKeyXref() {
        return codeDescKeyXref;
    }

    public void setCodeDescKeyXref(Integer codeDescKeyXref) {
        this.codeDescKeyXref = codeDescKeyXref;
    }

    @SpaceId
    public ReferanceCodesTCompositeId getReferanceCodesTCompositeId() {
        return referanceCodesTCompositeId;
    }

    public void setReferanceCodesTCompositeId(ReferanceCodesTCompositeId referanceCodesTCompositeId) {
        this.referanceCodesTCompositeId = referanceCodesTCompositeId;
    }
}
