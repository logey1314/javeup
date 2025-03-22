package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        numbers.stream()
                .sorted(new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                })
                .forEach(System.out::println);

    }
}
