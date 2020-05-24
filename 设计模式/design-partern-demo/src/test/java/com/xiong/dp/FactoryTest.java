package com.xiong.dp;

import com.xiong.dp.factory.*;
import org.junit.Test;

/**
 * 测试类
 */
public class FactoryTest {
    @Test
    public void test() {
        Factory factory = new ProductFactory1();
        ProductA productA = factory.createProduct(ProductA.class);
        ProductB productB = factory.createProduct(ProductB.class);
        productA.method2();
        productB.method2();
    }
}
