package com.design.mode.test.single.factory2;

import com.design.mode.test.single.factory.Fruit;
import com.design.mode.test.single.factory.Pear;

public class PearFactory implements FruitFactory {
    @Override
    public Fruit createFruit() {
        return new Pear();
    }
}