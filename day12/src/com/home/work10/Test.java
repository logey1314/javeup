package com.home.work10;

import java.util.ArrayList;
import java.util.List;

public class Test  {
    public static void main(String[] args) {
        List<Bus> list = new ArrayList<Bus>();
        for (int i = 0; i < 12; i++) {
            list.add(Bus.getBuses());
        }
        list.forEach(System.out::println);
    }
}
