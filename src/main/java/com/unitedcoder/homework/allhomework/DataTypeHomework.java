package com.unitedcoder.homework.allhomework;

public class DataTypeHomework {
    public static void main(String[] args) {
        //The sum of the two numbers
        int num1 = 9;
        int num2 = 7;
        int num3 = num1 + num2;
        int num4 = num1 - num2;
        //The sum of the two numbers
        System.out.printf("The sum of the two numbers is: %d\n",num3);
        //The difference of the two numbers
        System.out.printf("The difference of the two numbers: %d + %d = %d\n ",num1,num2, num1 + num2);
        System.out.printf("The difference of the two numbers: %d - %d = %d\n ",num1,num2, num1 - num2);
        //Multiplication of the two numbers
        System.out.printf("The product of the two numbers is: %d\n",num1*num2);
        //The average of the two numbers
        System.out.printf("The average of the tow numbers is: (%d+%d)/2=%d \n",num1,num2,(num3)/2);
        //The absolute value of the two numbers
        System.out.printf("The absolute value of the two number is %d\n",Math.abs(num4));
        //The maximum of the two numbers
        System.out.printf("The maximum of the two numbers is: " + Math.max(num2,num1));
        //The minimum of the two numbers
        System.out.printf(" The minimum of the two numbers is: " + Math.min(num1,num2));
        System.out.println(" ");

        boolean n1 = num1==num2;
        boolean n2 = num1<=num2;
        boolean n3 = num1>=num2;
        boolean n4 = num1>num2;
        boolean n5 = num1<num2;
        boolean n6 = num1!=num1;
        System.out.printf("%d==%d %b\n",num1,num2,n1);
        System.out.printf("%d<=%d %b\n",num1,num2,n2);
        System.out.printf("%d>=%d %b\n",num1,num2,n3);
        System.out.printf("%d>%d %b\n",num1,num2,n4);
        System.out.printf("%d<%d %b\n",num1,num2,n5);
        System.out.printf("%d!=%d %b\n",num1,num2,n6);






    }
}
