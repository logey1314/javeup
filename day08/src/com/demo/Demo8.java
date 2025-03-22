package com.demo;

import java.util.*;

public class Demo8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list , 4,10,5,2,9);
        /*Optional<Integer> max= list.stream()
                .max(new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1-o2;
                    }
                });
        System.out.println(max.get());*/
       /* Optional<Integer> max=list.stream().max((o1, o2) -> o2 - o1);
        System.out.println(max.get());*/



    }
}
