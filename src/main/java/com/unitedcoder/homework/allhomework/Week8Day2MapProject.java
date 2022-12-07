package com.unitedcoder.homework.allhomework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Week8Day2MapProject {
    public static void main(String[] args) {
        Map<String,String> cities=new HashMap<>();
        cities.put("My","Maryland");
        cities.put("VA","Virginia");
        cities.put("NY","New York");

        Set<String> keys=cities.keySet();
        int count=0;
        for (String k:keys) {
            System.out.println(keys + ": " + cities.get(k));
            count++;
        }
        System.out.println("The number of keys: "+count);
        System.out.println();

        for (Map.Entry entry:cities.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
