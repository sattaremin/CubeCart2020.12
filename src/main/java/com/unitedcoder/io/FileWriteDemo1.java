package com.unitedcoder.io;

public class FileWriteDemo1 {
    public static void main(String[] args){
        String a1="I am a United Coder student";
        String a2="I am learning Java SDET to find a job";
        String fileContent=a1+"\n"+a2;
        FileUtility fileUtility=new FileUtility();
        fileUtility.writeToFile("doc","test-automation",".txt",fileContent);
    }

}
