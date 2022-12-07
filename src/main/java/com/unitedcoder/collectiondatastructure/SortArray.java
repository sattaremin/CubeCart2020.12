package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter length of an array: ");

        int length=scanner.nextInt();
        int[] arr=new int[length];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);

            }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
