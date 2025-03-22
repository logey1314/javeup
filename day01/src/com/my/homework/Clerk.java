package com.my.homework;

public class Clerk extends Employee{
    private Manager m;

    public Clerk() {
    }

    public Clerk(String name, String workId, String dept) {
        super(name, workId, dept);
    }

    public Manager getM() {
        return m;
    }

    public void setM(Manager m) {
        this.m = m;
    }

    @Override
    public void showMsg() {
        System.out.println(getDept()+"的:"+getName()+",员工编号:"+getWorkId()+"他的经理是"+m.getName());
    }
}
