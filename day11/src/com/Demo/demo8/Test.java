package com.Demo.demo8;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("day11/file/GBK.txt"),"gbk");
        OutputStreamWriter osw =new OutputStreamWriter(
                new FileOutputStream("day11/file/GBK.txt"),"gbk");
        System.out.println(isr.read());
        osw.write("123");

    }
}
