package com.xiong.dp.requestchain;

/**
 * 响应封装
 */
public class Response {
    private int code;
    private String msg;

    public Response(int code, String msg) {
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
