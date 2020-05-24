package com.xiong.dp;

public class Singleton {
    private static Singleton singleton = new Singleton();

    // 私有化构造
    private Singleton() {

    }

    // 获取实例
    public static Singleton getInstance() {
        return singleton;
    }

    // 类中其他放方尽量是static的
    public static void otherMethod() {

    }
}
