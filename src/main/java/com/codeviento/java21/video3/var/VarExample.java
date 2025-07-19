package com.codeviento.java21.video3.var;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class VarExample {

    HashMap<Integer, String> map = new HashMap<>();
    List<String> list = new ArrayList<>();
    AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

//        HashMap<Integer, String> map2 = new HashMap<>();
//        List<String> list2 = new ArrayList<>();
//        AtomicInteger counter2 = new AtomicInteger(0);

        var map2 = new HashMap<Integer, String>();
        var list2 = new ArrayList<String>();
        var counter2 = new AtomicInteger(0);
    }
}
