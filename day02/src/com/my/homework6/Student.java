package com.my.homework6;

public class Student {
    private String name,year;
    private Sex sex;

    public Student() {
    }

    public Student(String name, String year, Sex sex) {
        this.name = name;
        this.year = year;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String print() {
        return name+year+sex;
    }

}
