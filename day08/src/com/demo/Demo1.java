package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张三疯");
        list.add("张三");
        list.add("熊大");
        list.add("张小小");
/*        list.stream()
                .filter(new Predicate<String>() {

                    @Override
                    public boolean test(String s) {
                        return s.startsWith("张");
                    }
                })
                .filter(new Predicate<String>() {

                    @Override
                    public boolean test(String s) {
                        return s.length()==3;
                    }
                })
                .forEach(new Consumer<String>() {

                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });*/


        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name->System.out.println(name));




//        System.out.println(list);
    }



}
