package com.gigaspaces;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.interfaces.HasBan;
import com.gigaspaces.interfaces.HasMan;
import com.gigaspaces.interfaces.HasOrigSystemId;

/**
 * @author Denys_Novikov
 * Date: 22.08.2018
 */
@SpaceClass
public class Step1AggregatedPojo implements HasMan, HasBan, HasOrigSystemId {

    private String id;
    private String cleId;
    private String cleName;
    private String man;
    private String ban;
    private String origSystemId;

    public Step1AggregatedPojo(){}

    public Step1AggregatedPojo(String cleId, String cleName, String man, String ban, String origSystemId) {
        this.cleId = cleId;
        this.cleName = cleName;
        this.man = man;
        this.ban = ban;
        this.origSystemId = origSystemId;
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

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public String getOrigSystemId() {
        return origSystemId;
    }

    public void setOrigSystemId(String origSystemId) {
        this.origSystemId = origSystemId;
    }

    @SpaceId(autoGenerate = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
