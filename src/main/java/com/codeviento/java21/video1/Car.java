package com.codeviento.java21.video1;

public abstract class Car {

    private String model;
    private int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }

    public abstract void startEngine();

    public void charge() {
        System.out.println("Charging...");
    }
}
