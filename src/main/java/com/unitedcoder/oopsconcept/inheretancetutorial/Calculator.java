package com.unitedcoder.oopsconcept.inheretancetutorial;

public class Calculator implements SimpleCalculator,IScientificCalculator{
    @Override
    public double addTwoNumbers(int a, int b) {
        return a+b;
    }

    @Override
    public int addMultipleNumbers(int... numbers) {
        int sum=0;
        for (int n:numbers){
            sum+=n;
        }
        return 0;
    }

    @Override
    public double multiplyTwoNumbers(double d1, double d2) {
        return d1*d2;
    }

    @Override
    public float divideTwoNumbers(double x, double y) {
        if (y==0){
            System.out.println("The denominator can not be divided by zero!!");
            return 0;
        } else {
            float division=(float) (x/y);
                    return division;
        }

    }

    @Override
    public long subtractTwoNumbers(long a1, long a2) {
        return a1-a2;
    }


    @Override
    public double calculatePower(int base, int power) {
        return Math.pow(base,power);
    }

    @Override
    public double CalculateSquareRoot(long l) {
        return Math.sqrt(l);
    }

    @Override
    public double calculateAbsoluteValue(int i) {
        return Math.abs(i);
    }
}
