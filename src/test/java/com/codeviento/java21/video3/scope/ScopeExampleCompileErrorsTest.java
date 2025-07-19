package com.codeviento.java21.video3.scope;

import junit.framework.TestCase;

public class ScopeExampleCompileErrorsTest extends TestCase {
    ScopeExampleCompileErrors cl = new ScopeExampleCompileErrors();


    public void testMyLoopingMethod() {
        cl.myLoopingMethod();
        cl.myIfElseMethod(1);
    }

    public void testMyIfElseMethod() {
    }
}