package com.unitedcoder.datetime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class JodaDateTimeDemo {
    public static void main(String[] args) {
        DateTime time=new DateTime();
        System.out.println(time);
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-hh-mm-s-SS");
        System.out.println(time.toString(formatter));

        DateTime universalTime=new DateTime(DateTimeZone.UTC);
        System.out.println(universalTime);
        DateTime istanbul=new DateTime(DateTimeZone.forID("Europe/Istanbul"));
        System.out.println(istanbul);


        Set<String> timeZone= ZoneId.getAvailableZoneIds();
//        for (String z:timeZone){
//            System.out.println(z);
//        }

        System.out.println(universalTime.getDayOfMonth());
        System.out.println(universalTime.getDayOfYear());

        DateTime.Property dayName=universalTime.dayOfWeek();
        System.out.println(dayName.getAsText());
        System.out.println(universalTime.plusMonths(2));

        DateTime beginDateTime=new DateTime("2020-10-16");
        DateTime executionTime=new DateTime();
        Period period=new Period(beginDateTime,executionTime, PeriodType.days());
        System.out.println(period.getDays());
    }
}
