package com.Demo.demo6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("day11/file/2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("day11/file/3.txt"))
        ) {
            char[] buf = new char[1024];
            int numRead = 0;
            while((numRead=br.read(buf) )!= -1){
                bw.write(buf, 0, numRead);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
