package com.pattern.designpatterns.creational.factory;

public abstract class Dialog {
    public void renderWindow(){
        Button okButton=createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
