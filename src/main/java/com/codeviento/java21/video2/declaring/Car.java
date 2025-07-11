package com.codeviento.java21.video2.declaring;

public class Car {

    public static final int MAX_SPEED = 200;
    private String model;
    static int totalCars = 0;
    int instanceCount = 0;
    int speed;

    public Car() {
        totalCars++;
        instanceCount++;
     //   MAX_SPEED = 300;
    }

    public Car(String model) {
        this.model = model;
    }

    public void accelerate() {
        speed += 10;
    }

    public void accelerate(int increment) {
        speed += increment;
    }

    public static void setMaxSpeed(int maxSpeed) {
     //   MAX_SPEED = maxSpeed;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public static int getMaxSpeed() {
        return MAX_SPEED;
    }

    public static void printMessage() {
        System.out.println("This is a static method");
    }

}
