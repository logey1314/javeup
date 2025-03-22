package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;

public class Demo9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer[] arr = list.stream()
                .filter(num -> num % 2 == 0)
                .toArray(new IntFunction<Integer[]>() {
                    @Override
                    public Integer[] apply(int value) {
                        return new Integer[value];
                    }
                });
        System.out.println(Arrays.toString(arr));
    }
}
