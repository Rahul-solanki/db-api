package com.jsb.amd.sales.salesforce.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
    private String id;
    private String buyingUnit;
    private String FirstName;
    private String LastName;

    private String fullName;
    private String group__c;
    private String parentAccountName;
    private String accountName;

    public String getFullName() {
        if (LastName != null && FirstName != null)
            return String.format("%s, %s", LastName, FirstName);
        else if (LastName != null && FirstName == null)
            return LastName;
        else if (LastName == null && FirstName != null)
            return FirstName;
        else
            return "";
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", buyingUnit='" + buyingUnit + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", group__c='" + group__c + '\'' +
                ", parentAccountName='" + parentAccountName + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
