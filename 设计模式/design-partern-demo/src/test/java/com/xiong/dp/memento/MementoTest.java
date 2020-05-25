package com.xiong.dp.memento;

import org.junit.Test;

/**
 * 测试类
 */
public class MementoTest {
    @Test
    public void test() {
        Originator originator = new Originator("1");
        System.out.println(originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.changeState("3");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
