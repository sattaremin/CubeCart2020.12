package com.unitedcoder.homework.cubecartaddcustomerproject;

public class CustomerAddressInfo extends CustomerInfo {

    private String description;
    private String aTitle;
    private String aFirstName;
    private String aLastName;
    private String companyName;
    private String address;
    private String town;
    private String state;
    private String zipCode;

    public CustomerAddressInfo() {
    }




    public CustomerAddressInfo(String description, String aTitle, String aFirstName,
                               String aLastName, String companyName, String address, String town, String state, String zipCode) {
        this.description = description;
        this.aTitle = aTitle;
        this.aFirstName = aFirstName;
        this.aLastName = aLastName;
        this.companyName = companyName;
        this.address = address;
        this.town = town;
        this.state = state;
        this.zipCode = zipCode;
    }

    public CustomerAddressInfo(String title, String firstName, String lastName, String email, String phone, String cellPhone, String newPassword, String confirmPassword, String description, String aTitle, String aFirstName, String aLastName, String companyName, String address, String town, String state, String zipCode) {
        super(title, firstName, lastName, email, phone, cellPhone, newPassword, confirmPassword);
        this.description = description;
        this.aTitle = aTitle;
        this.aFirstName = aFirstName;
        this.aLastName = aLastName;
        this.companyName = companyName;
        this.address = address;
        this.town = town;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getDescription() {
        return description;
    }

    public String getaTitle() {
        return aTitle;
    }

    public String getaFirstName() {
        return aFirstName;
    }

    public String getaLastName() {
        return aLastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getTown() {
        return town;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
}
