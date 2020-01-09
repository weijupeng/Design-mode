package com.design.mode.test.single.factory3;

public class LinuxText implements Text {

    @Override
    public void getWholeText() {
        System.out.println("Inside LinuxText::getWholeText() method.");
    }

}
