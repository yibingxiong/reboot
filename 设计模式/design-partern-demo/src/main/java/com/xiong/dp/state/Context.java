package com.xiong.dp.state;

/**
 * 环境角色
 */
public class Context {
    public static final State STATE1 = new State1();
    public static final State STATE2 = new State2();

    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
        this.currentState.setContext(this);
    }

    public void handle1() {
        this.currentState.handle1();
    }

    public void handle2() {
        this.currentState.hanle2();
    }
}
