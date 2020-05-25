package com.xiong.dp.observer;

/**
 * 具体的被观察者
 */
public class ConcreteSubject extends Subject {
    public void doSomething() {
        super.notifyObservers("doSomething");
    }
}
