package com.design.mode.test.single.factory3;

public class WindowsText implements Text {

    @Override
    public void getWholeText() {
        System.out.println("Inside WindowsText::getWholeText() method.");
    }

}
