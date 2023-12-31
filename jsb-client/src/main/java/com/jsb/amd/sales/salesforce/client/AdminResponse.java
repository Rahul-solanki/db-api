package com.jsb.amd.sales.salesforce.client;

public class AdminResponse {

    private boolean isAdminUser;
    public AdminResponse(boolean isAdminUser){
        this.isAdminUser = isAdminUser;
    }
    public boolean isAdminUser(){
        return isAdminUser;
    };
    public void setAdminUser(boolean adminUser){
        isAdminUser = adminUser;
    }
}
