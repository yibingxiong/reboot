package com.xiong.dp.briage;

/**
 * 抽象化角色
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void request() {
        this.implementor.doSomething();
    }

    public Implementor getImplementor() {
        return implementor;
    }
}
