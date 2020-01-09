package com.design.mode.test.single;

/**
 * @author wjp
 * @date 2020/1/8 17:39
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype obj1 = new Realizetype();

        Realizetype obj2 = (Realizetype) obj1.clone();

        System.out.println("obj1==obj2?" + (obj1 == obj2));
    }
}
