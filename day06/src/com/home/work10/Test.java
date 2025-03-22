package com.home.work10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Student stu1=new Student("1001",69,"张三");
        Student stu2=new Student("1002",54,"李四");
        Student stu3=new Student("1003",52,"王五");
        Student stu4=new Student("2003",62,"BOb");
        Student stu5=new Student("2004",92,"Alx");
        Map<String, Student> banji1 = new HashMap<>();
        Map<String, Student> banji5 = new HashMap<>();
        banji1.put(stu1.getNum(),stu1);
        banji1.put(stu2.getNum(),stu2);
        banji1.put(stu3.getNum(),stu3);
        banji5.put(stu4.getNum(),stu4);
        banji5.put(stu5.getNum(),stu5);
        List<Map<String, Student>> list = new ArrayList<>();
        list.add(banji1);
        list.add(banji5);
        System.out.println(list);

    }
}
