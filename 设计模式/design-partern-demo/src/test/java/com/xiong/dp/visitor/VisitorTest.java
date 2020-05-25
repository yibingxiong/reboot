package com.xiong.dp.visitor;

import com.xiong.dp.visit.Element;
import com.xiong.dp.visit.ObjectStructure;
import com.xiong.dp.visit.Visitor;
import org.junit.Test;

/**
 * 测试类
 */
public class VisitorTest {
    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            Element e = ObjectStructure.createElement();
            e.accept(new Visitor());
        }
    }
}
