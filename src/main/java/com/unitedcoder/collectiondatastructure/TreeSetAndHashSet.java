package com.unitedcoder.collectiondatastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetAndHashSet {
    public static void main(String[] args) {
        //it gives the elements mixed way
        Set<Integer> hasSet=new HashSet<>();
        hasSet.add(50);   hasSet.add(60);
        hasSet.add(90);   hasSet.add(70);
        hasSet.add(100);   hasSet.add(75);
        System.out.println(hasSet);
        //it gives the elements by order
        Set<Integer> set=new LinkedHashSet<>();
        set.add(15);   set.add(25);
        set.add(45);   set.add(35);
        set.add(10);   set.add(55);
        System.out.println(set);
        //it gives the elements by its value from small to big
        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(28);   treeSet.add(33);
        treeSet.add(35);   treeSet.add(18);
        treeSet.add(24);   treeSet.add(22);
        System.out.println(treeSet);

        //String it gives the elements by alphabetic order
        Set<String> treeSet1=new TreeSet<>();
        treeSet1.add("Banana");  treeSet1.add("Pineapple");
        treeSet1.add("Mango");   treeSet1.add("Watermelon");
        System.out.println(treeSet1);

    }
}
