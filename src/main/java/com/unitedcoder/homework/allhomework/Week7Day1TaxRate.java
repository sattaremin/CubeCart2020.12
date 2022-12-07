package com.unitedcoder.homework.allhomework;

import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.util.Scanner;

public class Week7Day1TaxRate {
    public static void main(String[] args) {

        double percent1=0.10;
        double percent2=0.25;
        double singleLimit=32000;
        double marriedLimit=64000;

        double tax1=0;
        double tax2=0;


        //Enter an income and status
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your annual income");
        String  income=input.nextLine();
        System.out.println("Enter 's' if your are single, Enter 'm' if you are married: ");
        String status=input.next();

        if (StringUtils.isNumeric(income)) {
            double income2 = Double.parseDouble(income);

            if (status.equals("s")) {
                if (income2 <= singleLimit) {
                    tax1 = income2 * percent1;
                } else {
                    tax1 = percent1 * singleLimit;
                    tax2 = percent2 * (income2 - singleLimit);
                }
            } else {
                if (status.equals("m")) {
                    if (income2 <= marriedLimit) {
                        tax1 = income2 * percent1;
                    } else {
                        tax1 = percent1 * marriedLimit;
                        tax2 = percent2 * (income2 - marriedLimit);
                    }
                }
            }

            double totalTax = tax1 + tax2;
            System.out.println("This is the total tax you need to pay every year: $" + totalTax);


        } else {
            System.out.println("Please enter a valid digit number");
        }
    }
}
