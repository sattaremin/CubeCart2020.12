package com.unitedcoder.exceptionhandling;

public class ExceptionHandlingDemo1 {
    public static void main(String[] args) {
        try {
            int[] a={5,6,2,8,9,7};
            System.out.println(a[8]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Hello World");
        }
    }
}
