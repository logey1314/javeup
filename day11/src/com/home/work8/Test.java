package com.home.work8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test  {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(19);
        s1.setGender("男");
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("day11\\file\\stu.txt"));
        oos.writeObject(s1);
        oos.close();

    }
}
