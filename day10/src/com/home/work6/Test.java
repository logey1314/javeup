package com.home.work6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test  {
    public static void main(String[] args) {
        String filePath1="day10/img1/img.png";
        String filePath2="day10/img2/img.png";
        try (FileInputStream fis =new FileInputStream(new File(filePath1));
             FileOutputStream fos =new FileOutputStream(new File(filePath2))
        ){
            int a;
            while ((a= fis.read())!=-1){
                fos.write(a);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
