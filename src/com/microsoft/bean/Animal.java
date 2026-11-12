package com.microsoft.bean;
// 动物类 都具有这些
// 类当中的变量和方法总称为：属性（共性、特性）

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Animal {

    // 成员变量：它们组成和构成了类，所以我们这么命名
    // 它们是类的重要组成部分

    // public 公共的，公有的————用户可以为所欲为

    // private 私有的 用户不能为所欲为

    // NanG 小区名 静态变量
    private static final String TEXT_COMMUNITY_NAME = "NanG";

    // 动物名字
    private String name;

    // 动物种类
    private String variety;

    // 动物年龄
    private int age;

    // 动物的食物
    private String food;

    public Animal(String name, String variety, int age, String food) {
        this.name = name;
        this.variety = variety;
        this.age = age;
        this.food = food;
    }

    public Animal() {

    }

    public Animal(String name, int age) {
    }

    public static void injection() {
        System.out.println("所有的动物，月底打针！");
    }

    public static String getTextCommunityName() {
        return TEXT_COMMUNITY_NAME;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 30) {
            System.out.println("您输入的数据不合法，已默认清零");
            this.age = 0;
        } else {
            this.age = age;
        }

    }

    //一个动作，这些方法（函数）当中，我们有很好听的名字——行为
    public void eat() {
        System.out.println(this.name + "吃饭...正在吃" + this.food);
    }

    public void sleep() {
        System.out.println(this.name + "睡觉");
    }

    public void sick() {
        System.out.println(this.name + "生病");
    }

    //抽象方法 ———— 不能有实际的意义
    public abstract void barking();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", variety='" + variety + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                '}';
    }
}
