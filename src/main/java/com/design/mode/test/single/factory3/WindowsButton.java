package com.design.mode.test.single.factory3;

public class WindowsButton implements Button {

    @Override
    public void processEvent() {
        System.out.println("Inside WindowsButton::processEvent() method.");
    }

}
