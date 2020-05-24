package com.xiong.dp.proxy;

/**
 * 真实被代理类
 */
public class RealSubject implements Subject {
    public void doSomething() {
        System.out.println("RealSubject doSomething");
    }
}
