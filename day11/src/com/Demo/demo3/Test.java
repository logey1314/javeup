package com.Demo.demo3;

import java.util.ResourceBundle;

public class Test {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("student");
        String name = rb.getString("name");
        String pass = rb.getString("pass");
        System.out.println(name);
        System.out.println(pass);
        System.out.println(rb.getString("name"));
    }
}
