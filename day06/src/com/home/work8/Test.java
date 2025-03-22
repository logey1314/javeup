package com.home.work8;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<Student,String> map=new LinkedHashMap<Student,String>();
        Student stu1=new Student("a",1,10);
        Student stu2=new Student("b",2,20);
        Student stu3=new Student("c",3,30);
        map.put(stu1,"123");
        map.put(stu2,"456");
        map.put(stu3,"789");
        System.out.println(map);
    }
}
