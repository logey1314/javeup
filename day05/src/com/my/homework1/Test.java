package com.my.homework1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Person> list2 = new ArrayList<>();
        ArrayList<Student> list3 = new ArrayList<>();
        ArrayList<JavaStudent> list4 = new ArrayList<>();
        ArrayList<UIStudent> list5 = new ArrayList<>();
        ArrayList<Teacher> list6 = new ArrayList<>();
        ArrayList<JavaTeacher> list7 = new ArrayList<>();
        ArrayList<UITeacher> list8 = new ArrayList<>();


    }
    public static void print1(ArrayList<?> list){

    }
    //要求：参数可以接收任何Person及其子类泛型的ArrayList参数
    public static void print2(ArrayList<? extends Person> list){
    }
    //要求：参数可以接收任何Student及其子类泛型的ArrayList参数
    public static void print3(ArrayList<? extends Student> list){
    }
    //要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
    public static void print4(ArrayList<? super JavaStudent> list){
    }

}
