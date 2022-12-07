package com.unitedcoder.datatypes;

public class PrePostIncrementAndDecrement {
    public static void main(String[] args) {
        //Post-- first execute the operation then add plus one
        //Pre--  first add plus one then execute the operation

        int a=30;
        int b=50+(++a);
        int c=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("============");

        int a1=30;
        int b1=50+(a1++);
        int c1=a1++;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        System.out.println("===============");

        //pre decrement
        //post decrement

        int x1=10;
        int y1=--x1;
        System.out.println(x1);//9
        System.out.println(y1);//9

        int x2=20;
        int y2=(x2--)+90;//110
        int y3=(--x2)-20;//-2
        int y4=--y3;//-3
        int y5=y4--;
        System.out.println(x2);//18
        System.out.println(y2);//110
        System.out.println(y3);//-3
        System.out.println(y4);//-4
        System.out.println(y5);//-3

        System.out.println("=============================");

        int h1=10;
        int h2=(--h1)+20;//29
        int h3=(h1--)-10;//-1
        int h4=(--h1)+20;//27
        int h5=(++h1)+(h1--);//16
        int h6=(++h1)+(h1++);//16
        int h7=++h2+(h3--);//30
        int h8=(--h5)+(h5++);//
        int h9=h1;//9
        System.out.println(h1);//9
        System.out.println(h2);//30
        System.out.println(h3);//-2
        System.out.println(h4);//27
        System.out.println(h5);//16
        System.out.println(h6);//29
        System.out.println(h7);//0
        System.out.println(h8);//9
        System.out.println(h9);//9










    }
}
