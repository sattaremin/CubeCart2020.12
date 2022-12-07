package com.unitedcoder.oopsconcept.polymorphism;


import org.openqa.selenium.remote.html5.AddApplicationCache;

public class AnimalApplication {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.animalSound();
        animal.animalEat("Animal Foods");

        Cat cat=new Cat();
        cat.animalSound();
        cat.animalEat("Mama");

        Dog dog=new Dog();
        dog.animalSound();
        dog.animalEat("Bone");
        dog.animalSleep();

        System.out.println("Cat object with animal object reference");
        Animal c=new Animal();
        c.animalEat("food");
        c.animalSound();
        c.animalSleep();
        Animal d=new Animal();
        d.animalSound();
        d.animalSleep();
        d.animalEat("food");


    }
}
