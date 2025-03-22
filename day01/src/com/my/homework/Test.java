package com.my.homework;

public class Test {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Manager manager= new Manager();
        clerk.setName("李小亮");
        clerk.setDept("销售部");
        clerk.setWorkId("c001");
        clerk.setM(manager);
        manager.setDept("销售部");
        manager.setWorkId("moo1");
        manager.setName("张小强");
        manager.setC(clerk);

        manager.showMsg();
        clerk.showMsg();

    }
}
