package com.codeviento.java21.video3.var;

import java.util.ArrayList;
import java.util.Arrays;

public class VarExampleCompileError {
//    var myVar = 42;
//    var myText = "Merhaba";
//    var list = new ArrayList<String>();

    public void myMethod(/* var param */) {   // ❌ Not allowed
        var myVar = 42;
        var myText = "Hello";
        var list = new ArrayList<String>();

     //   var notDeclared;          // Compile error
     //   var nullAssigned = null;  // Compile error

        var numbers = Arrays.asList(1, 2, 3);
        for (var num : numbers) {
            System.out.println(num);
        }

        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        var myString = "Hello, World!";
        myString = null; // This is allowed
    }
}
