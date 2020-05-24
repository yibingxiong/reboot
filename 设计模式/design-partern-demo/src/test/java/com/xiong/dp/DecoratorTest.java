package com.xiong.dp;

import com.xiong.dp.decorator.Component;
import com.xiong.dp.decorator.ConcreteComponent;
import com.xiong.dp.decorator.Decorator;
import org.junit.Test;

/**
 * 测试类
 */
public class DecoratorTest {
    @Test
    public void test() {
        Component component = new ConcreteComponent();
        Decorator component1 = new Decorator(component);
        component1.doSomething();
        component1.newMethod();
    }
}
