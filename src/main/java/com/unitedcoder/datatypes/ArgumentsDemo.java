package com.unitedcoder.datatypes;

public class ArgumentsDemo {
    public static void main(String[] args) {
        //  Define Arguments args[0]=100
        int i1=Integer.parseInt(args[0]);
        int i2=Integer.parseInt(args[1]);
        int i3=Integer.parseInt(args[2]);
        int i4=Integer.parseInt(args[3]);
        System.out.printf("%d + %d + %d + %d=%d",i1,i2,i3,i4,i1+i2+i3+i4);
    }
}
