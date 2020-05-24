package com.xiong.dp.mediator;

/**
 * 抽象中介者
 */
public abstract class Mediator {
    protected ConcreteColleagure1 concreteColleagure1;
    protected ConcreteColleagure2 concreteColleagure2;

    public abstract void doSomething1();
    public abstract void doSomething2();

    public ConcreteColleagure1 getConcreteColleagure1() {
        return concreteColleagure1;
    }

    public void setConcreteColleagure1(ConcreteColleagure1 concreteColleagure1) {
        this.concreteColleagure1 = concreteColleagure1;
    }

    public ConcreteColleagure2 getConcreteColleagure2() {
        return concreteColleagure2;
    }

    public void setConcreteColleagure2(ConcreteColleagure2 concreteColleagure2) {
        this.concreteColleagure2 = concreteColleagure2;
    }
}
