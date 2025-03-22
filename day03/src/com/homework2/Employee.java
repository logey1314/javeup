package com.homework2;

public class Employee {
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
