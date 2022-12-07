package com.unitedcoder.homework.allhomework;


public class Week8Day1 {
    public static void main(String[] args) {
        double amount=5;
        double sum=0;
        for (int i=0;i<5;i++){
            int random= (int) (Math.random()*50+1);
            sum+=random;
            System.out.print(random+" ");

        }
        System.out.println();
        System.out.println("The sum of the random numbers: "+sum);
        System.out.println("The average of the random numbers: "+sum/amount);

    }
}
