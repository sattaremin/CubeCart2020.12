package com.unitedcoder.exceptionhandling;

public class ExceptionHandlingDemo3 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (Throwable a){
            a.printStackTrace();
        }

    }

}
