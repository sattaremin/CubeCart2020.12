package com.unitedcoder.exceptionhandling;

public class ExceptionHandlingDemo4 {
    public static void main(String[] args) {
        try {
            String s="a123";
            int x=Integer.parseInt(s);
        } catch (NumberFormatException a){
            a.printStackTrace();
        }
        finally {
            System.out.println("Java Exception");
        }

    }
}
