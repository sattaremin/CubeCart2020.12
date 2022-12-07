package com.unitedcoder.datatypes;

public class JavaOtherOperators {
    public static void main(String[] args) {
        //Assignment operators = += -+ *= /=
        int x1=100;//Assignment
        x1++;
        x1+=5;  //x1=x1+5
        System.out.println(x1);
        x1-=20;  //x1=x1-20
        System.out.println(x1);
        x1*=2;  //x1=x1*2
        System.out.println(x1);
        x1/=2;  //x1=x1/2
        System.out.println(x1);
        x1%=3;  //x1=x1%3
        System.out.println(x1);

        //comparison operators
        int i1=200;
        int i2=300;
        int i3=200;
        System.out.println(i1==i2);
        System.out.println(i1==i3);
        System.out.println(i1>i2);
        System.out.println(i2<i3);
        System.out.println(i1>=i3);
        System.out.println(i1!=i2);
        System.out.println(i1<=i2);

        System.out.println("Practice");
        //practice
        int p1=150;
        int p2=200;
        int p3=150;
        System.out.println(p1==p3);//tr
        System.out.println(p1>=p2);//fl
        System.out.println(p2>=p1);//tr
        System.out.println(p1<p3);//fl
        System.out.println(p3!=p1);//fl
        System.out.println(p2<=p1);//fl
        System.out.println("Practice");

        //Logical Operators
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;

        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        System.out.println(b1&&b3);
        System.out.println(b2||b3);
        System.out.println(!(b1&&b2));

        //Practice
        System.out.println("--practice2--");
        int i5=50;
        System.out.println(i5>100&&i5<60);//fl
        System.out.println(i5<60&&i5>40);//tr
        System.out.println(i5>40||i5>100);//tr
        System.out.println(!(i5>100&&i5<100));//tr
        System.out.println(!(i5==50||i5<=100));//fl
        System.out.println(!(i5<40&&i5>100));//tr
        System.out.println(i5==50&&i5>=40);//tr
        System.out.println("--Practice2--");




        int i4=30;
        System.out.println(i4<100&&i4>80);
        System.out.println(i4<20||i4>10);
        System.out.println(!(i4>50));


        //Bitwise operator &  / byte
        byte d1=001;
        byte d2=110;
        System.out.println(d1&d2);//000
        System.out.println(b1|b2);//111

        //Practice
        System.out.println("--Practice3--");
        byte d3=0101;
        byte d4=0011;
        System.out.println(d3&d4);//0001
        System.out.println(d3|d4);//0111

        byte d5=010;
        byte d6=101;
        System.out.println(d5&d6);
        System.out.println(d5|d6);









    }
}
