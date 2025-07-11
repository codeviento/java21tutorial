package com.codeviento.java21.video2.declaring;

public class App {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println("Instance Count of Car1: " + car1.instanceCount);
        System.out.println("Instance Count of Car2: " + car2.instanceCount);

        System.out.println("Total Count of Car1: " + car1.totalCars);
        System.out.println("Total Count of Car2: " + car2.totalCars);

        System.out.println("Total Count of Car: " + Car.totalCars);


      //  ElectricCar electricCar = new ElectricCar();

        Car.printMessage();

        Car car3 = new Car("model");
    }
}
