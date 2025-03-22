package com.home.work2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        try {
            printArray(num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printArray(Integer integer){
        String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        if(integer <1||integer >7) {
            throw new RuntimeException("输入错误");
        }
        System.out.println(arr[integer-1]);
    }

}
