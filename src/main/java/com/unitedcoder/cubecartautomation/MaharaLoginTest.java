package com.unitedcoder.cubecartautomation;

import com.unitedcoder.collectiondatastructure.FindDublicateElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaharaLoginTest {
    public static void main(String[] args) throws InterruptedException {
        LoginUser loginUser=new LoginUser();
        String[] credential={"admin","MaharaDemo"};
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://demo.mahara.org/");
        WebElement userNameField=driver.findElement(By.id("login_login_username"));
        loginUser.setUserName(credential[0]);
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordFiled=driver.findElement(By.id("login_login_password"));
        loginUser.setPassword(credential[1]);
        passwordFiled.sendKeys(loginUser.getPassword());
        WebElement loginButton=driver.findElement(By.id("login_submit"));
        loginButton.click();
        driver.findElement(By.cssSelector("span[class='icon icon-chevron-down collapsed']")).click();
        Thread.sleep(3000);
        WebElement logoutLink=driver.findElement(By.id("logoutbutton"));
        if (logoutLink.isDisplayed()){
            System.out.println("Login Test Passed");
        } else {
            System.out.println("Login test failed");
        }
//        driver.close();
//        driver.quit();

    }
}
