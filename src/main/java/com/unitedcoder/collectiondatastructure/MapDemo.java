package com.unitedcoder.collectiondatastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> age=new HashMap<>();
        age.put("Emin",35);
        age.put("Aynur",20);
        age.put("Halid",25);
        System.out.println(age.get("Halid"));
        age.replace("Aynur",50);
        System.out.println(age.get("Aynur"));

        Set<String> keys=age.keySet();
        System.out.println(keys);

        for (Map.Entry entry: age.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }


    }
}
