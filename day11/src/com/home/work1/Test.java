package com.home.work1;

import java.io.*;

public class Test  {
    public static void main(String[] args) {
        String filePath1="day11/file/img.png";
        String filePath2="day11/file/img_1.png";
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath1));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath2)) ){
            byte[] buff=new byte[1024];
            int len;
            while((len=bis.read(buff))!=-1){
                bos.write(buff,0,len);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
