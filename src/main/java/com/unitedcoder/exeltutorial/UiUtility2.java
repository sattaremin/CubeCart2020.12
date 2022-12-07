package com.unitedcoder.exeltutorial;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class UiUtility2 {
    public  void takeScreenShot(String folder, String fileName, WebDriver driver){
        UiUtility2 uiUtility2=new UiUtility2();
        File imageFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(imageFile,new File(folder+File.separator+uiUtility2.getCurrentTime()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getCurrentTime(){

        DateTime dateTime = new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        return dateTime.toString((formatter));

    }
    public String getUserName(){
        String user=System.getProperty("user.name");
        return user;
    }
}
