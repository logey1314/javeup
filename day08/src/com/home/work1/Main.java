package com.home.work1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Integer a = sc.nextInt();
       Integer b = sc.nextInt();

        try {
            System.out.println(chu(a,b));
        } catch (Exception e) {
            System.out.println("第二个除数不能为0");
        }

    }

    public static Integer chu(Integer a, Integer b)throws RuntimeException {
        return a/b;
    }

}
