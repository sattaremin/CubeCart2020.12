package com.unitedcoder.oopsconcept.inheritancetutorial;

public class Student {

    private long studentID;

    private String firstName;
    private String lastName;
    private String className;
    private int age;
    private String major;
    private String birthDay;

    public Student() {
    }

    public Student(long studentID, String firstName, String lastName, String className, int age, String major, String birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.age = age;
        this.major = major;
        this.birthDay = birthDay;
        this.studentID= studentID;
    }

    public long getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String toString(){
        return studentID+", "+firstName+", "+lastName+", "+className+", "+age+", "+major+", "+birthDay;
    }

}
