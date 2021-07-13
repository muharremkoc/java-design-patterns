package com.pattern.designpatterns.creational.abstractfactory.checkbox;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created WibdowsCheckbox");
    }
}
