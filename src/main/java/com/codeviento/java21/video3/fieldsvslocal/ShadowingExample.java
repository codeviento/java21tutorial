package com.codeviento.java21.video3.fieldsvslocal;

public class ShadowingExample {
    private int x; // Instance variable

    void myMethod() {
        int x = 1; // Local variable
        System.out.println(x);      // 1
        System.out.println(this.x); // 0
    }

    public static void main(String[] args) {
        ShadowingExample sh = new ShadowingExample();
        sh.myMethod();
    }
}
