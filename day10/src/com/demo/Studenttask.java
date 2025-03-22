package com.demo;

public class Studenttask implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"运行");
    }
}
