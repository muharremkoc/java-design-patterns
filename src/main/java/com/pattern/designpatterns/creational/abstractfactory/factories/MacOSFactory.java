package com.pattern.designpatterns.creational.abstractfactory.factories;

import com.pattern.designpatterns.creational.abstractfactory.button.IButton;
import com.pattern.designpatterns.creational.abstractfactory.button.MacOSButton;
import com.pattern.designpatterns.creational.abstractfactory.checkbox.Checkbox;
import com.pattern.designpatterns.creational.abstractfactory.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
