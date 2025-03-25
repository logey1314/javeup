package com.home.work9;

public class Empor2 {
    private String name;
    private int age;
    private static final Empor2 one=new Empor2();

    private Empor2() {

    }
    public static Empor2 getInstance() {
        return one;
    }
}
