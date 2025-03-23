package com.home.work3;

public class Ticket implements Runnable {
    // 成员变量（电影票数）
    private int ticketCount = 100; // 有100张电影票

    public synchronized void de() {
        if (ticketCount > 0) { // 在同步方法内检查票数
            System.out.println(Thread.currentThread().getName() + " 出售票号：" + ticketCount);
            ticketCount--;
        }
    }

    @Override
    public void run() {
        while (true) {
             // 使用同步块确保线程安全
                if (ticketCount <= 0) { // 票卖完时退出
                    break;
                }
                // 模拟出票的时间
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                de(); // 调用同步方法卖票
            }

    }
}
