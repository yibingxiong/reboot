package com.xiong.dp.transientproxy;

import org.junit.Test;

/***
 * 测试类
 */
public class ProxyTest {
    @Test
    public void test() {
        SubjectProxy subjectProxy = new SubjectProxy();
        subjectProxy.doSomething();
    }

    @Test
    public void test2() throws ClassNotFoundException {
        // 会报错的
//        RealSubject realSubject = new RealSubject();
//        realSubject.doSomething();
    }
}
