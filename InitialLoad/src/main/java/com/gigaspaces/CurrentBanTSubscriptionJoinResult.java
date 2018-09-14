package com.gigaspaces;

/**
 * @author Denys_Novikov
 * Date: 23.08.2018
 */
public class CurrentBanTSubscriptionJoinResult {

    private String customerAcctNum;
    private String origSystemId;
    private String man;
    private String ban;

    public CurrentBanTSubscriptionJoinResult(String customerAcctNum, String origSystemId, String man, String ban) {
        this.customerAcctNum = customerAcctNum;
        this.origSystemId = origSystemId;
        this.man = man;
        this.ban = ban;
    }

    public String getCustomerAcctNum() {
        return customerAcctNum;
    }

    public void setCustomerAcctNum(String customerAcctNum) {
        this.customerAcctNum = customerAcctNum;
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

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }
}
