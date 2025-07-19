package com.codeviento.java21.video3.scope;

public class ScopeExampleCompileErrors {

    void myLoopingMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //System.out.println(i); // Compile error! i is out of scope
    }

    void myIfElseMethod(int x) {
        if (x > 0) {
            int y = 1;
            System.out.println(y);
        } else {
            //System.out.println(y); // Compile error! y is not in scope
        }
    }

    void methodA(int x) {
        methodB();
        System.out.println(x); // x is in scope
    }

    void methodB() {
        //System.out.println(x); // Compile error! x is not in scope
    }

}
