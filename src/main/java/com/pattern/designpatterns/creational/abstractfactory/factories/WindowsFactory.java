package com.pattern.designpatterns.creational.abstractfactory.factories;

import com.pattern.designpatterns.creational.abstractfactory.button.IButton;
import com.pattern.designpatterns.creational.abstractfactory.button.WindowsButton;
import com.pattern.designpatterns.creational.abstractfactory.checkbox.Checkbox;
import com.pattern.designpatterns.creational.abstractfactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
