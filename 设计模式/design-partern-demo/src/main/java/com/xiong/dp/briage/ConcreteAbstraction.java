package com.xiong.dp.briage;

/**
 * 具体的抽象化角色
 */
public class ConcreteAbstraction extends Abstraction {
    public ConcreteAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void request() {
        super.request();
        super.getImplementor().doAnyThing();
    }
}
