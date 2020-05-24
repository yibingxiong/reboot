package com.xiong.dp.strategy;

/**
 * 封装策略
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.doSomething();
    }
}
