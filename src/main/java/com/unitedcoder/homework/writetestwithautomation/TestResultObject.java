package com.unitedcoder.homework.writetestwithautomation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResultObject {
    @JsonProperty("test-module")
    private String testModule;
    @JsonProperty("test-name")
    private String testName;
    @JsonProperty("test-date")
    private String testDate;
    @JsonProperty("test-time")
    private String testTime;
    @JsonProperty("test-status")
    private boolean testStatus;

    public TestResultObject() {
    }

    public TestResultObject(String testModule, String testName, String testDate, String testTime, boolean testStatus) {
        this.testModule = testModule;
        this.testName = testName;
        this.testDate = testDate;
        this.testTime = testTime;
        this.testStatus = testStatus;
    }

    public String getTestModule() {
        return testModule;
    }

    public void setTestModule(String testModule) {
        this.testModule = testModule;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }

    public boolean isTestStatus() {
        return testStatus;
    }

    public void setTestStatus(boolean testStatus) {
        this.testStatus = testStatus;
    }
}
