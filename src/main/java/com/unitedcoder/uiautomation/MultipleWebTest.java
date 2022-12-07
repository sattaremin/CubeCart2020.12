package com.unitedcoder.uiautomation;

import com.google.common.base.Stopwatch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWebTest {
    public static void main(String[] args) throws InterruptedException {
        Map<String,String> webSite=new HashMap<>();
        webSite.put("Google","https://www.google.com");
        webSite.put("YouTube","https://www.youtube.com");
        webSite.put("Amazon","https://www.amazon.com");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(chromeOptions);
        Set<String> keys=webSite.keySet();
        for (String k:keys){
            driver.get(webSite.get(k));
            StopWatch watch=new StopWatch();
            watch.start();
            if (driver.getTitle().contains(k)){
                System.out.println(k+" Opened Successfully, Test Passed");
                watch.stop();
                System.out.println(k+" Opened within "+watch.getTime(TimeUnit.MICROSECONDS));
            }
        }

        driver.close();
        driver.quit();

    }
}
