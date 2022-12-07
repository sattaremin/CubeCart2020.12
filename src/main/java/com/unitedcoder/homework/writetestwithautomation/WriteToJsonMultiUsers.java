package com.unitedcoder.homework.writetestwithautomation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.cubecartautomation.LoginUser;
import com.unitedcoder.jsonfile.Users;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteToJsonMultiUsers {
    public static void main(String[] args) {
//        List<LoginUser> loginUser1=new ArrayList<>();
//        loginUser1.add(new LoginUser("testautomation1","automation123!","Admin",true));
//        loginUser1.add(new LoginUser("testautomation2","automation123!","Prod",true));
//        loginUser1.add(new LoginUser("testautomation3","automation123!","Customer",false));
        LoginUser loginUser1=new LoginUser("testautomation1","automation123!","Admin",true);
        LoginUser loginUser2=new LoginUser("testautomation2","automation123!","Manager",true);
        LoginUser loginUser3=new LoginUser("testautomation3","automation123!","Customer",false);
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
            FileUtils.writeStringToFile(new File("jsonfile\\Multi-Users.json"),objectValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
