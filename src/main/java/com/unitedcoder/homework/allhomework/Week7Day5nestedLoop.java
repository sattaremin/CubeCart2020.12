package com.unitedcoder.homework.allhomework;

import java.util.Scanner;

public class Week7Day5nestedLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a shape: ");
        String shape=scanner.next();
        System.out.println();
        for (int i=2;i<=8;i*=2){
            for (int j=1;j<=i;j++){
                System.out.print(shape);

            }
            System.out.println();
        }
        System.out.println("====================\n");


        System.out.println("Numbers that can be divided by 3");
        for (int i=1;i<=500;i++){
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n");
        System.out.println("Numbers that can be divided by 5");
        for (int i=1;i<=500;i++){
            if (i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n");
        System.out.println("Numbers that can be divided by 15");
        for (int i=1;i<=500;i++){
            if (i%15==0){
                System.out.print(i+" ");
            }
        }

    }
}
