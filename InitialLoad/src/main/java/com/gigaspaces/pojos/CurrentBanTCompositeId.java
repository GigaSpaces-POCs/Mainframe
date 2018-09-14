package com.gigaspaces.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 04.09.2018
 */
@Embeddable
public class CurrentBanTCompositeId implements Serializable {

    @Column(name = "BAN")
    private String ban;
    @Column(name = "ORIG_SYSTEM_ID")
    private String origSystemId;
    @Column(name = "MAN")
    private String man;
    @Column(name = "TIMESTAMP")
    private Timestamp timestamp;

    public CurrentBanTCompositeId() {
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

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentBanTCompositeId that = (CurrentBanTCompositeId) o;
        return Objects.equals(ban, that.ban) &&
                Objects.equals(origSystemId, that.origSystemId) &&
                Objects.equals(man, that.man) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ban, origSystemId, man, timestamp);
    }

    @Override
    public String toString() {
        return "CurrentBanTCompositeId{" +
                "ban='" + ban + '\'' +
                ", origSystemId='" + origSystemId + '\'' +
                ", man='" + man + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
