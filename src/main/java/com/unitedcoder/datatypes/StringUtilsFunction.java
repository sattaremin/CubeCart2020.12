package com.unitedcoder.datatypes;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsFunction {
    public static void main(String[] args) {
        String s1="Learn Java is fun";
        String s2="Selenium,Test,Automation";
        String name="alim";
        String s="kjschbeddddcdjchdscds";

        System.out.println(StringUtils.reverse(s1));
        System.out.println(StringUtils.reverseDelimited(s1,' '));
        System.out.println(StringUtils.reverseDelimited(s2,','));
        System.out.println(StringUtils.capitalize(name));
        System.out.println(StringUtils.countMatches(s,"j"));
        System.out.println(StringUtils.isAllEmpty(name));

        /*
        String h1="How to learn Java Code In 2012";
        String h2="+90 552 715 17 95";
        String h3="Alim";

        System.out.println(StringUtils.reverse(h1));
        System.out.println(StringUtils.reverseDelimited(h1,' '));
        System.out.println(StringUtils.reverseDelimited(h2,' '));
        System.out.println(StringUtils.startsWith(h3,"a"));
        System.out.println(StringUtils.endsWithAny(h1,"1"));
        System.out.println(StringUtils.containsAny(h2,"5"));
         */







    }
}
