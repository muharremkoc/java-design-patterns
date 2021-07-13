package com.pattern.designpatterns.creational.abstractfactory.button;

public class WindowsButton implements IButton{
    @Override
    public void paint() {
        System.out.println("You have created Windows Button");
    }
}
