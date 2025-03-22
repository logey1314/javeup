package com.homework01;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
        BigDecimal bd = new BigDecimal(0);
        for (double v : arr) {
            BigDecimal bd2 = new BigDecimal(v+"");
            bd = bd2.add(bd2);
        }
        System.out.println(bd);

    }
}
