package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //ArrayList<Integer> list=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(200);
        list.add(500);
        list.add(200);
        list.add(100);
        list.add(300);
        list.add(400);
        //size
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list);
        list.set(2,1000);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        int sum=0;
        for (int i=0;i<list.size();i++){
            sum+=list.get(i);
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(sum);
        list.remove(2);
        System.out.println(list);

    }
}
