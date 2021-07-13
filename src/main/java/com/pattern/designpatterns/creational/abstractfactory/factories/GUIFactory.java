package com.pattern.designpatterns.creational.abstractfactory.factories;

import com.pattern.designpatterns.creational.abstractfactory.button.IButton;
import com.pattern.designpatterns.creational.abstractfactory.checkbox.Checkbox;


public interface GUIFactory {
    IButton createButton();
    Checkbox createCheckbox();
}
