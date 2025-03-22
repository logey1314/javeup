package com.homework3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String name = sc.nextLine();
        String age = sc.nextLine();
        String height= sc.nextLine();
        String marry= sc.nextLine();
        String gender= sc.nextLine();
        s1.setName(name);
        s1.setAge(Integer.parseInt(age));
        s1.setHeight(Double.parseDouble(height));
        s1.setMarry(Boolean.parseBoolean(marry));
        s1.setGender(gender.charAt(0));
        System.out.println(s1.getName()+s1.getAge()+s1.getHeight()+s1.isMarry()+s1.getGender());

    }
}
