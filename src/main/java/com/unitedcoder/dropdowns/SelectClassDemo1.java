package com.unitedcoder.dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDemo1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/\n");
        driver.manage().window().maximize();
        WebElement currencyDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select=new Select(currencyDropdown);
        select.selectByVisibleText("AED");
       // select.selectByValue("AED");
       // select.selectByIndex(2);

        List<WebElement> options=select.getOptions();
//        for (int i=0;i< options.size();i++){
//            String currencyValue=options.get(i).getText();
//            if (currencyValue.equalsIgnoreCase("usd")){
//                options.get(i).click();
//                break;
//            }
//        }

        for (WebElement a:options){
            System.out.println(a.getText());
            if (a.getText().equalsIgnoreCase("usd")){
                a.click();
                break;
            }
        }
    }
}
