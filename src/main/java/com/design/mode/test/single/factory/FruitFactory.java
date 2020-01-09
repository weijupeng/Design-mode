package com.design.mode.test.single.factory;

import java.util.Objects;

/**
 * @author wjp
 * @date 2020/1/9 16:34
 */
public class FruitFactory {
    public Fruit createFruit(String type) {
        if (Objects.equals("apple", type)) {
            return new Apple();
        } else if (Objects.equals("pear", type)) {
            return new Pear();
        }
        return null;
    }
}
