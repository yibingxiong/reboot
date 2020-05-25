package com.xiong.dp.state;

/**
 * 具体状态
 */
public class State1 extends State {
    public void handle1() {

    }

    public void hanle2() {
        super.context.setCurrentState(Context.STATE2);
        System.out.println("在状态1可以执行 handle2");
    }
}
