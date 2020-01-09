package com.design.mode.test.single.factory;

/**
 * @author wjp
 * @date 2020/1/9 16:37
 */
public class FruitTest {
    public static void main(String[] args) {
        String type = "1";
        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruit = fruitFactory.createFruit(type);
        fruit.whatIm();
    }
}
