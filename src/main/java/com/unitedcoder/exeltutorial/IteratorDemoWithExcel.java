package com.unitedcoder.exeltutorial;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemoWithExcel {
   public List<String> getInfo(String name,String sheetName,int column){
       String filePath="testdatafolders/myDoc.xlsx";
       FileInputStream inputStream= null;
       try {
           inputStream = new FileInputStream(filePath);
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }
       XSSFWorkbook workbook= null;
       try {
           workbook = new XSSFWorkbook(inputStream);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       int sheets=workbook.getNumberOfSheets();
       List<String> customerInfo=new ArrayList<>();
       for (int i=0;i<sheets;i++){
           if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)){
               XSSFSheet sheet=workbook.getSheetAt(i);
               Iterator<Row> rows=sheet.iterator();
               Row firstRow=rows.next();
               Iterator<Cell> cell=firstRow.iterator();
               while (rows.hasNext()){
                   Row r=rows.next();
                   if (r.getCell(column).getStringCellValue().equalsIgnoreCase(name)){
                       Iterator<Cell> c=r.cellIterator();
                       while (c.hasNext()){
                           Cell c1=c.next();
                           if (c1.getCellTypeEnum()== CellType.STRING){
                               customerInfo.add(c1.getStringCellValue());

                           }else {
                               customerInfo.add(NumberToTextConverter.toText(c1.getNumericCellValue()));
                           }
                       }

                   }
               }



           }
       }
       return customerInfo;
   }

    public static void main(String[] args) {
        IteratorDemoWithExcel excel=new IteratorDemoWithExcel();
        List<String> info=excel.getInfo("David","CustomerInfo",1);
        System.out.println(info);
    }
}
