package com.unitedcoder.datatypes;

import org.apache.commons.lang3.StringUtils;

public class DataTypeConversion2 {
    public static void main(String[] args) {
        //convert string to primitive data type
        int se1=500;
        String se2=String.valueOf(se1);
        System.out.println(se2+200);


        String s1="25";
        String price1="100$";
        String price2="140$";
        String price3="110$";
        int totalPrice=350;

        System.out.println(s1+100);
        int i1=Integer.parseInt(s1);
        System.out.println(String.format("Value after conversion is %s ",(i1+100)));
        String d1="2022-3-14";
        System.out.println(StringUtils.reverseDelimited(d1,'-'));

        price1=price1.replace("$","");
        int i2=Integer.parseInt(price1);
        price2=price2.replace("$","");
        int i3=Integer.parseInt(price2);
        price3=price3.replace("$","");
        int i4=Integer.parseInt(price3);
        int totalPriceAfter=i2+i3+i4;
        System.out.println(totalPrice==totalPriceAfter);

        String s2="true";
        boolean b1=Boolean.parseBoolean(s2);
        System.out.println(s2);

        //Convert primitive date type to string
        int e1=10000;
        int e2=9000;

        System.out.println(e1+e2);
        String b2=String.valueOf(e1);
        String b3=String.valueOf(e2);
        System.out.println(b2+b3);


    }
}
