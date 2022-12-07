package com.unitedcoder.classconcept;

public class Car {
    //State behaviour
    //Class level variable
    private String brand;//Example Honda, Toyota etc
    private String made;// Example from Japan, German etc
    private String color;
    private long mileAge;
    private long price;
    private long year;

    public Car() {
    }

    public Car(String brand, String color, long price, long year) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public Car(String color, long price, long year) {
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public Car(String brand, String made, long mileAge) {
        this.brand = brand;
        this.made = made;
        this.mileAge = mileAge;
    }

    //This is another way to print all the objects of the car element
    public String carInfo(){
        return brand+", "+made+", "+color+", "+year+", "+price+", "+mileAge;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", made='" + made + '\'' +
                ", color='" + color + '\'' +
                ", mileAge=" + mileAge +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getMileAge() {
        return mileAge;
    }

    public void setMileAge(long mileAge) {
        this.mileAge = mileAge;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }
}
