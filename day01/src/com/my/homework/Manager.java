package com.my.homework;

public class Manager extends Employee {
    Clerk c;

    public Manager() {
    }

    public Manager(String name, String workId, String dept, Clerk c) {
        super(name, workId, dept);
        this.c = c;
    }

    public void setC(Clerk c) {
        this.c = c;
    }

    public Clerk getC() {
        return c;
    }

    @Override
    public void showMsg() {
        System.out.println(getDept()+"的:"+getName()+",员工编号:"+getWorkId()+"他的职员是"+c.getName());
    }


}
