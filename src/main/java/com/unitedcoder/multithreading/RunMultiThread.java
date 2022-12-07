package com.unitedcoder.multithreading;

public class RunMultiThread {
    public static void main(String[] args) {
        ThreadClass threadClass1 =new ThreadClass("Hello");
        ThreadClass threadClass2 =new ThreadClass("Java");
        ThreadClass threadClass3 =new ThreadClass("Multi Threading");
        ThreadClass threadClass4 =new ThreadClass("Demo");
        ThreadClass threadClass5 =new ThreadClass("SDET");

        Thread t1=new Thread(threadClass1);
        Thread t2=new Thread(threadClass2);
        Thread t3=new Thread(threadClass3);
        Thread t4=new Thread(threadClass4);
        Thread t5=new Thread(threadClass5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
