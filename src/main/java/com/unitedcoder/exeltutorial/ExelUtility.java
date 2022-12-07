package com.unitedcoder.exeltutorial;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExelUtility {
    //method to reaad from excel
    public String readFromExcellCell(String fieldName, String sheetName, int rowNumber, int cellNumber){
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream(fieldName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet=workbook.getSheet(sheetName);
        XSSFRow row=sheet.getRow(rowNumber);
        String cellValue=null;
        if (row==null){
            System.out.println("Empty row!!");
        } else {
            XSSFCell cell=row.getCell(cellNumber);
            CellType cellType=cell.getCellType();
            switch (cellType){
                case NUMERIC:
                    cellValue=String.valueOf(cell.getNumericCellValue());
                    System.out.println(cellValue);
                    break;
                case STRING:
                    cellValue=cell.getStringCellValue();
                    System.out.println(cellValue);
                    break;
            }

        }
        return cellValue;
    }

    public List<LoginInfo> readFromMultipleCell(String fileName, String sheetName){
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sheet=workbook.getSheet(sheetName);
        List<LoginInfo> loginUsers=new ArrayList<>();
        int rowCount=sheet.getLastRowNum();
        for (int r=1;r<=rowCount;r++){
            XSSFRow row=sheet.getRow(r);
            XSSFCell userName=row.getCell(0);
            XSSFCell password=row.getCell(1);
            loginUsers.add(new
                    LoginInfo(userName.getStringCellValue(),password.getStringCellValue()));
        }
        return loginUsers;
    }

    public void writeToExcelMultipleCells(String fileName, String sheetName, List<String> contents){
        //define a file to write contents
        File exelFile=new File(fileName);
        //Define a work boook
        XSSFWorkbook workbook=new XSSFWorkbook();
        //Add sheet to the workbook
        XSSFSheet sheet=workbook.createSheet(sheetName);
        //define rows in the sheet
        int numberOfRows=contents.size();
        for (int rowNumber=0;rowNumber<numberOfRows;rowNumber++){
            XSSFRow row=sheet.createRow(rowNumber);
            String[] rowContent=contents.get(rowNumber).split(",");
            //define column to the row
            int totalCell=rowContent.length;
            for (int cellNumber=0;cellNumber<totalCell;cellNumber++){
                XSSFCell cell=row.createCell(cellNumber);
                //add contents to the cell
                cell.setCellValue(rowContent[cellNumber]);
            }
        }
        FileOutputStream outputStream= null;
        try {
            outputStream = new FileOutputStream(exelFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
