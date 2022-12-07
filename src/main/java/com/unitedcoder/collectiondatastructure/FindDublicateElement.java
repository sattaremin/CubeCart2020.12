package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDublicateElement {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Pineapple");
        fruits.add("Grape");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");

        HashSet<String> set=new HashSet<>();
        for (int i=0;i<fruits.size();i++){
           String f=fruits.get(i);
           if (set.add(f)==false){
               System.out.println(f+"  is duplicated!");
           }
        }

    }
}
