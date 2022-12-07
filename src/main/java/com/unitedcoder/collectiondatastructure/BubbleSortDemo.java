package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] a={20,10,5,30,25,70,55,90,77,0,60};
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    int tampValue=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tampValue;

                }
            }

        }
        System.out.println("Ascending numbers: "+Arrays.toString(a));
    }
}
