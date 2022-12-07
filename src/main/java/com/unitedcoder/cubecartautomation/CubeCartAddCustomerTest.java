package com.unitedcoder.cubecartautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CubeCartAddCustomerTest {
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
        CustomerInfo customerInfo=new CustomerInfo("Sattar"+System.currentTimeMillis(),
                "Emin"+System.currentTimeMillis(),
                "Mr",
                "Emin"+System.currentTimeMillis()+"@gmail.com");
        WebElement customerLink=driver.findElement(By.linkText("Customer List"));
        customerLink.click();
        WebElement addCustomerLink= driver.findElement(By.linkText("Add Customer"));
        addCustomerLink.click();
        WebElement titLeField= driver.findElement(By.id("cust-title"));
        titLeField.sendKeys(customerInfo.getTitle());
        WebElement firstNameField=driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customerInfo.getFirstName());
        WebElement lastNameField=driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(customerInfo.getLasName());
        WebElement typeDropdown= driver.findElement(By.id("cust-type"));
        Select select=new Select(typeDropdown);
        select.selectByValue("2");
        WebElement email=driver.findElement(By.id("cust-email"));
        email.sendKeys(customerInfo.getEmail());
        WebElement saveButton= driver.findElement(By.name("save"));
        saveButton.click();
        WebElement successMessage= driver.findElement(By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if (successMessage.isDisplayed()){
            System.out.println("Customer Successfully Added");
        } else {
            System.out.println("Could not add the customer");
        }

        WebElement logout= driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        logout.click();
        driver.close();
        driver.quit();


    }


}
