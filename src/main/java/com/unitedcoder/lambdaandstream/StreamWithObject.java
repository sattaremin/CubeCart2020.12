package com.unitedcoder.lambdaandstream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithObject {
    public static void main(String[] args) {
        //filter
        List<Employee> employees=getEmployee();
        List<Employee> females=employees.stream().filter(employee ->
                employee.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        females.forEach(System.out::println);
        //sort
        List<Employee> sort=employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        sort.forEach(System.out::println);
        //All match
        boolean allMatch=employees.stream().allMatch(employee -> employee.getAge()>20);
        System.out.println(allMatch);
        //any match
        boolean anyMatch=employees.stream().anyMatch(employee -> employee.getAge()>30);
        System.out.println(anyMatch);
        //noneMatch
        boolean nonMatch=employees.stream().noneMatch(employee ->
                employee.getName().equals("Ali"));
        System.out.println(nonMatch);
        //max
        employees.stream().max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);
        //min
        employees.stream().min(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);
    }
    private static List<Employee> getEmployee(){
        return Arrays.asList(
                new Employee("Anna",21,Gender.FEMALE,2000),
                new Employee("Helen",25,Gender.FEMALE,3000),
                new Employee("Tom",30,Gender.MALE,4000),
                new Employee("Tom",35,Gender.MALE,4500));

    }
}
