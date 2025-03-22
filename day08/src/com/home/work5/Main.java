package com.home.work5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args)  {
        String strDate = "2000年10月10日";
        Date time= null;
        try {
            time = methon(strDate);
        } catch (ParseException e) {
            System.out.println("处理异常");

        }
        System.out.println(time);

    }

    public static Date methon(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return  sdf.parse(str);
    }

}
