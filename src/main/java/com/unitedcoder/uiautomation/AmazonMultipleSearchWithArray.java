package com.unitedcoder.uiautomation;

import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Date;

public class AmazonMultipleSearchWithArray {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(chromeOptions);
        DateTime browserOpenedTime=new DateTime();
        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        String[] productName={"Ipad","Java Oracle Book","Hard Disk"};
        for (String keyWords:productName){
            WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(keyWords+ Keys.ENTER);
            driver.navigate().back();
        }
        DateTime testEndTime=new DateTime();
        Period period=new Period(browserOpenedTime,testEndTime, PeriodType.seconds());
        System.out.println("Total Search Time: "+period.getSeconds());
        driver.close();
        driver.quit();
    }
}
