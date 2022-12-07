package com.unitedcoder.oopsconcept.polymorphism;

public class Dog extends Animal{

    public void animalSound(){
        System.out.println("The dog says: woof woof");
    }

    public void animalEat(String foodName){
        System.out.println("The dog eats "+foodName);
    }

    public void dogRuns(){
        System.out.println("Dog is running");
    }

}
