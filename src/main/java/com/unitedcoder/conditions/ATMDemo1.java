package com.unitedcoder.conditions;

import java.util.Scanner;

public class ATMDemo1 {
    public static void main(String[] args) {
        //Pin number
        int correctPin=1234;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter  your pin number");
        int pin = input.nextInt();
        if (pin==correctPin){
            System.out.println("Your account number is: 44564515");
            System.out.println("Your account balance is: 1000$");
        }
        else {
            System.out.println("You entered wrong pin number");
            System.out.println("Please try again with correct pin number");
        }


        /*Practice
        int pin=223344;
        Scanner input=new Scanner(System.in);
        System.out.println("please type password");
        int mb=input.nextInt();

        if (String.valueOf(pin).length()==6||pin==mb){
            System.out.println("You logged in successfully");
            System.out.println("correct pin length");}
        else {
            System.out.println("incorrect pin number please try again");
            System.out.println("You have two more rights");
        }

         */
    }
}
