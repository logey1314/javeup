package com.Demo.demo1;

import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("1","123");
        prop.setProperty("2","456");
        System.out.println(prop.getProperty("1"));
        Set<String> strings = prop.stringPropertyNames();
        System.out.println(strings);
    }
}
