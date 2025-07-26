package com.codeviento.java21.video4;

import com.codeviento.java21.video4.abstracts.Cookie;
import com.codeviento.java21.video4.interfaces.Bakeable;

public class AbstractInterfaceDifferences {

    public static void main(String[] args) {
        // 1. Both can not instantiate
        // Cookie cookie = new Cookie();
        // Bakeable bakeable = new Bakeable();

        //2. Java allows implementing multiple interfaces,
        // but you can only extend one class.

        //3. Abstract can have both abstract & concrete methods
        //   Interface can have default & static methods (since Java 8)

        //4. Abstract can have fields (state)
        //   Interface can only have public static final constants

        //5. Constructors is allowed for abstract, not allowed for interface.

        //6. Abstract access modifiers are public, protected, private
        //   Interface access modifier is public only (for methods/constants)

        //7. Abstract inheritance keyword is extends
        //   Interface inheritance keyword is implements

    }
}
