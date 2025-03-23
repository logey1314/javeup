package com.Demo.demo2;
import com.Demo.demo1.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        User user1 = new User();
        user1.setName("zhangsan");
        user1.setAge(18);
        User user2 = new User();
        user2.setName("lisi");
        user2.setAge(18);
        List<User> users = new ArrayList<User>();
        Collections.addAll(users, user1, user2);
        ObjectOutputStream oss = new ObjectOutputStream(
                new FileOutputStream("day12\\fiel\\uselist.txt"));
        oss.writeObject(users);
        oss.close();

    }
}
