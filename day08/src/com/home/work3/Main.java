package com.home.work3;

public class Main {
    public static void main(String[] args) {
    Student student = new Student();
    student.setName("张三");
        try {
            student.setAge(60);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            student.setGender('人');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(student.getName()+" "+student.getAge()+" "+student.getGender());
    }
}
