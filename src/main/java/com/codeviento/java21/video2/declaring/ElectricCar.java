package com.codeviento.java21.video2.declaring;

public class ElectricCar extends Car implements Trackable, Chargeable {

    int arg1;

    public ElectricCar(int arg1) {
        this.arg1 = arg1;
    }

    @Override
    public void startEngine() {
        System.out.println("Silent engine started");
    }

}
