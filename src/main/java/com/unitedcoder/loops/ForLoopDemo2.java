package com.unitedcoder.loops;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=10;i++){
            sum+=i;
            System.out.printf("i=%d sum=%d \n",i,sum);
        }
        System.out.println(sum);
    }
}
