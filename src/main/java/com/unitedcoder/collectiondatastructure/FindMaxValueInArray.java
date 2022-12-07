package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter length of an array: ");

        int length=scanner.nextInt();
        int[] arr=new int[length];
        int minValue=100;
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
            if (arr[i]<minValue){
                minValue=arr[i];

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max number in this array is: "+minValue);
    }
}
