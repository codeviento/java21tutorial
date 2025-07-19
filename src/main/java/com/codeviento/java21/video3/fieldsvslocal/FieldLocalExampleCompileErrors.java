package com.codeviento.java21.video3.fieldsvslocal;

public class FieldLocalExampleCompileErrors {
    int uninitializedField;

    public void myMethod() {
        int uninitialized;
        //System.out.println(uninitialized); // Compile error!
    }

    void uninitializedFieldExample() {
        int myVar;
        if (uninitializedField == 0) {
            myVar = 1;
        } else {
            myVar = 2;
        }
        System.out.println(myVar); // OK

        int myOtherVar;
        if (uninitializedField == 0) {
            myOtherVar = 1;
        }
       // System.out.println(myOtherVar); // Compile error!
    }

    public static void main(String[] args) {
        FieldLocalExampleCompileErrors cl = new FieldLocalExampleCompileErrors();
        cl.uninitializedFieldExample();
    }

}
