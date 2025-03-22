package com.Demo.demo4;

import java.io.File;

public class Test {

    public static void main(String[] args) {
        String path = "F:\\BaiduNetdiskDownload\\02-javase进阶课件\\【瑞客论坛 www.ruike1.com】02-javase进阶课件" +
                "\\JavaSE进阶_day11\\02_代码\\javase_io";
        File file = new File(path);
        getJava(file);
    }

    public static void getJava(File file) {
        if(file.exists()){
             File[] files = file.listFiles();
             for (File f : files) {
                 if (f.isDirectory()) {
                     getJava(f);
                 }
                 else {
                     if(f.getName().endsWith(".java")){
                         System.out.println(f.getName());
                     }
                 }
             }
        }
        else {
            System.out.println("文件不存在");
        }
    }

}
