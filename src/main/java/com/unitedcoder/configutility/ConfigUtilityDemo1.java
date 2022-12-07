package com.unitedcoder.configutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtilityDemo1 {
    public static void main(String[] args){
        Properties properties=new Properties();
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream("config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(properties.getProperty("username"));
        properties.setProperty("timeout","20");
        System.out.println(properties.getProperty("timeout"));
        FileOutputStream fileOutputStream= null;
        try {
            fileOutputStream = new FileOutputStream("config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.store(fileOutputStream,null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //properties.setProperty("timeout","30");
        System.out.println(properties.getProperty("timeout"));
    }
}
