package com.xiong.dp.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class SubjectDynamicProxy {
    public static Subject newInstance(Subject subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
        return (Subject) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
