package com.codeviento.java21.video4;

import com.codeviento.java21.video4.abstracts.Cake;
import com.codeviento.java21.video4.abstracts.Cookie;

public class ChocolateCookie extends Cookie {

    int chocolate;

    @Override
    public void flavor() {
        System.out.println("Chocolate flavor");
    }
}
