package com.unitedcoder.datatypes;


public class StringDemo2 {
    public static void main(String[] args) {
        //String Index and length
        String city="Amsterdam";
        String country="Netherland";
        String course="Java Selenium Test Autimation";
        String space=" ";
        int l=city.length();
        System.out.println(l);
        int i1=country.indexOf("h");
        System.out.println(i1);
        System.out.println(course.indexOf("Test"));
        System.out.println(space.length( ));


        //upper case lower case---java case-sensitive
        System.out.println(city.toUpperCase());
        System.out.println(course.toLowerCase());
        System.out.println(city.toLowerCase());

        //replace
        course=course.replace("Java","Python");
        System.out.println(course);
        String date="03-09-2022";
        date=date.replace("-","/");
        System.out.println(date);

        String value="2343, 5445";
        value=value.replace(", ",".");
        System.out.println(value);
        String result="about 13.880.000.000 results";
        result=result.replace("about","").replace("results","");
        System.out.println(result.trim());
        //Sub string

        String s1="Java";
        String s2="java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //String concatentaion
        int i3=100;
        int i2=200;
        System.out.println(i3+i2);



    }
}
