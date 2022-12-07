package com.unitedcoder.conditions;

import com.google.common.math.Quantiles;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ConditionalStatementDemo2 {
    public static void main(String[] args) {
        //if

        Scanner number = new Scanner(System.in);
        System.out.println("Welcome to the Game");
        System.out.println("Please enter your age");
        int age = number.nextInt();

        if (age>=18) {
            System.out.println("Congratulations!!!! you can continue with your game!!!");
        }

        else {
            System.out.println("You are not qualified for this Game");
        }



    }
}
