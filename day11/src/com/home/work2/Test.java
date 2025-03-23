package com.home.work2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Test  {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("周杰伦");
        list.add("蔡徐坤");


        FileWriter witer=new FileWriter("day11/file/2.txt");

        for (String s : list) {
            witer.write(s);
            witer.write("\n");
        }
        witer.close();

    }
}
