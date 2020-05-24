package com.xiong.dp.command;

import org.junit.Test;

/**
 * 测试类
 */
public class CommandTest {
    @Test
    public void test() {
        Command command = new ConcreteCommand1();
        Command command1 = new ConcreteCommand2();
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
        invoker.setCommand(command1);
        invoker.action();
    }
}
