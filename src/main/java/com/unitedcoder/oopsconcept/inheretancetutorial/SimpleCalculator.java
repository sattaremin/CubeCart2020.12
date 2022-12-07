package com.unitedcoder.oopsconcept.inheretancetutorial;

public interface SimpleCalculator {
    String version="2.0";

    //only accept abstract method
    double addTwoNumbers(int a, int b);//method name, return type, arguments no implementation
    int addMultipleNumbers(int...numbers);
    double multiplyTwoNumbers(double d1, double d2);
    float divideTwoNumbers(double x, double y);
    long subtractTwoNumbers(long a1, long a2);
}
