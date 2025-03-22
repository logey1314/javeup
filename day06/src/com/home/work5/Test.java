package com.home.work5;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        System.out.println(map.size());
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("___________________________");
        for (Integer i : map.keySet()) {
            System.out.println(i+" "+map.get(i));
        }
        System.out.println("___________________________");
        System.out.println(map.get(1));
        System.out.println(map.containsKey(10));
        map.remove(1);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

}
