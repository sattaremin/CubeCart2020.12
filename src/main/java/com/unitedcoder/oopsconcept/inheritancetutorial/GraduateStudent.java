package com.unitedcoder.oopsconcept.inheritancetutorial;

public class GraduateStudent extends Student {
    private String advisorName;
    private String researchProject;

    public GraduateStudent() {
    }

    public GraduateStudent(String advisorName, String researchProject) {
        this.advisorName = advisorName;
        this.researchProject = researchProject;
    }

    public GraduateStudent(long studentID, String firstName, String lastName, String className, int age,
                           String major, String birthDay, String advisorName, String researchProject) {
        super(studentID, firstName, lastName, className, age, major, birthDay);
        this.advisorName = advisorName;
        this.researchProject = researchProject;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public String getResearchProject() {
        return researchProject;
    }

    public  String toString() {
        return super.toString()+" "+advisorName+" "+researchProject;
    }

}
