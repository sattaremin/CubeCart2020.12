package com.unitedcoder.collectiondatastructure;

public class SplitDemo {
    public static void main(String[] args) {
        String school="United_Coder";
        String s="Hello,World";

        String[] array1=school.split("_");
        for (String a:array1){
            System.out.println(a);
        }
        System.out.println(array1[0]);
        System.out.println(array1[1]);

        String[] s1=s.split(",");
        for (String s2:s1){
            System.out.println(s2);
        }

    }
}
