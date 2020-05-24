package com.xiong.dp.decorator;

/**
 * 装饰类
 */
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void doSomething() {
        this.component.doSomething();
    }

    public void newMethod() {
        System.out.println("新增一个方法");
    }
}
