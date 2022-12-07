package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Objects;

public class JavaGenerics {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(100);   list.add(10);
        list.add(50);    list.add(60);
        for (Object a:list){
            System.out.println((Integer)a*2);
        }

    }
}
