package com.unitedcoder.loops;

public class LoopBreakDemo {
    public static void main(String[] args) {
        int i=0;
        for (i = 0; i < 10; i++){
            if (i == 4){
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
        System.out.print("Final value: "+i+" ");
    }
}
