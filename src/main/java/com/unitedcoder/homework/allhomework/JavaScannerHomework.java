package com.unitedcoder.homework.allhomework;

import java.util.Scanner;

public class JavaScannerHomework {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("What is your house street address?");
        String streetAddress = input.nextLine();
        System.out.println("What is the name of the city?");
        String cityName = input.nextLine();
        System.out.println("What is the state?");
        String state = input.nextLine();
        System.out.printf("Your house full address is: %s %s %s",streetAddress,cityName,state);







    }
}
