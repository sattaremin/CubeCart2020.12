package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String number=input.next();
        if (StringUtils.isNumeric(number)){
            switch (number.length()){
                case 1:
                    System.out.println("one digit");
                    break;
                case 2:
                    System.out.println("two digit number");
                    break;
                case 3:
                    System.out.println("three digit number");
                    break;
                default:
                    System.out.println("number is equal to or greater than 1000");
            }
        } else {
            System.out.println("Please enter a valid digit number ");
        }
    }
}
