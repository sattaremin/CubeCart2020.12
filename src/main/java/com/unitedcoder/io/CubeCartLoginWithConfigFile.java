package com.unitedcoder.io;

import com.unitedcoder.configutility.ApplicationConfig;
import com.unitedcoder.cubecartautomation.LoginUser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartLoginWithConfigFile {
    public static void main(String[] args) throws InterruptedException {
        String fileName="config.properties";
        String userName=ApplicationConfig.readConfigProperties(fileName,"username");
        String password=ApplicationConfig.readConfigProperties(fileName,"password");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        String url;
        if (Integer.parseInt(ApplicationConfig.readConfigProperties(fileName,"qa"))==1){
            url=ApplicationConfig.readConfigProperties(fileName,"qaUrl");
        } else {
            url=ApplicationConfig.readConfigProperties(fileName,"prod-url");
        }
        driver.get(url);
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField=driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement logoutLink = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        if (logoutLink.isDisplayed()){
            System.out.println("Login Test Passed");

        } else {
            System.out.println("failed");

        }
        driver.close();
        driver.quit();



    }
}
