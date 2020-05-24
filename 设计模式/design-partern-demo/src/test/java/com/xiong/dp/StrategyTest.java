package com.xiong.dp;

import com.xiong.dp.strategy.Context;
import com.xiong.dp.strategy.Strategy1;
import org.junit.Test;

/**
 * 测试类
 */
public class StrategyTest {
    @Test
    public void test() {
        Context context = new Context();
        context.setStrategy(new Strategy1());
        context.execute();
    }
}
