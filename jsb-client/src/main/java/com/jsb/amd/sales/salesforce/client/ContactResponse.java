package com.jsb.amd.sales.salesforce.client;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ContactResponse {

    private String id;
    private String buyingUnit;

    private String fullName;

    @JsonIgnore
    private String FirstName;
    @JsonIgnore
    private String LastName;

    private String group__c;
    private String parentAccountName;
    private String accountName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBuyingUnit() {
        return buyingUnit;
    }

    public void setBuyingUnit(String buyingUnit) {
        this.buyingUnit = buyingUnit;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGroup__c() {
        return group__c;
    }

    public void setGroup__c(String group__c) {
        this.group__c = group__c;
    }

    public String getParentAccountName() {
        return parentAccountName;
    }

    public void setParentAccountName(String parentAccountName) {
        this.parentAccountName = parentAccountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
