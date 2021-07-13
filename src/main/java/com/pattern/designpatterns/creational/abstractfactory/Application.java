package com.pattern.designpatterns.creational.abstractfactory;

import com.pattern.designpatterns.creational.abstractfactory.button.IButton;
import com.pattern.designpatterns.creational.abstractfactory.checkbox.Checkbox;
import com.pattern.designpatterns.creational.abstractfactory.factories.GUIFactory;

public class Application {
    private IButton button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        button=guiFactory.createButton();
        checkbox=guiFactory.createCheckbox();
    }
    public void paint(){
        button.paint();
        checkbox.paint();
    }

}
