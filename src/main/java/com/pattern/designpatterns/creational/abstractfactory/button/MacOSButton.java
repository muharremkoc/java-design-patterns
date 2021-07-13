package com.pattern.designpatterns.creational.abstractfactory.button;

public class MacOSButton implements IButton {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
