package com.Demo.demo1;

public class Demo1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程"+i);
        }
    }
}
