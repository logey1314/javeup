package com.my.homework2;

public class JavaTeacher extends Employee{
    public JavaTeacher() {
    }

    public JavaTeacher(String name, String sex, String year) {
        super(name, sex, year);
    }



    @Override
    public void work() {
        System.out.println(getName()+"讲Java");
    }
}
