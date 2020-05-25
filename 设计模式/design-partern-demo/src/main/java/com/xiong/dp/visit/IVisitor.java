package com.xiong.dp.visit;

/**
 * 访问者接口
 */
public interface IVisitor {
    void visit(ConcreteElement1 concreteElement1);
    void visit(ConcreteElement2 concreteElement2);
}
