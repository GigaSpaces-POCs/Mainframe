package com.gigaspaces.pojos;

import com.gigaspaces.interfaces.HasBan;
import com.gigaspaces.interfaces.HasOrigSystemId;
import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author Denys_Novikov
 * Date: 20.08.2018
 */
@Entity
@Table(name = "BMGVZP.BAN_SOF_T")
@SpaceClass
public class BanSofT implements HasOrigSystemId, HasBan {

    @EmbeddedId
    private BanSofTCompositeId banSofTCompositeId;

    @Column(name = "VRD_FLAG")
    private String vrdFlag;
    @Column(name = "CLE_ID")
    private String cleId;
    @Column(name = "CLE_NAME")
    private String cleName;
    @Column(name = "TOP_CLE_ID")
    private String topCleId;
    @Column(name = "TOP_CLE_NAME")
    private String topCleName;
    @Column(name = "SERVICE_TIER")
    private String serviceTier;
    @Column(name = "SUBNASP_ID")
    private String subnaspId;
    @Column(name = "SUBNASP_NAME")
    private String subnaspName;
    @Column(name = "PARENT_NASP_ID")
    private String parentNaspId;
    @Column(name = "PARENT_NASP_NAME")
    private String parentNaspName;
    @Column(name = "SALES_SEGMENT_CODE")
    private String salesSegmentCode;
    @Column(name = "SALES_SEGMENT_NAME")
    private String salesSegmentName;
    @Column(name = "BAN")
    private String ban;
    @Column(name = "GROUP_ACCT")
    private String groupAcct;
    @Column(name = "CREATED_TIMESTAMP")
    private Timestamp createdTimestamp;

    public BanSofT(){}

    public String getVrdFlag() {
        return vrdFlag;
    }

    public void setVrdFlag(String vrdFlag) {
        this.vrdFlag = vrdFlag;
    }

    public String getCleId() {
        return cleId;
    }

    public void setCleId(String cleId) {
        this.cleId = cleId;
    }

    public String getCleName() {
        return cleName;
    }

    public void setCleName(String cleName) {
        this.cleName = cleName;
    }

    public String getTopCleId() {
        return topCleId;
    }

    public void setTopCleId(String topCleId) {
        this.topCleId = topCleId;
    }

    public String getTopCleName() {
        return topCleName;
    }

    public void setTopCleName(String topCleName) {
        this.topCleName = topCleName;
    }

    public String getServiceTier() {
        return serviceTier;
    }

    public void setServiceTier(String serviceTier) {
        this.serviceTier = serviceTier;
    }

    public String getSubnaspId() {
        return subnaspId;
    }

    public void setSubnaspId(String subnaspId) {
        this.subnaspId = subnaspId;
    }

    public String getSubnaspName() {
        return subnaspName;
    }

    public void setSubnaspName(String subnaspName) {
        this.subnaspName = subnaspName;
    }

    public String getParentNaspId() {
        return parentNaspId;
    }

    public void setParentNaspId(String parentNaspId) {
        this.parentNaspId = parentNaspId;
    }

    public String getParentNaspName() {
        return parentNaspName;
    }

    public void setParentNaspName(String parentNaspName) {
        this.parentNaspName = parentNaspName;
    }

    public String getSalesSegmentCode() {
        return salesSegmentCode;
    }

    public void setSalesSegmentCode(String salesSegmentCode) {
        this.salesSegmentCode = salesSegmentCode;
    }

    public String getSalesSegmentName() {
        return salesSegmentName;
    }

    public void setSalesSegmentName(String salesSegmentName) {
        this.salesSegmentName = salesSegmentName;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public String getGroupAcct() {
        return groupAcct;
    }

    public void setGroupAcct(String groupAcct) {
        this.groupAcct = groupAcct;
    }

    public Timestamp getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Timestamp createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    @SpaceId
    public BanSofTCompositeId getBanSofTCompositeId() {
        return banSofTCompositeId;
    }

    public void setBanSofTCompositeId(BanSofTCompositeId banSofTCompositeId) {
        this.banSofTCompositeId = banSofTCompositeId;
    }

    @Override
    public String getOrigSystemId() {
        return banSofTCompositeId.getOrigSystemId();
    }
}
