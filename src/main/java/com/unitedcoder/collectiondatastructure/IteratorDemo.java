package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(50);    list1.add(20);
        list1.add(60);    list1.add(30);

        Iterator<Integer> iterator=list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(list1);

        ListIterator listIterator=list2.listIterator(3);
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.next()+" ");
        }


    }
}
