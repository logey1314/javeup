package com.homework6;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd--HH-mm-ss");
        String day=sdf.format(today);
        System.out.println(day);
    }


}
