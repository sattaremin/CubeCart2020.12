package com.unitedcoder.conditions;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 12 for a month");
        int month=input.nextInt();
        switch (month) {
            case 1:
                System.out.println("it is January");
                break;
            case 2:
                System.out.println("it is February");
                break;
            case 3:
                System.out.println("it is March");
                break;
            case 4:
                System.out.println("it is April");
                break;
            case 5:
                System.out.println("it is May");
                break;
            case 6:
                System.out.println("it is June");
                break;
            case 7:
                System.out.println("it is July");
                break;
            case 8:
                System.out.println("it is August");
                break;
            case 9:
                System.out.println("it is September");
                break;
            case 10:
                System.out.println("it is October");
                break;
            case 11:
                System.out.println("it is November");
                break;
            case 12:
                System.out.println("it is December");
            default:
                System.out.println("please enter a valid number ");

        }
    }
}
