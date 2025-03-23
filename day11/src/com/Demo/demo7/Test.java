package com.Demo.demo7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day11/file/3.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11/file/4.txt"));
        String s=br.readLine();
        String[] s1 = s.split(" ");
        /*List<Integer> list = new ArrayList<Integer>();
        for (String string : s1) {
            list.add(Integer.parseInt(string));
        }
        Collections.sort(list);
        System.out.println(list);
        bw.write(list.toString());
        bw.newLine();
        bw.flush();*/
        Stream<String> stream=Stream.of(s1);
        Stream<Integer> integerStream = stream.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });
        String string=integerStream.sorted().collect(Collectors.toList()).toString();
        bw.write(string);
        bw.flush();

    }
}
