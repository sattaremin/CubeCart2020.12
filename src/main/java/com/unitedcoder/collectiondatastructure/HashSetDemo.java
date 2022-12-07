package com.unitedcoder.collectiondatastructure;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer>  set1=new HashSet<>();
        set1.add(100);    set1.add(200);
        set1.add(300);    set1.add(50);
        set1.add(70);     set1.add(20);
        System.out.println(set1);

        LinkedList list=new LinkedList<>();
        list.add(100);    list.add(200);
        list.add(300);    list.add(50);
        list.add(70);     list.add(20);
        System.out.println(set1);

        //Printing out the Hashset by using for each
        int sum=0;
        for (int s:set1){
            sum+=s;
            System.out.print(s+" ");
        }
        System.out.println("The sum opf the numbers: "+sum);

        //Converting Hashset to Iterator in order to print out the date by using Has next function
        Iterator<Integer> iterator=set1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();

        //Convert to Object
        Object[] array=set1.toArray();
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }



    }
}
