package com.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("JavaEE企业级开发指南");
        list.add("Oracle高级编程");
        list.add("MySQL从入门到精通");
        list.add("Java架构师之路");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if (s.contains("Oracle")){
                iterator.remove();
            }

        }
       Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
