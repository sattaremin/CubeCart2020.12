package com.unitedcoder.configutility;



public class ReadFromConfig {
    public static void main(String[] args) {
        String fileName="config.properties";
        ApplicationConfig.readConfigProperties(fileName,"password");
        ApplicationConfig.readConfigProperties(fileName,"prod-url");
        ApplicationConfig.readConfigProperties(fileName,"timeout");
    }
}
