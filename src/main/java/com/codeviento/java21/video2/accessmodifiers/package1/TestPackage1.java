package com.codeviento.java21.video2.accessmodifiers.package1;

public class TestPackage1 {

    public static void main(String[] args) {
        Car car = new Car();
       // System.out.println(car.model); // ERROR
        System.out.println(car.speed); // OK
        System.out.println(car.color); // OK
        System.out.println(car.year);  // OK
    }
}
