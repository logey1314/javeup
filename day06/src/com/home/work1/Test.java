package com.home.work1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> list=new TreeSet<>();


        for (int i = 0; i < 10; i++) {
            int j = (int) (Math.random()*(50-0)+0);
            list.add(j);

        }
        System.out.println(list);



    }
}
