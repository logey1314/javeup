package com.home.work4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*File f=new File("hello.txt");
        System.out.println(f.getAbsolutePath());*/
        System.out.println("Enter the file path:");
        String filePath = sc.nextLine();
        show(filePath);

    }
    public static void show(String filePath){
        File file = new File(filePath);
        if(file.exists()){
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getParent());
            System.out.println(file.length());
            int idnex=file.getName().lastIndexOf(".");
            System.out.println(file.getName().substring(idnex+1));

        }
        else {
            try {
                file.createNewFile();
                System.out.println("文件创建");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
