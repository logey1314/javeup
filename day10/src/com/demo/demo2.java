package com.demo;

import java.util.concurrent.*;

public class demo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(3);
        Callable<Integer> c1=new Callable() {
            @Override
            public Object call() throws Exception {
                int sum=0;
                for (int i = 0; i < 10; i++) {
                    sum+=i;
                }
                return sum;
            }
        };
        Future<Integer> submit = es.submit(c1);
        System.out.println(submit.get());
    }
}
