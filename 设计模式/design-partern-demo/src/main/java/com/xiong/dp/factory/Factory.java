package com.xiong.dp.factory;

/**
 * 抽象工厂
 */
public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> clazz);
}
