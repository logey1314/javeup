package com.my.homework4;

import java.util.ArrayList;

public class listTest {
    public static int listTest(ArrayList<Integer> list, Integer num){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(num)) {
                return i;
            }
        }
        return -1;
    }
}
