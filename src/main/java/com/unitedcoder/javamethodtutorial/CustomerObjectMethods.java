package com.unitedcoder.javamethodtutorial;

import com.unitedcoder.cubecartautomation.CustomerInfo;
import com.unitedcoder.cubecartautomation.LoginUser;
import com.unitedcoder.cubecartautomation.TypeDropDownValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomerObjectMethods {
    //add customer delete customer edit customer
    WebDriver driver;

    public CustomerObjectMethods() {
    }

    public CustomerObjectMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void logIn(LoginUser user){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(user.getUserName());
        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.sendKeys(user.getPassword());
        WebElement login=driver.findElement(By.id("login"));
        login.click();

    }
    public void addCustomer(CustomerInfo customerInfo){
        WebElement customerListLink=driver.findElement(By.linkText("Customer List"));
        customerListLink.click();
        WebElement addCustomerLink=driver.findElement(By.xpath("//a[contains(text(),\"Add Customer\")]"));
        addCustomerLink.click();
        WebElement titleField=driver.findElement(By.id("cust-title"));
        titleField.sendKeys(customerInfo.getTitle());
        WebElement firstNameField=driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customerInfo.getFirstName());
        WebElement lastNameField=driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(customerInfo.getLasName());
        WebElement typeDropDown=driver.findElement(By.id("cust-type"));
        Select select=new Select(typeDropDown);
        select.selectByVisibleText(String.valueOf(TypeDropDownValue.UNREGISTERED_CUSTOMER.getValue()));
        WebElement emailField=driver.findElement(By.id("cust-email"));
        emailField.sendKeys(customerInfo.getEmail());
        WebElement saveButton=driver.findElement(By.name("save"));
        saveButton.click();
    }


    public boolean verifyCustomerAddedSuccessfully(){
        WebElement successMessage= driver.findElement(By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if (successMessage.isDisplayed()){
            System.out.println("Customer Added Successfully");
            return true;
        } else {
            System.out.println("Couldn't Added the Customer");
            return false;
        }

    }

    public void logout(){

        WebElement logout=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logout.click();
        driver.close();
        driver.quit();

    }


}
