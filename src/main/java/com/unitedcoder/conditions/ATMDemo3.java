package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemo3 {
    public static void main(String[] args) {
        //Pin number
        int correctPin = 1234;
        int balance = 100000;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  your pin number");
        String pin = input.nextLine();
        if (StringUtils.isNumeric(pin)) {
            if (Integer.parseInt(pin) == correctPin) {
                System.out.println("Please select the menu: transfer money, deposit mooney, withdraw money");
                String selectedMenu = input.nextLine();
                if (selectedMenu.equalsIgnoreCase("withdraw money")) {
                    System.out.println("Please select withdraw amount!!");
                    int withdrawAmount = input.nextInt();
                    if (withdrawAmount <= balance) {
                        System.out.println("Please take your money");
                        System.out.printf("Your current balance is: %d\n", balance - withdrawAmount);
                    } else {
                        System.out.println("Insufficient amount!");
                        System.out.println("Withdraw amount is greater than your balance!!");
                    }
                } else {
                    if (selectedMenu.equalsIgnoreCase("deposit money")){
                        System.out.println("Please put the money into the machine");
                        int money=input.nextInt();
                        System.out.printf("You have deposited %d amount\n",money);
                        System.out.printf("Your current balance is %d",balance+money);

                    }
                }
            } else {
                System.out.println("You entered wrong pin number, please try again");
            }
        }
        else{
                System.out.println("You enter Valid 4 digit numbers");
                System.out.println("Please try again with correct digit pin number");
        }




    }
}
