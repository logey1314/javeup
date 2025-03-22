package com.home.work3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,1,2,432,32,54,32,3,7,657,563,25,43,6,463,52);
        System.out.println(Arrays.toString(list.toArray()));

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)>list.get(j)) {
                    Collections.swap(list, i, j);
                }
            }

        }
        System.out.println(list);

    }
}
