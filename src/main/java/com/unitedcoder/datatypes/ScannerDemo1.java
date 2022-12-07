package com.unitedcoder.datatypes;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your school name:");
        String schoolName=input.nextLine();
        System.out.println("Please enter your school address:");
        String address=input.nextLine();
        System.out.println("Please enter your school zipcode:");
        int zipcode=input.nextInt();
        //System.out.printf("Your school full address is %s %s %s",schoolName,address,zipcode);

        System.out.println("Please Enter Your Full Name:");
        String userFullName=input.nextLine();
        System.out.println("Please Enter Your Email:");
        String userEmailAddress=input.nextLine();
        System.out.println("Please Enter Your Phone Number:");
        long userPhoneNumber=input.nextLong();
        System.out.printf("Your personal information is %s %s %s %s %s %s",schoolName,address,zipcode,userFullName,userEmailAddress,userPhoneNumber);





    }
}
