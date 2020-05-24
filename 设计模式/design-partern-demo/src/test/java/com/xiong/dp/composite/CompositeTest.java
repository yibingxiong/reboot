package com.xiong.dp.composite;

import org.junit.Test;

/**
 * 测试类
 */
public class CompositeTest {
    @Test
    public void test() {
        Composite root = new Composite();
        root.doSomething();

        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
        display(root);
    }

    private void display(Composite root) {
        for (Component component1 : root.getChildren()) {
            if (component1 instanceof Leaf) {
                component1.doSomething();
            } else {
                display((Composite) component1);
            }
        }
    }
}
