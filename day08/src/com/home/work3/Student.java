package com.home.work3;

public class Student {
    private String name;
    private int age;
    private char gender;

    public Student() {
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age>15&&age<50) {
            this.age = age;
        }
        else {
            throw new AgeException("年龄异常");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (gender=='男'||gender=='女') {
            this.gender = gender;
        }
        else {
            throw  new SexException("性别异常");
        }
    }
}
