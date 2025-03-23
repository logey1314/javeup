package com.home.work5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

    public class Door implements Runnable {
        private int number = 1000;
        Lock lock = new ReentrantLock();

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            int counter = 0;
            while(true){
                if(number<=0){
                    System.out.println("从"+name+"入场的员工总共:"+counter+"位");
                    break;
                }
                lock.lock();

                try {
                    System.out.println("编号为"+number+"的员工从"+name+"入场!拿到的双色球彩票号码是:"+new DoubleColorBallUtil().create());
                    number--;
                    counter++;
                } catch (RuntimeException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }


            }

        }
    }