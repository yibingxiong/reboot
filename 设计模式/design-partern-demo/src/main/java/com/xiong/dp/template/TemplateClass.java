package com.xiong.dp.template;

/**
 * 模板类
 */
public abstract class TemplateClass {
    protected abstract void method1();
    protected abstract void method2();

    /**
     * 模板方法
     */
    public void templateMethod() {
        method1();
        method2();
    }
}
