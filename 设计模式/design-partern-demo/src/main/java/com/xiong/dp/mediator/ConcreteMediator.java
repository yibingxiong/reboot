package com.xiong.dp.mediator;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {
    public void doSomething1() {
        super.concreteColleagure1.selfMethod1();
        super.concreteColleagure2.selfMethod1();
    }

    public void doSomething2() {
        super.concreteColleagure2.selfMethod1();
        super.concreteColleagure1.selfMethod1();
    }
}
