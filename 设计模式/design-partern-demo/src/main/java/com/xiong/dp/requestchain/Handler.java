package com.xiong.dp.requestchain;

/**
 * 处理请求抽象
 */
public abstract class Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandleLevel().getCode() == request.getRequestLevel().getCode()) {
            // 自己处理
            response = this.doRequest(request);
        } else {
            if (this.nextHandler != null) {
                // 交给下一个人处理
                response = this.nextHandler.handleMessage(request);
            } else {
                response = new Response(-1, "无人处理");
            }
        }
        return response;
    }

    // 获取当前处理者能够处理的级别
    protected abstract Level getHandleLevel();

    // 处理请求
    protected abstract Response doRequest(Request request);
}
