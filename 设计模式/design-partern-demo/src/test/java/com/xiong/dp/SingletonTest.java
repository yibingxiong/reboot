package com.xiong.dp;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void test() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
