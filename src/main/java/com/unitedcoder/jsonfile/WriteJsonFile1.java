package com.unitedcoder.jsonfile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.cubecartautomation.LoginUser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class WriteJsonFile1 {
    public static void main(String[] args) {
        LoginUser loginUser=new LoginUser("test","automation",
                "abd1@gmail.com","Admin");
        ObjectMapper mapper=new ObjectMapper();
        String user= null;
        try {
            user = mapper.writeValueAsString(loginUser);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try {
            FileUtils.writeStringToFile(new File("jsonfile\\user-Info.json"),user);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
