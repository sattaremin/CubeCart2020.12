package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        boolean fileIsDeleted= FileUtils.deleteQuietly(new File("doc"+File.separator+"myFile.txt"));
        System.out.println("Is file deleted: "+fileIsDeleted);
    }
}
