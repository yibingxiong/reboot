package com.xiong.dp.abstractfactory;

public class Factory {
    public ProductA createProductA() {
        return new ProductA();
    }

    public ProductB createProductB() {
        return new ProductB();
    }
}
