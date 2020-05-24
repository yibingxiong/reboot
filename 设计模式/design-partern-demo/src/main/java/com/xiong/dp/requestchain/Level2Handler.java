package com.xiong.dp.requestchain;

public class Level2Handler extends Handler {
    protected Level getHandleLevel() {
        return Level.LEVEL2;
    }

    protected Response doRequest(Request request) {
        return new Response(1, "第2个级别在Level2Handler处理了");
    }
}
