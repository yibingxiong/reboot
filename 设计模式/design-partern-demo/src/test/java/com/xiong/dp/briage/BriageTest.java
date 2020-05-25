package com.xiong.dp.briage;

import org.junit.Test;

/**
 * 测试类
 */
public class BriageTest {
    @Test
    public void test() {
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new ConcreteAbstraction(implementor);
        abstraction.request();
    }
}
