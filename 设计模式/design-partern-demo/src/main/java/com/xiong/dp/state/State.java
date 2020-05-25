package com.xiong.dp.state;

/**
 * 状态抽象类
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    // 行为1
    public abstract void handle1();
    // 行为2
    public abstract void hanle2();
}
