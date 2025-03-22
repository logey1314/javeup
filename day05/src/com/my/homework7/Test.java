package com.my.homework7;

import java.util.Collection;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三",20,"男");
        Student s2 = new Student("李四",21,"女");
        Student s3 = new Student("张三",20,"男");
        Collection<Student> set=new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        for (Student student : set) {
            System.out.println(student.getName()+student.getAge()+student.getSex());
        }
    }
}
