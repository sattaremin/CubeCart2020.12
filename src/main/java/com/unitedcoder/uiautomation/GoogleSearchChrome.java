package com.unitedcoder.uiautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchChrome {
    public static void main(String[] args) throws InterruptedException {
        //Set up chromedriver
        WebDriverManager.firefoxdriver().setup();
        WebDriver chromeDriver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //final WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/");
        chromeDriver.manage().window().maximize();
        WebElement searchBox = chromeDriver.findElement(By.name("search_query"));
        Thread.sleep(5000);
        searchBox.click();
        searchBox.sendKeys("Uyghur" + Keys.ENTER);
        Thread.sleep(5000);
        WebElement searchButton = chromeDriver.findElement(By.id("search-icon-legacy"));
        searchButton.click();
        //Thread.sleep(5000);
        chromeDriver.close();



    }
}
