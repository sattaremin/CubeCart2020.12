package com.unitedcoder.datatypes;

public class StringDemo3 {
   public static void main(String[] args){
       String result=(" All test passed ");
       System.out.println(result.length());
       System.out.println((result.trim().length()));
       result=result.replace(" ","");
       System.out.println(result.length());

       //string format
       String course="United Coder";
       String course1="Selenium Master";
       String course2="Java Seleniium Course";
       //Welcome to.....
       System.out.println("Welcome to "+course);
       System.out.println(String.format("Welcom to %s",course1));

       int i1=100;
       int i2=200;
       int i3=i1+i2;
       System.out.printf(String.format("I am learning Arithmatic operation plus in %S : %d + %d =%d\n",course,i1,i2,i3));
       System.out.println("*********");

       boolean b1=true;
       boolean b2=false;
       System.out.println(String.format("Login Test Passed %b",b1));


   }
}
