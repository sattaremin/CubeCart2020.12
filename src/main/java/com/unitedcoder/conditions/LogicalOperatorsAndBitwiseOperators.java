package com.unitedcoder.conditions;

public class LogicalOperatorsAndBitwiseOperators {
    public static void main(String[] args) {
        boolean b1=false;
        int b2=200;
        if (b1&&(b2++>0)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("The value of b2 is "+b2);

        int b3=300;
        if (b1&(b3++>0)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("The value of b3 is "+b3);

    }
}
