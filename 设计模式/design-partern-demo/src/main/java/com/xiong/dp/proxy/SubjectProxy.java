package com.xiong.dp.proxy;

/**
 * 代理类
 */
public class SubjectProxy implements Subject {
    private Subject subject = null;

    public SubjectProxy() {
        this.subject = new RealSubject();
    }

    public void doSomething() {
        System.out.println("doSomething 被代理了");
        this.subject.doSomething();
    }
}
