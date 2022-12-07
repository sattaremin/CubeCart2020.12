package com.unitedcoder.conditions;

import java.util.Scanner;

public class ConditionalStatementDemo1 {
    public static void main(String[] args) {
        //if
        Scanner number=new Scanner(System.in);
        System.out.println("Please type a random number");
        int m1=number.nextInt();
        System.out.println("Please type a random number2");
        int m2=number.nextInt();
        if (m1>m2) {
            System.out.printf("%d is greater than %d",m1,m2);
        } else
            System.out.printf("%d is less than %d",m1,m2);



    }
}
