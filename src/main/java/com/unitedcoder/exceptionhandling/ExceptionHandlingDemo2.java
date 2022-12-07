package com.unitedcoder.exceptionhandling;

public class ExceptionHandlingDemo2 {
    public static void main(String[] args) throws InterruptedException {
        sleep(2);
        waits(2);

    }

    public static void sleep(int second) throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void waits(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
