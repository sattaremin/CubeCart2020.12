package com.unitedcoder.oopsconcept.inheritancetutorial;

import com.unitedcoder.cubecartautomation.CustomerInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CubeCartAddCustomerTest extends BaseClass{
    public static boolean addCustomerTest(CustomerInfo customerInfo){
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
            return true;
        } else {
            System.out.println("Could not add the customer");
            return false;
        }
    }

    public static void main(String[] args) {
        openBrowser();
        login("testautomation1","automation123!");
        CustomerInfo customerInfo=new CustomerInfo("mehmet","emin","mr","mehme12@gmail.com");
        addCustomerTest(customerInfo);
        logout();
        closeBrowser();
    }

}
