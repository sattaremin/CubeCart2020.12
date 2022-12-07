package com.unitedcoder.loops;

public class LoopContinueDemo {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            if (i % 5 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
