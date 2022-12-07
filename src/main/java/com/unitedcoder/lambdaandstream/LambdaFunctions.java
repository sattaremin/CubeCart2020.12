package com.unitedcoder.lambdaandstream;

import java.util.function.Predicate;

public interface LambdaFunctions {
    void read();
    static void write(){

    }
    default void say(){

    }
}

class Test {

    public static void main(String[] args) {
        LambdaFunctions functions=()-> System.out.println("I am reading");
        functions.read();

    }
}
