package com.unitedcoder.loops;

import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {
        //Scanner 0

        Scanner scanner=new Scanner(System.in);
        int positiveNumbers=0;
        int negativeNumbers=0;
        while (true){
            int number=scanner.nextInt();
            if (number>0){
                positiveNumbers++;
            } else if (number<0){
                negativeNumbers++;
            } else {
                break;
            }
        }
        System.out.println("Positive Numbers: "+positiveNumbers);
        System.out.println("Negative Numbers: "+negativeNumbers);
    }
}
