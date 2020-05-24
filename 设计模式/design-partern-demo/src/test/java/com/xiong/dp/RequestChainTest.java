package com.xiong.dp;

import com.xiong.dp.requestchain.*;
import org.junit.Test;

/**
 * 测试类
 */
public class RequestChainTest {
    @Test
    public void test() {
        Level1Handler level1Handler = new Level1Handler();
        Level2Handler level2Handler = new Level2Handler();
        Level3Handler level3Handler = new Level3Handler();
        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Response response = level1Handler.handleMessage(new Request(Level.LEVEL2));
        System.out.println(response.getCode());
        System.out.println(response.getMsg());
    }
}
