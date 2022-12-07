package com.unitedcoder.jsonfile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.jsonfile.FunctionLibrary;
import com.unitedcoder.jsonfile.JsonObject;

import java.io.File;
import java.io.IOException;

public class CubeCartAutomationWithJson extends FunctionLibrary{
    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();
        JsonObject object;
        try {
            object=objectMapper.readValue(new File("testdatafolders/cubecart-test-data.json"),
                    JsonObject.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        openBrowser();
        login(object.getLoginUser());
        addProduct(object.getProduct());
        addCustomer(object.getCustomer());
        logout();
        closeBrowser();
    }
}
