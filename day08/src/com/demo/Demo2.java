package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //存储元素
        list.add("张三疯");
        list.add("张三");
        list.add("熊大");
        list.add("张小小");
        list.stream()
                .skip(1)
                .limit(2)
                .forEach(name->System.out.println(name));
    }


}
