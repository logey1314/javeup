package com.homework3;

public class Student {
    private String name;
    private int age;
    private double height;
    private boolean marry;
    private char gender;

    public Student(String name, int age, double height, boolean marry, char gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.marry = marry;
        this.gender = gender;
    }

    public Student() {
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
        this.age = age;
    }

    public boolean isMarry() {
        return marry;
    }

    public void setMarry(boolean marry) {
        this.marry = marry;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
