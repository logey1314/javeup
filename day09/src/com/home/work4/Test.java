package com.home.work4;


public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        //创建三个卖票窗口（3个线程在执行同一个任务）
        Thread t1 = new Thread(ticket , "窗口1 - ");
        Thread t2 = new Thread(ticket , "窗口2 - ");
        Thread t3 = new Thread(ticket , "窗口3 - ");

        t1.start();
        t2.start();
        t3.start();
    }
}
