package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        builder.append("Apache Commons IO test\n");
        builder.append("Test Automation CubeCart!!");

        File myFile=new File("doc"+File.separator+FileRead.getCurrentDateTime()+"myFile.txt");

        try {
            FileUtils.writeStringToFile(myFile,builder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
