package com.codeviento.java21.video3.fieldsvslocal;

public class FinalExample {

    private final int myFinalField = 42;

    public void myMethod(int arg) {
        final int myFinalLocal;
        if (arg > 0) {
            myFinalLocal = arg;
        } else {
            myFinalLocal = 0;
        }
        //myFinalLocal = 100; // Compile error!
        //myFinalField = 42; //Compile error!
    }
}
