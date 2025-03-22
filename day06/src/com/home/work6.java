package com.home;

import java.util.HashMap;
import java.util.Map;

public class work6 {
    public static void main(String[] args) {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
