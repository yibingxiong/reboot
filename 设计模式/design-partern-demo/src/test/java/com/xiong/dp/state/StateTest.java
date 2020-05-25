package com.xiong.dp.state;

import org.junit.Test;

/**
 * 测试类
 */
public class StateTest {
    @Test
    public void test() {
        Context context = new Context();
        context.setCurrentState(new State1());
        context.handle1();
        context.handle2();
        context.handle2();
        context.handle1();
    }
}
