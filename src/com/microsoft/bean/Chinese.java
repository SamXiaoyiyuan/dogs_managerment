package com.microsoft.bean;

public class Chinese implements Human{
    @Override
    public void run() {
        System.out.println("小跑");
    }

    @Override
    public void eat() {
        System.out.println("吃西餐");
    }
}
