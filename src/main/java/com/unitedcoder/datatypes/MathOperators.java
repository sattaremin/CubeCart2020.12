package com.unitedcoder.datatypes;

import java.util.Random;

public class MathOperators {
    public static void main(String[] args) {
        int i1=100;
        System.out.println(Math.max(100,150));
        System.out.println(Math.min(20,400));
        System.out.println(Math.abs(-90));
        System.out.println(Math.pow(3,4));
        //Random  range  0.0---0.9999999
        System.out.println(Math.random());
        //0--10
        int randomNumber=(int)(Math.random()*10000)+100;
        System.out.println(randomNumber);

        //Random Class
        Random random=new Random();
        System.out.println(random.nextInt());



    }
}
