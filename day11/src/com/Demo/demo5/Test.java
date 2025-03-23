package com.Demo.demo5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        /*FileReader fr = new FileReader("day11/file/2.txt");
        int data;
        while((data=fr.read())!=-1){
            System.out.print((char)data);
        }
        fr.close();
        */
        FileReader fr = new FileReader("day11/file/2.txt");
        char[] buf = new char[100];
        int len = 0;
        while ((len = fr.read(buf)) != -1) {
            System.out.print(new String(buf, 0, len));
        }


    }
}
