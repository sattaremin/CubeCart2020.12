package com.unitedcoder.homework.cubecartaddcustomerproject;

import java.util.List;

public class CustomerInfo {

    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String cellPhone;
    private String newPassword;
    private String confirmPassword;

    public CustomerInfo() {
    }

    public CustomerInfo(String title, String firstName, String lastName, String email, String phone, String cellPhone, String newPassword, String confirmPassword) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.cellPhone = cellPhone;
        this.newPassword = newPassword;
        this.confirmPassword = confirmPassword;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}
