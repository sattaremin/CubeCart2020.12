package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class ArraysObjectDemo {
    public static void main(String[] args) {
        int[] arr1={90,76,56,867,565};
        int[] arr2={56,67,7,67,56,45};
        int[] arr3=Arrays.copyOf(arr1,5);

        boolean result1= Arrays.equals(arr1,arr2);
        boolean result2= Arrays.equals(arr1,arr3);
        System.out.println(result2);
        System.out.println(result1);

        Arrays.fill(arr2,20);
        System.out.println(Arrays.toString(arr2));
        //System.out.println(Arrays.toString(arr3));
        System.out.println(arr3[4]);

        //Copy of two array
        int[] arr4=new int[arr1.length];
        for (int i=0;i<arr1.length;i++){
            arr4[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr4));

    }
}
