package com.unitedcoder.javamethodtutorial;

import com.unitedcoder.cubecartautomation.CustomerInfo;
import com.unitedcoder.cubecartautomation.LoginUser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CubeCartAddCustomerTest1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(options);
        CustomerObjectMethods methods=new CustomerObjectMethods(driver);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        LoginUser loginUser=new LoginUser("testautomation1","automation123!");
        CustomerInfo info=new CustomerInfo("Mehmet","Emin","mr",
                "sattar"+System.currentTimeMillis()+"@gmail.com");
        methods.logIn(loginUser);
        methods.addCustomer(info);
        methods.verifyCustomerAddedSuccessfully();
        methods.logout();



    }
}
