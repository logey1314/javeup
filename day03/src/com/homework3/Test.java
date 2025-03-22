package com.homework3;

public class Test {

    public static void main(String[] args) {
        Student student1=new Student("a","1","18");
        Student student2=new Student("a","1","18");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student1.equals(student2));
    }


}
