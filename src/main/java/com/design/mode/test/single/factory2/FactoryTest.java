package com.design.mode.test.single.factory2;

/**
 * @author wjp
 * @date 2020/1/9 16:42
 */
public class FactoryTest {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        appleFactory.createFruit().whatIm();
    }
}
