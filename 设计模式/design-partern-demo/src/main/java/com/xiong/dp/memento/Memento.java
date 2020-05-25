package com.xiong.dp.memento;

/**
 * 备忘录
 */
public class Memento {
    private String state; // 发起人内部状态

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
