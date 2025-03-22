package com.homework2;

public class Company implements Money{
    private int money=1000;


    @Override
    public void pay(Employee employee) {
        money=money-employee.getSalary();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
