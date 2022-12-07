package com.unitedcoder.homework.allhomework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Week8Day3ArraySort {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*91+10);

        }
        System.out.println("10 Random numbers: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Ascending order: "+Arrays.toString(arr));
        System.out.print("Descending order: ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
