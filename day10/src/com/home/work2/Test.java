package com.home.work2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test  {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list,"cab","bac","acb","cba","bca","abc");
        Collections.sort(list,new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        Collections.sort(list,(o1,o2)->o2.compareTo(o1));
        System.out.println(list);

    }
}
