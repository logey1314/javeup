package com.homework6;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<Double> list = new ArrayList();
        list.add(88.5);
        list.add(39.2);
        list.add(77.1);
        list.add(88.5);
        list.add(56.8);
        list.add(89.0);
        list.add(99.0);
        list.add(59.5);
        int sum=0;
        int num=0;
        for (Double v : list) {

            if(v<60.0){
                System.out.println(v);
                num++;
                sum+=v;
            }
        }
        System.out.println(sum*1.0/num);
    }
}
