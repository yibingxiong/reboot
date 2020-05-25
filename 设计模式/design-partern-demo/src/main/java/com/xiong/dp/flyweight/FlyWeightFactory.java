package com.xiong.dp.flyweight;

import java.util.HashMap;

/**
 * 享元对象工厂
 */
public class FlyWeightFactory {
    private static HashMap<String, FlyWeight> flyWeightHashMap = new HashMap<String, FlyWeight>();

    public static FlyWeight getFlyWeight(String extrinsic) {
        FlyWeight flyWeight = null;
        if (flyWeightHashMap.containsKey(extrinsic)) {
            flyWeight = flyWeightHashMap.get(extrinsic);
        } else {
            flyWeight = new ConcreteFlyWeight(extrinsic);
            flyWeightHashMap.put(extrinsic, flyWeight);
        }
        return flyWeight;
    }
}
