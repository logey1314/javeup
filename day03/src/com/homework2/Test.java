package com.homework2;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(200,"m");
        Programmer programmer=new Programmer(100,"p");
        Company company=new Company();
        company.pay(manager);
        company.pay(programmer);
        System.out.println(company.getMoney());
    }
}
