package com.xiong.dp.visit;

/**
 * 具体的访问者
 */
public class Visitor implements IVisitor {
    public void visit(ConcreteElement1 concreteElement1) {
        concreteElement1.doSomething();
    }

    public void visit(ConcreteElement2 concreteElement2) {
        concreteElement2.doSomething();
    }
}
