package com.unitedcoder.homework.cubecartinventorymodule;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoginClass {

    public static String readFromConfigProperties(String fileName, String key){
        Properties properties=new Properties();
        String value;
        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        value=properties.getProperty(key);
        System.out.printf("%s=%s",key,value);
        return value;
    }



}
