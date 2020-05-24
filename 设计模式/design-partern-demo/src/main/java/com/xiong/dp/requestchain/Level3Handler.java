package com.xiong.dp.requestchain;

public class Level3Handler extends Handler {
    protected Level getHandleLevel() {
        return Level.LEVEL3;
    }

    protected Response doRequest(Request request) {
        return new Response(1, "第2个级别在Level3Handler处理了");
    }
}
