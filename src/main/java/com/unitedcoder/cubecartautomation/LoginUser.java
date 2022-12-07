package com.unitedcoder.cubecartautomation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginUser {
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("password")
    private String password;
    @JsonProperty("email")
    private String email;
    @JsonProperty("userType")
    private String userType;
    @JsonProperty("active")
    private boolean active;




    public LoginUser() {
    }

    public LoginUser(String userName, String password, String userType, boolean active) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.active = active;
    }

    public String getUserName() {
        return userName;
    }

    public LoginUser(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public LoginUser(String userName, String password, String email, String userType) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public String getUserType() {
        return userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
