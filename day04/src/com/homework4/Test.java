package com.homework4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("shu ru");
        String msg =sc.nextLine();
        String[] Msg=msg.split("-");
        s1.setName(Msg[0]);
        s1.setAge(Integer.parseInt(Msg[1]));
        s1.setHeight(Integer.parseInt(Msg[2]));
        System.out.println(s1.getName()+s1.getAge()+s1.getHeight());
    }
}
