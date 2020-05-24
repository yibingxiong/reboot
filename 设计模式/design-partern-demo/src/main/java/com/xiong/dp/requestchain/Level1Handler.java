package com.xiong.dp.requestchain;

/**
 * 具体处理请求的类
 */
public class Level1Handler extends Handler {
    protected Level getHandleLevel() {
        return Level.LEVEL1;
    }

    protected Response doRequest(Request request) {
        return new Response(1, "第一个级别在Level1Handler处理了");
    }
}
