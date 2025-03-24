package com.home.work9;
import  com.home.work8.Student;

import java.io.*;

public class Test  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("day11\\file\\stu.txt"));

        Student student = (Student) ois.readObject();
        ois.close();
        System.out.println(student.getName());

    }
}
