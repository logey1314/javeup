package com.home.work10;

import java.util.Objects;

public class Student {
    private String num,name;
    private int score;

    public Student() {
    }

    public Student(String num, int score, String name) {
        this.num = num;
        this.score = score;
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(num, student.num);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(num);
    }

}
