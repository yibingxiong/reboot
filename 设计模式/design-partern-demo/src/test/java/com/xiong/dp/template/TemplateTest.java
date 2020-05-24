package com.xiong.dp.template;

import org.junit.Test;

/**
 * 测试类
 */
public class TemplateTest {
    @Test
    public void test() {
        TemplateSubClass1 templateSubClass1 = new TemplateSubClass1();
        templateSubClass1.templateMethod();
        TemplateSubClass2 templateSubClass2 = new TemplateSubClass2();
        templateSubClass2.templateMethod();
    }
}
