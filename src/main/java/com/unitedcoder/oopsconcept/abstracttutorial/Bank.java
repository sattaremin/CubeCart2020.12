package com.unitedcoder.oopsconcept.abstracttutorial;

public abstract class Bank {
    int balance;
    final int amount=10000;
    static final int a=100;
    //Abstract Method
    public abstract void loan();

    public void debit(){
        System.out.println("Bank Debit");
    }

    public void credit(){
        System.out.println("Bank Credit");
    }
}
