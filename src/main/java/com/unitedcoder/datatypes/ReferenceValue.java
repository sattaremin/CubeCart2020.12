package com.unitedcoder.datatypes;

public class ReferenceValue {
    public static void main(String[] args) {
        int x=900;
        int y=100;
        int tempValue=x;
        x=y;//assignment operator
        y=tempValue;
        System.out.println("value of x is:"+x);
        System.out.println("Value of y is:"+y);
    }
}
