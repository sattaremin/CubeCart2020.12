package com.unitedcoder.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.ClickAndHoldAction;

public class AmazonSearch {
    public static void main(String[] args) throws InterruptedException {
        //Define driver--Chrome driver
/*        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
        //Define chrome driver object
        WebDriver chromeDriver=new ChromeDriver();
        //Open amazon home page
        chromeDriver.get("https://www.amazon.com/");
        //chromeDriver.navigate().to("https://www.amazon.com/");
        //set browser size
        chromeDriver.manage().window().maximize();
        //Search for product
        WebElement searchBox=chromeDriver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("AirPod"+ Keys.ENTER);
        chromeDriver.close();
 */

        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        final WebDriver chromeDriver=new ChromeDriver();
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
