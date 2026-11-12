package com.microsoft.bean;


public class Dogs extends Animal {

    public Dogs() {

    }

    public Dogs(String name, String variety, int age, String food) {
        super(name, variety, age, food);
    }

    public Dogs(String name,int age){
        super(name,age);
    }

    // 重写了父类的方法
    @Override
    public void barking() {
        //super.barking();
        System.out.println("汪汪！~~~~~~");
    }

    //反例
    public boolean isGuideBlindness() {
        return false;
    }


}
