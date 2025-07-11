package com.codeviento.java21.video2.accessmodifiers.package2;

import com.codeviento.java21.video2.accessmodifiers.package1.Car;

public class TestPackage2 {

    public static void main(String[] args) {
        Car car = new Car();
//        System.out.println(car.model); // ERROR
//        System.out.println(car.speed); // ERROR
//        System.out.println(car.color); // ERROR
        System.out.println(car.year);  // OK
    }
}
