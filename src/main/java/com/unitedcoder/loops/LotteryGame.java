package com.unitedcoder.loops;

import java.util.Random;
import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int WinCounts=0;
        int totalGames=10;
        for (int i=1;i<=totalGames;i++){
            System.out.println("Enter your lottery number");
            Random random=new Random();
            int lotteryNumber=random.nextInt(10);
            int yourNumber=scan.nextInt();
            System.out.printf("Lottery Number= %d, Your Number = %d ",lotteryNumber,yourNumber);
            if (lotteryNumber==yourNumber){
                System.out.println("You won the lottery");
                WinCounts++;
            } else {
                System.out.println("Try again you lost");
            }
            System.out.printf("Remaining game count: %d ",totalGames);
        }
        System.out.println("");
        System.out.printf("Your total win is: %d ",WinCounts);
    }
}
