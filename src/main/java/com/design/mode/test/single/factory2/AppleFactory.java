package com.design.mode.test.single.factory2;

import com.design.mode.test.single.factory.Apple;
import com.design.mode.test.single.factory.Fruit;

public class AppleFactory implements FruitFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}