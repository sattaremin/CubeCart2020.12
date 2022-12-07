package com.unitedcoder.multithreading;

public class MultiThreadWithAmazonSearch {
    public static void main(String[] args) {
        AmazonSearch amazonSearch1=new AmazonSearch("Java Book");
        AmazonSearch amazonSearch2=new AmazonSearch("Iphone Case");
        AmazonSearch amazonSearch3=new AmazonSearch("BabyStroller");
        AmazonSearch amazonSearch4=new AmazonSearch("Air pods");

        Thread thread1= new Thread(amazonSearch1);
        Thread thread2= new Thread(amazonSearch2);
        Thread thread3= new Thread(amazonSearch3);
        Thread thread4= new Thread(amazonSearch4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
