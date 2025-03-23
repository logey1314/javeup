package com.home.work5;

public class Test {
    public static void main(String[] args) {
        Door door = new Door();
        Thread t1 = new Thread(door,"前门");
        Thread t2 = new Thread(door,"后门");
        t1.start();
        t2.start();

    }
}
