package com.unitedcoder.collectiondatastructure;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //integer array
        int[] arr=new int[13];// can store 12 value
        arr[0]=10;    arr[1]=15;
        arr[2]=20;    arr[3]=130;
        arr[4]=140;   arr[5]=50;
        arr[6]=60;    arr[7]=70;
        arr[8]=90;    arr[9]=110;
        arr[10]=65;   arr[11]=75;
        arr[12]=89;

        System.out.println(arr[8]);
        System.out.println(arr.length);

        for (int i=0;i<13;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int a:arr){
            System.out.print(a+" ");
        }



    }
}
