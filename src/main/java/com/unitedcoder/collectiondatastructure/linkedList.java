package com.unitedcoder.collectiondatastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        List<Integer> list2=new LinkedList<>();
        Queue<Integer> list3=new LinkedList<>();

        list.add(100);   list.add(20);
        list.add(90);   list.add(48);

        list.addFirst(25);
        list.addLast(35);
        System.out.println(list);

        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }





    }
}
