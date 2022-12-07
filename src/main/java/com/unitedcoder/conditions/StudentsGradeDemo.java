package com.unitedcoder.conditions;

import java.util.Scanner;

public class StudentsGradeDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your score!");
        int score=input.nextInt();
        if (score<=100) {
            if (score >= 90 && score <= 100)
                System.out.println("Great!! good job!! your grade is 'A' you win a car");
            else if (score >= 80 && score < 90) {
                System.out.println("Good job your is B");

            } else if (score >= 70 && score < 80) {
                System.out.println("Your grade is C");

            } else if (score >= 60 && score < 70) {
                System.out.println("Your grade is D");
            } else {
                System.out.println("You failed");
            }
        } else {
            System.out.println("Wrong score number please enter a number between 0-100");
        }
    }
}
