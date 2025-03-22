package com.my.homework4;

public class Cinema implements Charge,Play{

    @Override
    public void charge() {
        System.out.println("解放电影院：“30元/张，凭学生证享受半价。");
    }

    @Override
    public void play() {
        System.out.println("正在放映电影。");

    }
}
