package com.pattern.designpatterns.creational.factory;

public class HTMLDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
