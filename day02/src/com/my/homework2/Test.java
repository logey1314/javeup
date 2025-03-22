package com.my.homework2;

public class Test {
    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher();
        javaTeacher.setName("小明");
        javaTeacher.setSex("男");
        javaTeacher.setYear("25");
        UiTeacher uiTeacher = new UiTeacher();
        uiTeacher.setName("小红");
        uiTeacher.setSex("女");
        uiTeacher.setYear("18");
        javaTeacher.work();
        uiTeacher.work();
        uiTeacher.draw();
    }



}
