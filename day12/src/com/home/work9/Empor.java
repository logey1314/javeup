package com.home.work9;

public class Empor {
    private int name;
    private int age;
    private static  Empor one=null;
    private Empor() {
    }

    public static  Empor getEmpor(){
        if(one==null){
          one=new Empor();
        }
        return one;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }



}
