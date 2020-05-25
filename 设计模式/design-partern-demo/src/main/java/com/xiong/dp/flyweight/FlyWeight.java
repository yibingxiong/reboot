package com.xiong.dp.flyweight;

/**
 * 抽象享元角色
 */
public abstract class FlyWeight {
    private String intrinsic;
    protected final String extrinsic;

    public FlyWeight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate(); // 业务逻辑

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
