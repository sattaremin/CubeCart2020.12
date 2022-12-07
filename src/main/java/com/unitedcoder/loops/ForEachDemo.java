package com.unitedcoder.loops;

public class ForEachDemo {
    public static void main(String[] args) {
        //argument 4 value
        int sum=0;
        for (int i=0;i<4;i++){
            System.out.print(args[i]+" ");
            sum+=Integer.parseInt(args[i]);

        }
        System.out.println(sum);

        //for each loop
        int sum1=0;
        for (String value:args){
            sum1+=Integer.parseInt(value);

        }
        System.out.println(sum1);
    }
}
