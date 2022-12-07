package com.unitedcoder.homework.writetestwithautomation;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

public class TestHelper {

    public static String getDate(){
        DateTime dateTime=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd");
        return dateTime.toString(formatter);

    }
    public static String getCurrentTime(){
        DateTime d=new DateTime();
        DateTimeFormatter formatter=DateTimeFormat.forPattern("HH-mm-ss-SS");
        return d.toString(formatter);

    }
    public static String getCurrentUser(){
        String currentUser=System.getProperty("user.name");
        return currentUser;
    }
}
