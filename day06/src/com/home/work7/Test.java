package com.home.work7;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("柳岩", 2100);
        map.put("张亮", 1700);
        map.put("诸葛亮", 1800);
        map.put("灭绝师太", 2600);
        map.put("东方不败", 3800);
        map.put("柳岩",map.get("柳岩")+300);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
