package com.codeviento.java21.video1;

public class ElectricCar extends Car {

    public ElectricCar(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine starts silently.");
    }
}
