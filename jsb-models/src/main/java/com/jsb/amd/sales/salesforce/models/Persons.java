package com.jsb.amd.sales.salesforce.models;

//
//--     PersonID int,
//        --     LastName VARCHAR(255),
//        --     FirstName VARCHAR(255),
//        --     Address VARCHAR(255),
//        --     City VARCHAR(255)
public class Persons {
    private int PersonId;
    private String LastName;
    private String FirstName;

    private String Address;
    private String City;

    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int personId) {
        PersonId = personId;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "PersonId=" + PersonId +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}