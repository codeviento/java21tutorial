package com.codeviento.java21.video3.scope;

public class ScopeExample {

    static int classLevel = 1; // static (class variable)
    int instanceLevel = 2;     // instance variable

    void method(int parameterLevel) { // method parameter
        int localLevel = 4;           // local variable

        if (localLevel > 0) {
            int blockLevel = 5;       // block variable
            System.out.println(blockLevel);
        }
    }
}
