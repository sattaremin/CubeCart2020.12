package com.unitedcoder.homework.cubecartaddcustomerproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class CustomerAddAndUpdateBaseClass {

    WebDriver driver;

    public CustomerAddAndUpdateBaseClass() {
    }

    public CustomerAddAndUpdateBaseClass(WebDriver driver) {
        this.driver = driver;
    }

    public void openBrowser(String urlOne) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
    }

    public void logIn(String userName, String password) {
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement login = driver.findElement(By.id("login"));
        login.click();

    }


    public void addCustomers(List<CustomerAddressInfo> customerAddressInfo) throws InterruptedException {

        //Customer actions
        WebElement customerList = driver.findElement(By.linkText("Customer List"));
        customerList.click();

        for (CustomerAddressInfo customer : customerAddressInfo) {
            WebElement addProduct = driver.findElement(By.linkText("Add Customer"));
            addProduct.click();

            WebElement title=driver.findElement(By.id("cust-title"));
            title.sendKeys((customer.getTitle()));
            driver.findElement(By.id("cust-firstname")).sendKeys(customer.getFirstName());
            driver.findElement(By.id("cust-lastname")).sendKeys(customer.getLastName());
            WebElement type=driver.findElement(By.id("cust-type"));
            Select select=new Select(type);
            select.selectByValue("2");
            driver.findElement(By.id("cust-email")).sendKeys(customer.getEmail());
            driver.findElement(By.id("cust-phone")).sendKeys(customer.getPhone());
            driver.findElement(By.id("cust-mobile")).sendKeys(customer.getCellPhone());
            WebElement newsletter=driver.findElement(By.id("subscription_status"));
            Select select1=new Select(newsletter);
            select1.selectByValue("2");
            WebElement individualAddress = driver.findElement(By.linkText("Addresses"));
            individualAddress.click();
            WebElement addAddress = driver.findElement(By.linkText("Add Address"));
            addAddress.click();
            Thread.sleep(2000);
            driver.findElement(By.id("edit_description")).sendKeys(customer.getDescription());
            driver.findElement(By.id("edit_title")).sendKeys(customer.getaTitle());
            driver.findElement(By.id("edit_first_name")).sendKeys(customer.getaFirstName());
            driver.findElement(By.id("edit_last_name")).sendKeys(customer.getaLastName());
            driver.findElement(By.id("edit_company_name")).sendKeys(customer.getCompanyName());
            driver.findElement(By.id("edit_line1")).sendKeys(customer.getAddress());
            driver.findElement(By.id("edit_town")).sendKeys(customer.getTown());
            WebElement country=driver.findElement(By.id("edit_country"));
            Select select2=new Select(country);
            select2.selectByValue("792");
            driver.findElement(By.id("edit_state")).sendKeys(customer.getState());
            driver.findElement(By.id("edit_postcode")).sendKeys(customer.getZipCode());
            Thread.sleep(1000);
            WebElement add = driver.findElement(By.xpath("//input[@value=\"Add\"]"));
            add.click();
            Thread.sleep(1000);
            WebElement saveButton = driver.findElement(By.name("save"));
            saveButton.click();
            WebElement customerAdded=driver.findElement(By.xpath("//*[contains(text(),\"Customer successfully added.\")]"));
            if (customerAdded.isDisplayed()){
                System.out.println("Customer Added Successfully");
            } else {
                System.out.println("Failed To Add Customer");
            }
        }


    }


    public void updateCustomer(List<CustomerAddressInfo> customerInfo) throws InterruptedException {

        for (CustomerInfo customerInfo1 : customerInfo) {
            //driver.findElement(By.linkText(customerInfo.getFirstName()[i])).click();

        WebElement editButton = driver.findElement(By.xpath(String.format("//*[contains(text(),\"%s\")]//parent::td//following-sibling::td//*[@title=\"Edit\"]",customerInfo1.getFirstName())));
        editButton.click();
        driver.findElement(By.id("cust-password")).sendKeys(customerInfo1.getNewPassword());
        driver.findElement(By.id("cust-passconf")).sendKeys(customerInfo1.getConfirmPassword());
        WebElement saveButton = driver.findElement(By.name("save"));
        saveButton.click();
        Thread.sleep(1000);
        WebElement customerUpdated=driver.findElement(By.xpath("//*[contains(text(),\"Customer successfully updated.\")]"));
        if (customerUpdated.isDisplayed()){
            System.out.println("Customer Updated successfully");
        } else {
            System.out.println("Failed To Update Customer");
        }
        WebElement customerList = driver.findElement(By.linkText("Customer List"));
        customerList.click();

        }
    }

    public void deleteCustomer(List<CustomerAddressInfo> customer){
        for (CustomerAddressInfo customer2 : customer) {
            driver.findElement(By.xpath(String.format("//*[contains(text(),\"%s\")]//parent::td//following-sibling::td//*[@title=\"Delete\"]",customer2.getaFirstName()))).click();
            driver.switchTo().alert().accept();
            WebElement customerDelete=driver.findElement(By.xpath("//*[contains(text(),'Customer successfully deleted.')]"));
            if (customerDelete.isDisplayed()){
                System.out.println("Customer Deleted Successfully");
            } else {
                System.out.println("Failed To Delete Customer");
            }
        }
    }

    public void logout() {

        WebElement logout = driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logout.click();
        driver.close();
        driver.quit();


    }
}
