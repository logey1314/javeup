package com.home.work4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    //成员变量（电影票数）
    private int ticketCount = 100;//有100张电影票
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        //模拟卖票
        while (true) {
            if (ticketCount <=0) {
                break;
            }

            lock.lock();
            try {

                // 模拟出票的时间
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if (ticketCount > 0) {
                    System.out.println(Thread.currentThread().getName() + " 出售票号：" + ticketCount);
                }
                ticketCount--;
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }


        }
    }
}