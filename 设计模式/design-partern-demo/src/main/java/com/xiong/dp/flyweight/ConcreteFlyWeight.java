package com.xiong.dp.flyweight;

/**
 * 具体享元角色
 */
public class ConcreteFlyWeight extends FlyWeight {
    public ConcreteFlyWeight(String extrinsic) {
        super(extrinsic);
    }

    public void operate() {
        System.out.println("业务逻辑");
    }
}
