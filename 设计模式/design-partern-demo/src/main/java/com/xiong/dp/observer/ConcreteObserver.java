package com.xiong.dp.observer;

/**
 * 具体的观察者
 */
public class ConcreteObserver implements Observer {
    public void update(Object object) {
        System.out.println("收到了通知"+object.toString());
    }
}
