package com.microsoft.bean;

//最下层了，后面没人继承他了

// final 最终 断子绝孙了！
// 1. 遗产没人继承了，也不可能继承————final 的类，它不能被继承

public final class Labrador extends Dogs{
    @Override
    public boolean isGuideBlindness() {
        return true;
    }
}
