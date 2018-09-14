package com.gigaspaces.pojos;

/**
 * @author Denys_Novikov
 * Date: 20.08.2018
 */

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.interfaces.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "BMGVZP.VZ450_MOD_079_T")
@SpaceClass
public class Vz450Mod079T implements HasMan, HasManBillDate, HasBan, HasBillDate, HasOrigSystemId, HasVz450SeqNbr, HasAban {

    @EmbeddedId
    private Vz450Mod079TCompositeId vz450Mod079TCompositeId;

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
    @Column(name = "SUPP_DATA_ID_CD")
    private String suppDataIdCd;
    @Column(name = "SUPP_DATA_ID")
    private String suppDataId;
    @Column(name = "VAMLOAD_DATE")
    private Date vamloadDate;

    public Vz450Mod079T(){}

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

    public String getSuppDataIdCd() {
        return suppDataIdCd;
    }

    public void setSuppDataIdCd(String suppDataIdCd) {
        this.suppDataIdCd = suppDataIdCd;
    }

    public String getSuppDataId() {
        return suppDataId;
    }

    public void setSuppDataId(String suppDataId) {
        this.suppDataId = suppDataId;
    }

    public Date getVamloadDate() {
        return vamloadDate;
    }

    public void setVamloadDate(Date vamloadDate) {
        this.vamloadDate = vamloadDate;
    }

    @SpaceId
    public Vz450Mod079TCompositeId getVz450Mod079TCompositeId() {
        return vz450Mod079TCompositeId;
    }

    public void setVz450Mod079TCompositeId(Vz450Mod079TCompositeId vz450Mod079TCompositeId) {
        this.vz450Mod079TCompositeId = vz450Mod079TCompositeId;
    }

    @Override
    public String getMan() {
        return vz450Mod079TCompositeId.getMan();
    }

    @Override
    public Date getManBillDate() {
        return vz450Mod079TCompositeId.getManBillDate();
    }

    @Override
    public String getOrigSystemId() {
        return vz450Mod079TCompositeId.getOrigSystemId();
    }

    @Override
    public Integer getVz450SeqNbr() {
        return vz450Mod079TCompositeId.getVz450SeqNbr();
    }
}
