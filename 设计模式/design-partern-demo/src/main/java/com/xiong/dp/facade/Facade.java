package com.xiong.dp.facade;

/**
 * 门面
 */
public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void methodA() {
        subSystemA.doSomethingA();
    }

    public void methodB() {
        subSystemB.doSomethingB();
    }

    public void methodC() {
        subSystemC.doSomethingC();
    }
}
