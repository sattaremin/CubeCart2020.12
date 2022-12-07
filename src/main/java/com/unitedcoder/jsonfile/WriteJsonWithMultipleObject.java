package com.unitedcoder.jsonfile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.cubecartautomation.LoginUser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteJsonWithMultipleObject {
    public static void main(String[] args) {
        LoginUser loginUser1=new LoginUser("test1","automation",
                "abd1@gmail.com","Admin");
        LoginUser loginUser2=new LoginUser("test2","automation",
                "abd1@gmail.com","Customer");
        LoginUser loginUser3=new LoginUser("test3","automation",
                "abd1@gmail.com","Employee");

        List<LoginUser> users=new ArrayList<>();
        users.addAll(Arrays.asList(loginUser1,loginUser2,loginUser3));
        ObjectMapper mapper=new ObjectMapper();
        Users listOfUsers=new Users(users);
        String objectValue=null;
        try {
            objectValue=mapper.writeValueAsString(listOfUsers);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        try {
            FileUtils.writeStringToFile(new File("jsonfile\\users.json"),objectValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
