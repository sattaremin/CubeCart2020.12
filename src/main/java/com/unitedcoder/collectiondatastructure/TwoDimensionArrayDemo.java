package com.unitedcoder.collectiondatastructure;

public class TwoDimensionArrayDemo {
    public static void main(String[] args) {
        int[][] array={
                {9,5,20},
                {20,32},
                {45,52,65,65,5},
                {1,5,2,4}
        };
        System.out.println(array.length);//4
        System.out.println(array[1]);//20
        System.out.println(array[3][2]);//2
        System.out.println(array[0][2]);//20

        System.out.println("=============");
        int sum=0;
        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                sum+=array[i][j];
                System.out.print(array[i][j]+" ");
            }
            System.out.println("Each sum: "+sum);
        }
        System.out.println("The sum of the arrays"+sum);
    }
}
