package com.unitedcoder.cubecartautomation;


public enum TypeDropDownValue {

    REGISTERED_CUSTOMER("Registered Customer"),
    UNREGISTERED_CUSTOMER("Unregistered Customer");

    private String value;

    TypeDropDownValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println(TypeDropDownValue.REGISTERED_CUSTOMER.value);
    }
}
