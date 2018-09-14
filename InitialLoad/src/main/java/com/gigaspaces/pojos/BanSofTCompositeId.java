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
public class BanSofTCompositeId implements Serializable {

    @Column(name = "CUSTOMER_ACCT_NUM")
    private String customerAcctNum;
    @Column(name = "BACKEND_SYSTEM")
    private String backendSystem;
    @Column(name = "SERVICE_TYPE")
    private String serviceType;
    @Column(name = "ORIG_SYSTEM_ID")
    private String origSystemId;

    public BanSofTCompositeId() {
    }

    public BanSofTCompositeId(String customerAcctNum, String backendSystem, String serviceType, String origSystemId) {
        this.customerAcctNum = customerAcctNum;
        this.backendSystem = backendSystem;
        this.serviceType = serviceType;
        this.origSystemId = origSystemId;
    }

    public String getCustomerAcctNum() {
        return customerAcctNum;
    }

    public void setCustomerAcctNum(String customerAcctNum) {
        this.customerAcctNum = customerAcctNum;
    }

    public String getBackendSystem() {
        return backendSystem;
    }

    public void setBackendSystem(String backendSystem) {
        this.backendSystem = backendSystem;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getOrigSystemId() {
        return origSystemId;
    }

    public void setOrigSystemId(String origSystemId) {
        this.origSystemId = origSystemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BanSofTCompositeId that = (BanSofTCompositeId) o;
        return Objects.equals(customerAcctNum, that.customerAcctNum) &&
                Objects.equals(backendSystem, that.backendSystem) &&
                Objects.equals(serviceType, that.serviceType) &&
                Objects.equals(origSystemId, that.origSystemId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerAcctNum, backendSystem, serviceType, origSystemId);
    }

    @Override
    public String toString() {
        return "BanSofTCompositeId{" +
                "customerAcctNum='" + customerAcctNum + '\'' +
                ", backendSystem='" + backendSystem + '\'' +
                ", serviceType='" + serviceType + '\'' +
                ", origSystemId='" + origSystemId + '\'' +
                '}';
    }
}
