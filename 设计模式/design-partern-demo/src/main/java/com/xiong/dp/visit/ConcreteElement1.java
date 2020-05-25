package com.xiong.dp.visit;

/**
 * 具体元素
 */
public class ConcreteElement1 extends Element {
    public void doSomething() {
        System.out.println("element1 业务逻辑");
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
