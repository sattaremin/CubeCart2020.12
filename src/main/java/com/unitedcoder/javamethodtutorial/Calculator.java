package com.unitedcoder.javamethodtutorial;

import org.apache.commons.lang3.StringUtils;

public class Calculator {

    //method for print calculator information
    public void calculatorInfo(){
        System.out.println("Sony Simple Calculator");
        System.out.println("Hope you enjoy using it!!");
    }
    //method for add two  numbers
    public int sum(int i1,int i2){
        return i1+i2;
    }

    public double division(double d1,double d2){
        return d1/d2;
    }

    public double multipleNumbers(double m1,double m2){
        return m1*m2;
    }

    public long addTwoNumbers(String s1,String s2){
        if (StringUtils.isNumeric(s1)&&StringUtils.isNumeric(s2)){
            long sum=Long.parseLong(s1)+Long.parseLong(s2);
            return sum;

        }else {
            System.out.println("Please provide numeric string");
            return 0;
        }
    }
    //add multiple numbers
    public double addMultipleNumbers(long...numbers){
        long sum=0;
        for (long eachNumber:numbers){
            sum+=eachNumber;
        }
        return sum;
    }



}
