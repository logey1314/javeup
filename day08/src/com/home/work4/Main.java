package com.home.work4;

import java.util.Scanner;

public class Main {
    private static final String USER = "张三";
    private static final String PASSWORD = "123456";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String password = sc.nextLine();
        try {
            login(name, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String user,String password) throws Exception {


        if(user.equals(USER) && password.equals(PASSWORD)){
            System.out.println("欢迎"+user);
        }

        if(!user.equals(USER)){
            throw new LoginException("用户名不存在");
        }

        if(!password.equals(PASSWORD)){
            throw new LoginException("密码错误");
        }


    }
}
