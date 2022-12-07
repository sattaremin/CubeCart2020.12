package com.unitedcoder.cubecartautomation;

public class CustomerInfo {
   private String firstName;
   private String lasName;
   private String title;
   private String email;

    public CustomerInfo() {
    }

    public CustomerInfo(String firstName, String lasName, String title, String email) {
        this.firstName = firstName;
        this.lasName = lasName;
        this.title = title;
        this.email = email;
    }

    public CustomerInfo(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }
}
