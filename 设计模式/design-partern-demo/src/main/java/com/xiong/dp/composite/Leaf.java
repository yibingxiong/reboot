package com.xiong.dp.composite;

public class Leaf extends Component {
    @Override
    public void doSomething() {
        System.out.println("叶子");
        super.doSomething();
    }
}
