package com.unitedcoder.homework.allhomework;

import java.util.Scanner;

public class Week7Day3Loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number=input.nextInt();
        System.out.println("The prime numbers are: ");
        for (int i=2;i<=number;i++){
            int counter=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    counter++;
                }
            }
            if (counter==2){
                System.out.print(i+" ");
            }

        }

    }
}
