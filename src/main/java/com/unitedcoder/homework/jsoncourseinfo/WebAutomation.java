package com.unitedcoder.homework.jsoncourseinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebAutomation {
    @JsonProperty("courseTitle")
    private String courseTitle;
    @JsonProperty("price")
    private int price;

    public WebAutomation() {
    }

    public WebAutomation(String courseTitle, int price) {
        this.courseTitle = courseTitle;
        this.price = price;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
