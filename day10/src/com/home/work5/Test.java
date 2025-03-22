package com.home.work5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test  {
    public static void main(String[] args) {
       String filePath="day10/src/com/home/work5/file01.txt";
        try(FileInputStream fis=new FileInputStream(new File(filePath));) {
            System.out.println((char) fis.read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("==========================");
        try(FileInputStream fis2=new FileInputStream(new File(filePath));) {
            while((fis2.read()!=-1)) {
                System.out.println((char) fis2.read());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
