package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(50);    list1.add(20);
        list1.add(60);    list1.add(30);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(list1);
        System.out.println(list2);
        Object[] array=list1.toArray();
        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
