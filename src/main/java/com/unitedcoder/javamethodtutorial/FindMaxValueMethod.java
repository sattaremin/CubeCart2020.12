package com.unitedcoder.javamethodtutorial;

public class FindMaxValueMethod {

    //Method for find a max value in an array

    public int findMaxValue(int[] array){
        int maxValue=0;
        for (int i=0;i<array.length;i++){
            if (maxValue<array[i]){
                maxValue=array[i];
            }
        }
        return maxValue;
    }

    public int findMinValue(int[] arr){
        int minValue=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<minValue){
                minValue=arr[i];
            }
        }
        return minValue;
    }



}
