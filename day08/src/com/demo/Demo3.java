package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Demo3 {
    public static void main(String[] args) {
        List<User> list =new ArrayList<>();
        //集合中存储的元素是：User对象
        list.add(new User("张三"));
        /*list.stream()
                .map(new Function<User, SuperMan>() {

                    @Override
                    public SuperMan apply(User user) {
                        return new SuperMan(user.getName());
                    }
                })
                .forEach(obj->System.out.println(obj));*/
        list.stream()
                .map(user -> new SuperMan(user.getName()))
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .map(new Function<Integer, Integer>() {

                    @Override
                    public Integer apply(Integer integer) {
                        return integer * 2;
                    }
                })
                .forEach(System.out::println);
    }
}
