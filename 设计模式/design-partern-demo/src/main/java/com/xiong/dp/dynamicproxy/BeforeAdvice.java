package com.xiong.dp.dynamicproxy;

/**
 * 通知类
 */
public class BeforeAdvice implements Advice {
    public void exec() {
        System.out.println("前置通知执行了");
    }
}
