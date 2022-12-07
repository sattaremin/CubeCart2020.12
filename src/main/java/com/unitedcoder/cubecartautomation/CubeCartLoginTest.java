package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartLoginTest {
    public static void main(String[] args) throws InterruptedException {

        LoginUser loginUser=new LoginUser();
        String[] credential={"testautomation1","automation123!"};
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.setHeadless(true);
        ChromeDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        WebElement userNameField=driver.findElement(By.id("username"));
        loginUser.setUserName(credential[0]);
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField=driver.findElement(By.id("password"));
        loginUser.setPassword(credential[1]);
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement logoutLink = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        //WebElement dashBoard=driver.findElement(By.xpath("//*[@id=\"dashboard\"]/h3"));

       if (logoutLink.isDisplayed()){
           System.out.println("Login Test Passed");
       } else
           System.out.println("failed");

       driver.quit();


    }


}
