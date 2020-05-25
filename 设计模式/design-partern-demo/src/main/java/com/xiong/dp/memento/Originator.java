package com.xiong.dp.memento;

import javax.swing.*;

/**
 * 发起人角色
 */
public class Originator {
    private String state;   // 内部状态

    public Originator() {
    }

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建备忘录
    public Memento createMemento() {
        return new Memento(this.state);
    }

    // 恢复备忘录
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }

    public void changeState(String state) {
        this.setState(state);
    }
}
