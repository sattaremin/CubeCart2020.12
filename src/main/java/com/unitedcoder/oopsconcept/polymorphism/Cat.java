package com.unitedcoder.oopsconcept.polymorphism;

public class Cat extends Animal{

    public void animalSound(){
        System.out.println("The cat says: meow meow");
    }

    public void animalEat(String foodName){
        System.out.println("The cat eats "+foodName);
    }

    public void catRuns(){
        System.out.println("Cat is running!!");
    }

}
