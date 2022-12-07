package com.unitedcoder.collectiondatastructure;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //When we remove a Stack element by using poll or push it removes it from the bottom
        Stack<String> s1=new Stack<>();
        s1.push("Book1");
        s1.push("Book2");
        s1.push("Book3");
        s1.push("Book4");
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.search("Book2"));
        //s1.pop();
        //s1.pop();
        //s1.pop();
        System.out.println(s1.isEmpty());
        //s1.peek();
        System.out.println(s1);

     }
}
