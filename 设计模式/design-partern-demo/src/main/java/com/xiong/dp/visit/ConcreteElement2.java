package com.xiong.dp.visit;

/**
 * 具体元素
 */
public class ConcreteElement2 extends Element {
    public void doSomething() {
        System.out.println("element2 业务逻辑");
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
