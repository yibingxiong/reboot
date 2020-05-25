package com.xiong.dp.visit;

/**
 * 抽象元素
 */
public abstract class Element {
    public abstract void doSomething(); // 业务逻辑

    public abstract void accept(IVisitor visitor); // 允许谁访问
}
