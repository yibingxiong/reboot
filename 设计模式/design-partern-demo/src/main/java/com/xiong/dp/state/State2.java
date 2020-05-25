package com.xiong.dp.state;

/**
 * 具体状态
 */
public class State2 extends State {
    public void handle1() {
        super.context.setCurrentState(Context.STATE1);
        System.out.println("在状态2可以执行 handle1");
    }

    public void hanle2() {

    }
}
