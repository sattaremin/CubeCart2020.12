package com.unitedcoder.classconcept;


public class Employee implements Comparable<Employee> {
    private String employeeName;
    private String employeeID;
    private String department;
    private long salary;
    private int age;

    public Employee() {
    }

    public Employee(String employeeName, String employeeID, String department, long salary, int age) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        if (salary==employee.salary){
            return 0;
        } else if (salary<employee.salary)
            return 1;
            else
                return -1;


    }
}
