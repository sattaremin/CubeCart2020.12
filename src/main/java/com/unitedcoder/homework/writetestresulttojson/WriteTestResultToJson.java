package com.unitedcoder.homework.writetestresulttojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.cubecartautomation.CustomerInfo;
import com.unitedcoder.cubecartautomation.LoginUser;
import com.unitedcoder.homework.writetestwithautomation.TestHelper;
import com.unitedcoder.homework.writetestwithautomation.TestResult;
import com.unitedcoder.homework.writetestwithautomation.TestResultObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteTestResultToJson {
    public static void main(String[] args) throws InterruptedException {

        //Write Test Date To Json
        TestResult testResult = new TestResult();
        String startTime = TestHelper.getDate() + " " + TestHelper.getCurrentTime();
        testResult.setTestStartTime(startTime);
        testResult.setTestExecutedBy(TestHelper.getCurrentUser());
        List<TestResultObject> resultObjects = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();

        //Navigate To Browser
        LoginUser loginUser = new LoginUser();
        String[] credential = {"testautomation1", "automation123!"};
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");

        //LogInto CubeCart
        WebElement userNameField = driver.findElement(By.id("username"));
        loginUser.setUserName(credential[0]);
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField = driver.findElement(By.id("password"));
        loginUser.setPassword(credential[1]);
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();

        //Write Login Test Result To Json
        TestResultObject loginObject = new TestResultObject();
        loginObject.setTestModule("login");
        loginObject.setTestName("login-class");
        loginObject.setTestDate(TestHelper.getDate());
        loginObject.setTestTime(TestHelper.getCurrentTime());

        //Verify Login Test Passed
        WebElement logoutLink = driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        if (logoutLink.isDisplayed()) {
            System.out.println("Login Test Passed");
            loginObject.setTestStatus(true);
        } else
            System.out.println("failed");
        loginObject.setTestStatus(false);

        //Add Costumer
        CustomerInfo customerInfo = new CustomerInfo("Sattar" + System.currentTimeMillis(),
                "Emin" + System.currentTimeMillis(),
                "Mr",
                "Emin" + System.currentTimeMillis() + "@gmail.com");
        WebElement customerLink = driver.findElement(By.linkText("Customer List"));
        customerLink.click();
        WebElement addCustomerLink = driver.findElement(By.linkText("Add Customer"));
        addCustomerLink.click();
        WebElement titLeField = driver.findElement(By.id("cust-title"));
        titLeField.sendKeys(customerInfo.getTitle());
        WebElement firstNameField = driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customerInfo.getFirstName());
        WebElement lastNameField = driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(customerInfo.getLasName());
        WebElement typeDropdown = driver.findElement(By.id("cust-type"));
        Select select = new Select(typeDropdown);
        select.selectByValue("2");
        WebElement email = driver.findElement(By.id("cust-email"));
        email.sendKeys(customerInfo.getEmail());
        WebElement saveButton = driver.findElement(By.name("save"));
        saveButton.click();

        //Write Add Customer Test Result To Json
        TestResultObject addCustomer = new TestResultObject();
        addCustomer.setTestModule("add-customer");
        addCustomer.setTestName("add-customer-test");
        addCustomer.setTestDate(TestHelper.getDate());
        addCustomer.setTestTime(TestHelper.getCurrentTime());

        //Verify Customer Added Successfully
        WebElement successMessage = driver.findElement(By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if (successMessage.isDisplayed()) {
            System.out.println("Customer Successfully Added");
            addCustomer.setTestStatus(true);
        } else {
            System.out.println("Could not add the customer");
            addCustomer.setTestStatus(false);
        }

        //Logout
        WebElement logout = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        logout.click();
        TestResultObject logOut = new TestResultObject();
        logOut.setTestModule("logout");
        logOut.setTestName("logout-test");
        logOut.setTestDate(TestHelper.getDate());
        logOut.setTestTime(TestHelper.getCurrentTime());

        //Write Logout Test Result To Json
        resultObjects.add(loginObject);
        resultObjects.add(addCustomer);
        resultObjects.add(logOut);
        logOut.setTestStatus(true);

        //Write Test Results To Json
        testResult.setTestEndTime(TestHelper.getDate() + " " + TestHelper.getCurrentTime());
        testResult.setResultObjects(resultObjects);
        try {
            mapper.writeValue(new File("jsonfile\\add-cutomer-test.json"), testResult);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Close Browser
        driver.close();
        driver.quit();


    }


}
