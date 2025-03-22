package com.home.work2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
     List<Integer> list = new ArrayList<>();
     Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
     Collections.shuffle(list);
     System.out.println(list);
     Collections.sort(list);
     System.out.println(list);
     Collections.sort(list,new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {
             return o2 - o1;
         }
     });
     System.out.println(list);

    }


}
