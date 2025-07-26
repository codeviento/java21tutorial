package com.codeviento.java21.video4;

import com.codeviento.java21.video4.interfaces.Bakeable;
import com.codeviento.java21.video4.interfaces.Packable;

public class Biscuit implements Bakeable, Packable {
    @Override
    public void bake() {
        System.out.println("Biscuit baking...");
    }

    @Override
    public void pack() {

    }
}
