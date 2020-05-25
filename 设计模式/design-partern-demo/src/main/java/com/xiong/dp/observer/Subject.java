package com.xiong.dp.observer;

import java.util.ArrayList;

/**
 * 被观察者抽象类
 */
public abstract class Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(Object object) {
        for (Observer observer : this.observers) {
            observer.update(object);
        }
    }
}
