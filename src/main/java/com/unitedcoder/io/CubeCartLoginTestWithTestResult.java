package com.unitedcoder.io;

import com.unitedcoder.cubecartautomation.LoginUser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartLoginTestWithTestResult {
    public static void main(String[] args) throws InterruptedException {

        LoginUser loginUser=new LoginUser();
        String[] credential={"testautomation1","automation123!"};
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
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
        String testResult="";
       if (logoutLink.isDisplayed()){
           //System.out.println("Login Test Passed");
           testResult="Login Test Passed";
       } else {
           //System.out.println("failed");
           testResult="failed";
       }
        FileUtility fileUtility=new FileUtility();
        fileUtility.writeToFile("doc","CubeCart-test"+FileRead.getCurrentDateTime(),
                ".txt",testResult);
        driver.close();
        driver.quit();



    }


}
