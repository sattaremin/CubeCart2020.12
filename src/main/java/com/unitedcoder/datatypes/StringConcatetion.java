package com.unitedcoder.datatypes;

public class StringConcatetion {
    public static void main(String[] args){
        //Numeric - Non numeric
        String s1="Hello ";
        String s2="Java";
        String s3="100";
        String s4="200plus";
        String s5="500";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2).concat(s3).concat(s4).concat(s5));
        int i1=100;
        int i2=300;

        System.out.println(s3+s5);
        System.out.println(i1+i2);
        System.out.println(i1+s3);
        System.out.println(s1+s5+s3);
        System.out.println(s2+s4);
        System.out.println(s3+(s3+s5));

        //Hard Code

        //Contains==Keyword
        String message="Customer Added Successfully";
        System.out.println(message.toLowerCase().contains("successfully"));




    }
}
