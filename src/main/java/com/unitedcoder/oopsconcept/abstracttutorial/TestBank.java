package com.unitedcoder.oopsconcept.abstracttutorial;

public class TestBank {
    public static void main(String[] args) {
        Bank bank=new HSBCBank();
        bank.credit();
        bank.loan();
        HSBCBank hsbcBank=new HSBCBank();
        hsbcBank.debit();


    }
}
