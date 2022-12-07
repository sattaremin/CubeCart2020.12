package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethodClass {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(100,50,90,40,200);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
