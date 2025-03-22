package com.my.homework6;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection set=new HashSet();
        set.add("刘备");
        set.add("关羽");
        set.add("张飞");
        set.add("刘备");
        set.add("张飞");
        System.out.println(set);
        System.out.println(set.size());
        Iterator iterator=set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Object o : set) {
            System.out.println(o);
        }


    }
}
