package com.unitedcoder.exeltutorial;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo1 {
    public static void main(String[] args) {
        UiUtility2 uiUtility2=new UiUtility2();
        ExelUtility exelUtility=new ExelUtility();
        String fileName="testdatafolders/loginReport.xlsx";
        List<String> content=new ArrayList<>();
        content.add("test-name,test-module,test-status,executedAt,executedBy");
        content.add("login,login,passed,"+uiUtility2.getCurrentTime()+","+uiUtility2.getUserName());
        exelUtility.writeToExcelMultipleCells(fileName,"Test-report",content);
    }

}

