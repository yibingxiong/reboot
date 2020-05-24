package com.xiong.dp.transientproxy;

/**
 * 真实被代理类
 */
public class RealSubject implements Subject {
    public RealSubject(Subject subject) throws ClassNotFoundException {
        if (subject == null) {
            throw new ClassNotFoundException();
        }
    }

    public void doSomething() {
        System.out.println("RealSubject doSomething");
    }
}
