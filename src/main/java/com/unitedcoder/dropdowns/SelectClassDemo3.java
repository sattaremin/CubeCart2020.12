package com.unitedcoder.dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDemo3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/r.php?locale=en_US&display=page\n");
        driver.manage().window().maximize();
        List<WebElement> options=driver.findElements(By.xpath("//*[@id=\"month\"]/option"));
        for (int i=0;i<options.size();i++){
            System.out.println(options.get(i).getText());
        }
        

    }
}
