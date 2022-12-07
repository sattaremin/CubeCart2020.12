package com.unitedcoder.homework.writetestwithautomation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.cubecartautomation.LoginUser;
import com.unitedcoder.jsonfile.FunctionLibrary;
import com.unitedcoder.jsonfile.Users;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoleBasedMethod extends FunctionLibrary {
    public static void main(String[] args) {
        openBrowser();
        TestResult testResult=new TestResult();
        String startTime=TestHelper.getDate()+" "+TestHelper.getCurrentTime();
        testResult.setTestStartTime(startTime);
        testResult.setTestExecutedBy(TestHelper.getCurrentUser());
        ObjectMapper mapper=new ObjectMapper();
        Users loginUsers=null;
        try {
            loginUsers=mapper.readValue(new File("jsonfile/Multi-Users.json"),Users.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<TestResultObject> resultObjects=new ArrayList<>();
        List<LoginUser> allUsers=loginUsers.getUsers();
        for (LoginUser eachUser:allUsers) {
            TestResultObject testResultObject=new TestResultObject();
            if (eachUser.isActive()) {
                testResultObject.setTestModule("Login");
                testResultObject.setTestName("Login");

                String testDate = TestHelper.getDate();
                testResultObject.setTestDate(testDate);
                String testTime = TestHelper.getCurrentTime();
                testResultObject.setTestTime(testTime);

                WebElement userNameField = driver.findElement(By.id("username"));
                userNameField.sendKeys(eachUser.getUserName());
                WebElement passwordField = driver.findElement(By.id("password"));
                passwordField.sendKeys(eachUser.getPassword());
                WebElement login = driver.findElement(By.id("login"));
                login.click();
                WebElement logoutLink = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
                if (logoutLink.isDisplayed()) {
                    System.out.println("Login Test Passed");
                    testResultObject.setTestStatus(true);
                } else {
                    System.out.println("failed");
                    testResultObject.setTestStatus(false);
                }
                logout();
            }
            resultObjects.add(testResultObject);

        }
        closeBrowser();
        testResult.setTestEndTime(TestHelper.getDate()+" "+TestHelper.getCurrentTime());
        testResult.setResultObjects(resultObjects);
        try {
            mapper.writeValue(new File("jsonfile\\login-test-with.json"),testResult);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
