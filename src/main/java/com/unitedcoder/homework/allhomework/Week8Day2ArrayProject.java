package com.unitedcoder.homework.allhomework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Week8Day2ArrayProject {
    public static void main(String[] args) {
        int evenNumberCount=0;
        int oddNumberCount=0;
        int numbersDivided=0;
        int sum=0;
        double average=30;
       int[] arr=new int[30];
       for (int i=0;i< arr.length;i++){
           arr[i]=(int)(Math.random()*100+1);
           if (i%2==0){
               evenNumberCount++;
           }
           if (i%2!=0){
               oddNumberCount++;
           }
           if (i%3==0){
               numbersDivided++;
           }
           sum+=arr[i];
       }
        System.out.println("30 random numbers between 1 and 100: "+Arrays.toString(arr));
        System.out.println("Even numbers are: "+evenNumberCount);
        System.out.println("Odd Numbers are: "+oddNumberCount);
        System.out.println("Numbers that can be divided by three: "+numbersDivided);
        System.out.println("The sum of the numbers: "+sum);
        System.out.println("The average of the numbers: "+sum/average);
        Arrays.sort(arr);
        System.out.println("Ascending order: "+Arrays.toString(arr));
        System.out.print("Descending order: ");
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }


    }
}
