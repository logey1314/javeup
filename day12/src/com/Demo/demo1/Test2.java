package com.Demo.demo1;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("day12\\fiel\\user.txt"));
        User o = (User)ois.readObject();
        System.out.println(o);
    }
}
