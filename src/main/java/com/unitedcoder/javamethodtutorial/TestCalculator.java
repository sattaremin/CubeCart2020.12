package com.unitedcoder.javamethodtutorial;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.division(200,15));
        System.out.println(calculator.multipleNumbers(19,18.5));
        calculator.calculatorInfo();
        System.out.println(calculator.addMultipleNumbers(100,200,20,80,64,56,55,10));
        System.out.println(calculator.addTwoNumbers("100","300"));
        System.out.println(calculator.sum(30,40));
        FindMaxValueMethod method=new FindMaxValueMethod();
        System.out.println(method.findMaxValue(new int[]{30,20,70,90,50,40,45}));
        FindMaxValueMethod method1=new FindMaxValueMethod();
        System.out.println(method1.findMinValue(new int[]{30,20,70,90,50,40,45}));

        StaticMethodAndVariable.setAccountBalance(9000.55);

    }
}
