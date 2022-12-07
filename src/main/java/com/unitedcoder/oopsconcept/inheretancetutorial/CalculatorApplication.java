package com.unitedcoder.oopsconcept.inheretancetutorial;

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.addTwoNumbers(5,5));
        System.out.println(calculator.addMultipleNumbers(54,41,7));
        System.out.println(calculator.multiplyTwoNumbers(5,9));
        System.out.println(calculator.divideTwoNumbers(10,5));
        System.out.println(calculator.subtractTwoNumbers(50,32));
        System.out.println(calculator.calculatePower(8,5));
        System.out.println(calculator.CalculateSquareRoot(64));
        System.out.println(calculator.calculateAbsoluteValue(-55));
    }
}
