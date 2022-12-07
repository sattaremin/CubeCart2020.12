package com.unitedcoder.classconcept;
import java.util.*;

public class CompareToDemo {
    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(10,20,70,40,60,5,9);
        List<String> list2= Arrays.asList("Name","Age","Salary","Department");
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);
        List<Employee> employees=new ArrayList<>();
        Employee employee1=new Employee("Mike","5245AS","HR",3000,30);
        Employee employee2=new Employee("Tom","5247AS","IT",8000,50);
        Employee employee3=new Employee("Scott","545AS","DEVOPS",7000,40);
        Employee employee4=new Employee("Lara","545AS","HR",3007,20);
        employees.addAll(Arrays.asList(employee1,employee2,employee3,employee4));
//        employees.sort(Comparator.comparing(Employee::getAge));
//        //System.out.println(employees);
//        employees.sort(Comparator.comparing(Employee::getEmployeeName));
//        //System.out.println(employees);
//        employees.sort(Comparator.comparing(Employee::getSalary));
//        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(employees);



    }
}
