package com.unitedcoder.homework.allhomework;

public class Week5Day1 {
    public static void main(String[] args){
        //Java code project
        System.out.println("*\n**\n***\n****\n***** ");
        //String
        String schoolName="United Coder ";
        String schoolAdress="823 West Side Ave, Jersey City, NJ 07306, United States ";
        String zipcode="23556";

        //Combine School name school address and zipcode and store it with a String variable named "schoolFullAdress"
        String schoolFullAdress=schoolName+schoolAdress+zipcode;
        System.out.println(schoolFullAdress);
        //print school name with all capital letters
        System.out.println(schoolName.toUpperCase());
        //print school adress with all lowercase letters
        System.out.println(schoolAdress.toLowerCase());
        //Print only the zipcode from schoolFullAdress
        System.out.println(schoolFullAdress.lastIndexOf("2"));
        System.out.println(schoolFullAdress.lastIndexOf("6"));
        System.out.println(schoolFullAdress.substring(69,74));
        //print out total length of schoolFullAdress++
        System.out.println(schoolFullAdress.length());
        //print out the result if your schoolName equals to(university)
        System.out.println(schoolName.equals("University"));
        //print out the result if your school Name contains char(S)
        System.out.println(schoolName.contains("S"));
        //print out schoolFullAdress by using String format
        System.out.println(String.format("School Details: Name: %s Address: %s zipcode: %s",schoolName,schoolAdress,zipcode));

    }
}
