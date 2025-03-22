package com.doudizhu;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //map 牌面与编号
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(0,"大王");
        map.put(1,"小王");
        List<String> huase=new ArrayList<String>();
        List<String> huahao=new ArrayList<String>();
        Collections.addAll(huase,"♥","♠","♦","♣");
        Collections.addAll(huahao,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int k=2;
        for (String s : huahao) {
            for (String string : huase) {
                String str=string+s;
                map.put(k,str);
                k++;
            }
        }
        System.out.println(map);
        System.out.println("_________________________________________________");
        //准备牌
        List<Integer> pai=new ArrayList<>();
        for (int i = 0; i <54 ; i++) {
            pai.add(i);
        }

        System.out.println(pai);
        System.out.println("_________________________________________________");


        //洗牌
        List<Integer> dipai=new ArrayList<>();
        Collections.shuffle(pai);
        for(int i=pai.size()-1;i>=51;i--){
            dipai.add(pai.get(i));
            pai.remove(i);
        }
        System.out.println(dipai);
        System.out.println(pai);
        System.out.println("_________________________________________________");

        //发牌
        List<Integer> stu1=new ArrayList<>();
        List<Integer> stu2=new ArrayList<>();
        List<Integer> stu3=new ArrayList<>();
        for (int i = 0; i <pai.size() ; i++) {
            if(i%3==0){
                stu1.add(pai.get(i));
            }
            else if(i%3==1){
                stu2.add(pai.get(i));
            }
            else if(i%3==2){
                stu3.add(pai.get(i));
            }
        }
        System.out.println("stu1"+stu1);
        System.out.println("stu2"+stu2);
        System.out.println("stu3"+stu3);
        System.out.println("_________________________________________________");

        //看牌
        System.out.println("_______st1_________");
        for (int i = 0; i < stu1.size(); i++) {

            System.out.print(map.get(stu1.get(i))+" ");

        }
        System.out.println("");
        System.out.println("_______st2_________");
        for (int i = 0; i < stu2.size(); i++) {

            System.out.print(map.get(stu2.get(i))+" ");

        }
        System.out.println("");
        System.out.println("_______st3_________");
        for (int i = 0; i < stu3.size(); i++) {
            System.out.print(map.get(stu3.get(i))+" ");
        }
        System.out.println("");
        System.out.println("_______dipai_________");
        for (int i = 0; i < dipai.size(); i++) {
            System.out.print(map.get(dipai.get(i))+" ");
        }

    }
}
