package com.Demo.demo1;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Test {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("day12\\fiel\\user.txt"));
        User user = new User();
        user.setName("zhangsan");
        user.setAge(18);
        oos.writeObject(user);
        oos.close();

    }
}
