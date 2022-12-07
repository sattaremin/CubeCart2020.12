package com.unitedcoder.homework.cubecartaddproductproject;

public enum ProductDropdowns {
    PUMA("Puma"),
    USED("Used"),
    INCHES_IN("Inches (in)"),;


    private String value;


    ProductDropdowns(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println(ProductDropdowns.PUMA.getValue());
    }
}
