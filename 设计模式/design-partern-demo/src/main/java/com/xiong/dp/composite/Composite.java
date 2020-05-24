package com.xiong.dp.composite;

import java.util.ArrayList;

/**
 * 树枝
 */
public class Composite extends Component {
    /**
     * 子节点容器
     */
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();

    // 加节点
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    // 删节点
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    // 获取子节点
    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
