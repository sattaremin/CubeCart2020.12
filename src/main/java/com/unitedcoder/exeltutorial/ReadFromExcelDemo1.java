package com.unitedcoder.exeltutorial;

import java.util.ArrayList;
import java.util.List;

public class ReadFromExcelDemo1 {
    public static void main(String[] args) {
        String fileName="testdatafolders/myDoc.xlsx";
        ExelUtility exelUtility=new ExelUtility();
        exelUtility.readFromExcellCell(fileName,"LoginInfo",
                1,0);
        exelUtility.readFromExcellCell(fileName,"LoginInfo",1,1);

        List<LoginInfo> loginUsers=exelUtility.readFromMultipleCell(fileName,"LoginInfo");
        System.out.println(loginUsers);



    }

}
