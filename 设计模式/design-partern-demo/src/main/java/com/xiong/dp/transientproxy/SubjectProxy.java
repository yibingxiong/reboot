package com.xiong.dp.transientproxy;

/**
 * 代理类
 */
public class SubjectProxy implements Subject {
    private Subject subject = null;

    public SubjectProxy() {
        try {
            this.subject = new RealSubject(this);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void doSomething() {
        System.out.println("doSomething 被代理了");
        this.subject.doSomething();
    }
}
