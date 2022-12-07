package com.unitedcoder.loops;

public class ForLoopDemo3 {
    public static void main(String[] args) {

        int sum=0;
        for (int i=0;i<=10;i++){
            sum+=i;//sum=sum+i
            System.out.printf("i=%d sum=%d\n",i,sum);
        }
        System.out.println("Total sum:: "+sum);

        System.out.println("============");

        //1-5 factorial 1*2*3*4*5
        int factorial=1;
        for (int i=5;i<=1;i--){
            factorial*=i;//factorial=factorial*i;
            System.out.printf("i=%d factorial=%d\n",i,factorial);

        }
        System.out.println("Factorial: "+factorial);

        int evenNumberCounts=0;
        for (int j=0;j<=100;j++) {
            if (j != 0 && j % 2 == 0) {
               evenNumberCounts++;
            }
        }
        System.out.println("Total even number is: "+evenNumberCounts);
    }
}
