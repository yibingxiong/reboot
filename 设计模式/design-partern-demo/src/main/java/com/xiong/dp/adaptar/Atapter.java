package com.xiong.dp.adaptar;

/**
 * 适配器角色
 */
public class Atapter extends Adaptee implements Target {
    public void request() {
        super.doAnyThing();
    }
}
