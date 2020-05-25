package com.xiong.dp.visit;

import java.util.Random;

/**
 * 结构对象
 */
public class ObjectStructure {
    public static Element createElement() {
        Random random = new Random();
        if(random.nextInt(100) < 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
