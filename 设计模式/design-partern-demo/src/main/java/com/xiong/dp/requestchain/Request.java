package com.xiong.dp.requestchain;

/**
 * 请求封装
 */
public class Request {
    Level level;

    public Request(Level level) {
        this.level = level;
    }

    public Level getRequestLevel() {
        return this.level;
    }
}
