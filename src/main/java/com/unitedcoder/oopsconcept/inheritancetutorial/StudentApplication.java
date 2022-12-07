package com.unitedcoder.oopsconcept.inheritancetutorial;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentApplication {
    public static void main(String[] args) {
        Student student=new Student(101,"mike","emin","IT",22,"IT","2004");
        System.out.println(student);
        System.out.println();
        GraduateStudent graduateStudent=new GraduateStudent(2626,"aynigar","alim","x5",22,"SDET",
                "2008","Dolkun","JavaProject");
        System.out.println(graduateStudent);
        System.out.println();
        ArrayList<String> list=new ArrayList<>();
        DoctorStudent doctorStudent=new DoctorStudent(252,"sattar","ablikim","sds",25,"Engineer","2000-18=52",
                "Dolkun","BlockChainTecknology","block chain privacy", Arrays.asList("HACKING","PRIVACY"));
        System.out.println(doctorStudent);


    }
}
