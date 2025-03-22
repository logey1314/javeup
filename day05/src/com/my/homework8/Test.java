package com.my.homework8;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        Collection<Integer> link=new LinkedHashSet();
        link.add(20);
        link.add(30);
        link.add(50);
        link.add(10);
        link.add(30);
        link.add(20);
        System.out.println(link.size());
        for (Integer i : link) {
            if (i>25){
                System.out.println(i);
            }
        }
    }
}
