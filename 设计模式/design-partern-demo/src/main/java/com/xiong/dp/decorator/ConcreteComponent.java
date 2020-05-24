package com.xiong.dp.decorator;

/**
 * 具体被装饰者
 */
public class ConcreteComponent extends Component {
    public void doSomething() {
        System.out.println("被装饰类的方法");
    }
}
