package com.home.work8;

import java.util.Objects;

public class Student {
    private String name;
    private int num;
    private int score;

    public Student() {
    }

    public Student(String name, int num, int score) {
        this.name = name;
        this.num = num;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return num == student.num;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(num);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", score=" + score +
                '}';
    }
}
