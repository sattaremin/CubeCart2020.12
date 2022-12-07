package com.unitedcoder.homework.jsoncourseinfo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonWriteDemoCourse {
    public static void main(String[] args) {
        List<WebAutomation> webAutomation=new ArrayList<>();
        webAutomation.add(new WebAutomation("Selenium-WebDriver-Java",300));
        webAutomation.add(new WebAutomation("Cypress",250));
        webAutomation.add(new WebAutomation("BDD-Cucumber-Java",150));


        List<Api> api=new ArrayList<>();
        api.add(new Api("RestAssures-Api-Testing",100));
        api.add(new Api("Sout-Ui-WebServices-Testing",200));

        Courses courses=new Courses(webAutomation,api);
        CourseInfo courseInfo=new CourseInfo("SDET Training","," +
                "automation","Dolkun Tarim",
                "https://www.linkedIn.com","https://seleniummaster.teachable.com/"
                ,courses);
        ObjectMapper mapper=new ObjectMapper();
        try {
            mapper.writeValue(new File("testdatafolders\\UdemyCourses.json"),courseInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
