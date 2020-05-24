package com.xiong.dp.dynamicproxy;

import org.junit.Test;

/**
 * 测试类
 */
public class ProxyTest {
    @Test
    public void test() {
        Subject subject = new RealSubject();
        Subject proxySubject = SubjectDynamicProxy.newInstance(subject);
        proxySubject.doSomething();
    }
}

