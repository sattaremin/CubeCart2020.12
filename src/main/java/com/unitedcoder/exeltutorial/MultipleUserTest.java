package com.unitedcoder.exeltutorial;

import com.unitedcoder.oopsconcept.inheritancetutorial.BaseClass;

import java.util.List;

public class MultipleUserTest extends BaseClass {
    public static void main(String[] args) {
        openBrowser();
        String fileName="testdatafolders/myDoc.xlsx";
        ExelUtility exelUtility=new ExelUtility();
        List<LoginInfo> users=exelUtility.readFromMultipleCell(fileName,"LoginInfo");
        for (LoginInfo user:users){
            login(user.getUserName(),user.getPassword());
            logout();
        }
        closeBrowser();
    }
}
