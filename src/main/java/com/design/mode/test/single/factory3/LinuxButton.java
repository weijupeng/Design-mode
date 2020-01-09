package com.design.mode.test.single.factory3;

public class LinuxButton implements Button {

    @Override
    public void processEvent() {
        System.out.println("Inside LinuxButton::processEvent() method.");
    }

}