package com.unitedcoder.exeltutorial;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteWithArray {
    public static void main(String[] args) {
        Object[][] studentInfo={
                {"Student-Name","Student-ID","Score"},
                {"NASA",548,80},
                {"TESLA",791,99},
                {"AMAZON",823,70}
        };
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("NASA,name");
        int rows=studentInfo.length;
        int column=studentInfo[0].length;
        for (int r=0;r<rows;r++){
            XSSFRow row=sheet.createRow(r);
            for (int c=0;c<column;c++){
                XSSFCell cell=row.createCell(c);
                Object contents=studentInfo[r][c];
                if (contents instanceof String){
                    cell.setCellValue((String)contents);
                }
                if (contents instanceof Integer){
                    cell.setCellValue((Integer) contents);
                }
            }

        }
        String fileName="testdatafolders/student-info.xlsx";
        File file=new File(fileName);
        FileOutputStream outputStream= null;
        try {
            outputStream = new FileOutputStream(file);
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
