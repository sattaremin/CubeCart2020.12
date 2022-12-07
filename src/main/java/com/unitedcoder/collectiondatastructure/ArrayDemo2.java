package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a=new int[]{20,40,50,60,56,30,19,39,45};
        int[] b={2,45,6,7,8,98,675,6};

        System.out.println(a[5]);
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(b[4]);
        System.out.println(Arrays.stream(a).max());

        int sum=0;
        for (int i=0;i<b.length;i++){
            sum+=b[i];
        }
        System.out.println(sum);
        int sum1=0;
        for (int r:b){
            sum1+=r;
        }
        System.out.println(sum1);
    }
}
