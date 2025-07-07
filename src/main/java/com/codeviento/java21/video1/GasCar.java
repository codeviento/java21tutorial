package com.codeviento.java21.video1;

public class GasCar extends Car {

    public GasCar(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine starts with a roar.");
    }

    public void refuel() {
        System.out.println("Fueling...");
    }
}
