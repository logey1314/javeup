package com.home.work1;

import java.util.Comparator;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student("aaa",22);
        Student s2 = new Student("aaa",26);
        Student s3 = new Student("ccc",24);
        TreeSet<Student> set= new TreeSet<>(new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                if (o1.getName().compareToIgnoreCase(o2.getName()) == 0){
                    return o1.getAge()-o2.getAge();
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
