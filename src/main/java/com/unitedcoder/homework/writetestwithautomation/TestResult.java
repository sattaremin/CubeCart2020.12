package com.unitedcoder.homework.writetestwithautomation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestResult {
    @JsonProperty("tests")
    private List<TestResultObject> resultObjects;
    @JsonProperty("test-start-time")
    private String testStartTime;
    @JsonProperty("test-end-time")
    private String testEndTime;
    @JsonProperty("test-executed-by")
    private String testExecutedBy;

    public TestResult() {
    }

    public TestResult(List<TestResultObject> resultObjects, String testStartTime,
                      String testEndTime, String testExecutedBy) {
        this.resultObjects = resultObjects;
        this.testStartTime = testStartTime;
        this.testEndTime = testEndTime;
        this.testExecutedBy = testExecutedBy;
    }

    public List<TestResultObject> getResultObjects() {
        return resultObjects;
    }

    public void setResultObjects(List<TestResultObject> resultObjects) {
        this.resultObjects = resultObjects;
    }

    public String getTestStartTime() {
        return testStartTime;
    }

    public void setTestStartTime(String testStartTime) {
        this.testStartTime = testStartTime;
    }

    public String getTestEndTime() {
        return testEndTime;
    }

    public void setTestEndTime(String testEndTime) {
        this.testEndTime = testEndTime;
    }

    public String getTestExecutedBy() {
        return testExecutedBy;
    }

    public void setTestExecutedBy(String testExecutedBy) {
        this.testExecutedBy = testExecutedBy;
    }
}
