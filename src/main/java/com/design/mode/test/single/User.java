package com.design.mode.test.single;

import java.util.Objects;

/**
 * @author wjp
 * @date 2020/1/8 17:14
 */
public class User {

    private String name;
    private int age;

    private static final User userInstance = null;

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private User() {
    }

    public static synchronized User getUser(String name, int age) {
        if (Objects.isNull(userInstance)) {
            return new User(name, age);
        }
        return userInstance;
    }

    public static synchronized User getUser() {
        if (Objects.isNull(userInstance)) {
            return new User();
        }
        return userInstance;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
