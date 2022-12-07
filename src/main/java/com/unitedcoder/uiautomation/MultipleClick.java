package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(chromeOptions);
        //driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/\n");
        driver.manage().window().maximize();
        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.id("hrefIncChd")).click();

        for (int i=0;i<=3;i++){
            Thread.sleep(2000);
            driver.findElement(By.id("hrefIncChd")).click();
        }

        driver.close();
        driver.quit();
    }
}
