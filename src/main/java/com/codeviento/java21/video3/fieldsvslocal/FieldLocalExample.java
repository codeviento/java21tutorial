package com.codeviento.java21.video3.fieldsvslocal;

public class FieldLocalExample {

    private static int myFieldVar; // This is a field

    public static void main(String[] args) {
        int myLocalVar = 25; // This is a local variable
        System.out.println("myFieldVar:" + myFieldVar);
        System.out.println("myLocalVar:" + myLocalVar);
        FieldLocalExample fieldLocalExample = new FieldLocalExample();
        fieldLocalExample.myMethod();
    }

    private int x; // Instance variable

    void myMethod() {
        int x = 1; // Local variable
        System.out.println("x:" + x); // Prints 1 (local variable)
        System.out.println("this.x; " + this.x); // Prints 0 (instance variable)


        final StringBuilder sb = new StringBuilder();
        sb.append("Hello"); // This is fine
       // sb = new StringBuilder(); // This won't compile
    }

}
