package com.unitedcoder.classconcept;

import java.util.ArrayList;

public class TestCar {
    public static void main(String[] args) {

        Car toyota=new Car();
        toyota.setBrand("Toyota");
        toyota.setMade("Japan");
        toyota.setColor("Black");
        toyota.setMileAge(0);
        toyota.setPrice(33500);
        toyota.setYear(2020);

        System.out.println(toyota.carInfo());

        Car honda=new Car();
        honda.setBrand("Honda");
        honda.setMade("Japan");
        honda.setColor("White");
        honda.setMileAge(2000);
        honda.setPrice(10000);
        honda.setYear(2022);

        System.out.println(honda.getBrand());
        System.out.println(honda.getColor());

        Car mercedes=new Car();
        mercedes.setBrand("Mercedes");
        mercedes.setMade("German");
        mercedes.setColor("Black");
        mercedes.setMileAge(0);
        mercedes.setPrice(50000);
        mercedes.setYear(2021);

        ArrayList<Car> carList=new ArrayList<>();
        carList.add(toyota);
        carList.add(honda);
        carList.add(mercedes);
        for (Car c:carList){
            if (c.getBrand().equalsIgnoreCase("mercedes"))
            System.out.printf("%s %s %s %d %d %d",
                    c.getBrand(),
                    c.getMade(),
                    c.getColor(),
                    c.getYear(),
                    c.getPrice(),
                    c.getMileAge());
            System.out.println();
        }





    }
}
