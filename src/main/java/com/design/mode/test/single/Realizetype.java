package com.design.mode.test.single;

/**
 * @author wjp
 * @date 2020/1/8 17:37
 */
public class Realizetype implements Cloneable {
    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
