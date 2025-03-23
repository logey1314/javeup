package com.Demo.demo2;
import com.Demo.demo1.User;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new
                FileInputStream("day12\\fiel\\uselist.txt"));
        List<User> o = (List<User>)ois.readObject();
        ois.close();
        for (User user : o) {
            System.out.println(user);
        }
    }
}
