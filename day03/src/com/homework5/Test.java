package com.homework5;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat customFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = customFormat.format(now);
        System.out.println("Formatted date: " + formattedDate);
    }
}
