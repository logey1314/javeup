package com.my.homework2;

public abstract class Employee {
    private String name,sex,year;
    public abstract void work();

    public Employee() {
    }

    public Employee(String name, String sex, String year) {
        this.name = name;
        this.sex = sex;
        this.year = year;
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
}
