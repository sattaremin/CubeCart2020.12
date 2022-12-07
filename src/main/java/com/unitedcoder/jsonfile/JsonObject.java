package com.unitedcoder.jsonfile;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonObject {
    @JsonProperty("login-user")
    private LoginUser loginUser;
    @JsonProperty("product")
    private Product product;
    @JsonProperty("customer")
    private Customer customer;

    public JsonObject() {
    }

    public JsonObject(LoginUser loginUser, Product product, Customer customer) {
        this.loginUser = loginUser;
        this.product = product;
        this.customer = customer;
    }

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public Product getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "JsonObject{" +
                "loginUser=" + loginUser +
                ", product=" + product +
                ", customer=" + customer +
                '}';
    }
}
