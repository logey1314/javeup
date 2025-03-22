package com.homework3;

import java.util.Objects;

public class Student {
    private String name,sex,year;

    public Student(String name, String sex, String year) {
        this.name = name;
        this.sex = sex;
        this.year = year;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(sex, student.sex) && Objects.equals(year, student.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, year);
    }
}
