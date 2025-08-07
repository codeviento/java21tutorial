package com.codeviento.java21.video5.sealedabstract;

public sealed class Vehicle permits Car, Motorcycle, Truck {

    public void startEngine() {
        System.out.println("Starting the vehicle's engine.");
    }

}
