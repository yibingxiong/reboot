package com.xiong.dp.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的handler
 */
public class MyInvocationHandler implements InvocationHandler {
    // 被代理对象
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 寻找JoinPoint连结点
        if (true) {
            new BeforeAdvice().exec();
        }
        // 执行被代理的方法
        return method.invoke(this.target, args);
    }
}
