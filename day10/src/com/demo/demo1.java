package com.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo1 {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(3);
        executorService.submit(new Studenttask());
        executorService.submit(new Studenttask());executorService.submit(new Studenttask());
        executorService.submit(new Studenttask());
    }
}
