package com.unitedcoder.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.SimpleTimeZone;

public class JavaDateTimeDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat dateFormat=new SimpleDateFormat("M-d-yyyy");
        System.out.println(dateFormat.format(date));
        SimpleDateFormat dateFormat1=new SimpleDateFormat("M-d-yyyy hh:mm:ss");
        System.out.println(dateFormat1.format(date));
        System.out.println("++++=+==========");
        LocalDateTime time=LocalDateTime.now();
        System.out.println(time);
        System.out.println(time.getYear());
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getMonth());
        System.out.println(time.plusMonths(2));
        System.out.println(time.plusYears(3));
        System.out.println(time.minusDays(10));
    }
}
