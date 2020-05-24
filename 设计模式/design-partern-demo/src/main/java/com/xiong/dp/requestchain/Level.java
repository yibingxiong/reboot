package com.xiong.dp.requestchain;

/**
 * 处理级别
 */
public enum Level {
    LEVEL1(1, "级别1"),
    LEVEL2(2, "级别2"),
    LEVEL3(3, "级别3");
    private int code;
    private String msg;

    private Level(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
