package com.Demo.demo2;

import java.io.*;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        // F:\java\project\javaup\demo2.txt
        Properties  prop = new Properties();
        /*prop.load(new FileInputStream(new File("F:\\java\\project\\javaup\\day11" +
                "\\src\\com\\Demo\\demo2\\demo.properties")));
        System.out.println(prop);*/

        prop.setProperty("username", "admin");
        prop.setProperty("password", "123456");
        prop.store(new FileOutputStream(new File("demo.properties")), "Demo Properties");

    }
}
