package com.xiong.dp.mediator;

/**
 * 具体同事类
 */
public class ConcreteColleagure1 extends Colleagure {
    public ConcreteColleagure1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {
        System.out.println("ConcreteColleagure1 自己的业务逻辑");
    }

    public void depMethod1() {
        // 依赖其他对象的逻辑，给中介者处理
        super.mediator.doSomething1();
    }
}
