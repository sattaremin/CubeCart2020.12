package com.unitedcoder.homework.jsoncourseinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Courses {
    @JsonProperty("WebAutomation")
    private List<WebAutomation> webAutomations;
    @JsonProperty("Api")
    private List<Api> api;

    public Courses() {
    }

    public Courses(List<WebAutomation> webAutomations, List<Api> api) {
        this.webAutomations = webAutomations;
        this.api = api;
    }

    public List<WebAutomation> getWebAutomations() {
        return webAutomations;
    }

    public void setWebAutomations(List<WebAutomation> webAutomations) {
        this.webAutomations = webAutomations;
    }

    public List<Api> getApi() {
        return api;
    }

    public void setApi(List<Api> api) {
        this.api = api;
    }
}
