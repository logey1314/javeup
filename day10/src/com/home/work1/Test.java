package com.home.work1;

public class Test {
    public static void main(String[] args) {
       Thread thread = new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("Hello World");
           }
       });
       Thread thread1 = new Thread(() -> {
           for (int i = 0; i < 100; i++) {
               System.out.println(i);
           }
       });
       thread1.start();
    }
}

