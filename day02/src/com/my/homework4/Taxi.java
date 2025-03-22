package com.my.homework4;

public class Taxi implements Charge{

    @Override
    public void charge() {
        System.out.println("出租车：1.6元/公里，起价3公里。");
    }
}
