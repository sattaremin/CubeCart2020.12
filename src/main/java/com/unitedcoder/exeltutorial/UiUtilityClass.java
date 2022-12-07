package com.unitedcoder.exeltutorial;

import com.unitedcoder.configutility.ApplicationConfig;
import com.unitedcoder.oopsconcept.inheritancetutorial.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class UiUtilityClass extends BaseClass {

    private WebDriver driver;

    public UiUtilityClass(WebDriver driver) {
        this.driver = driver;
    }


    public void takeScreenShot(String imageName){
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File screenShotFile=screenshot.getScreenshotAs(OutputType.FILE);
        String folder= ApplicationConfig.readConfigProperties("config.properties","screenShot");
        File file=new File(folder+File.separator+imageName);
        try {
            FileUtils.copyFile(screenShotFile,file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
