package com.unitedcoder.dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDemo2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/r.php?locale=en_US&display=page\n");
        driver.manage().window().maximize();
        WebElement month=driver.findElement(By.id("month"));
        Select select=new Select(month);
        
        List<WebElement> options=select.getOptions();
        for (int i=0;i< options.size();i++){
            String currencyValue=options.get(i).getText();
            if (currencyValue.equalsIgnoreCase("may")){
                options.get(i).click();
                break;
            }
        }
    }
}
