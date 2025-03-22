package com.my.homework2;

public class UiTeacher extends Employee implements Draw{
    public UiTeacher() {
    }

    public UiTeacher(String name, String sex, String year) {
        super(name, sex, year);
    }

    @Override
    public void draw() {
        System.out.println(getName()+"画画");
    }

    @Override
    public void work() {
        System.out.println(getName()+"讲UI课");
    }
}
