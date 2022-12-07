package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        File fileToRead=new File("doc"+File.separator+"myFile.txt");
        String fileContent=null;
        try {
            fileContent= FileUtils.readFileToString(fileToRead);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileContent);
    }

    public static String getCurrentDateTime(){
        DateTime dateTime=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyy-MM-dd-HH-mm-ss-SSS");
        return dateTime.toString(formatter);

    }

}
