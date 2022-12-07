package com.unitedcoder.classconcept;

public class TestCar1 {
    public static void main(String[] args) {

        Car[] cars=new Car[3];
        Car car1=new Car("BMW","White",35000,2020);
        Car car2=new Car("Tesla","White",35000,2020);
        Car car3=new Car("Ford","White",35000,2020);
        cars[0]=car1;
        cars[1]=car2;
        cars[2]=car3;
        for (Car c:cars){
            //System.out.println(c.toString());
            System.out.println(c.getBrand()+" "+c.getColor()+" "+c.getPrice()+" "+c.getYear());
        }
//        Car car1=new Car();
//        Car car2=new Car("Toyota","white",20000,2022);
//        System.out.println(car2.getBrand());

    }
}
