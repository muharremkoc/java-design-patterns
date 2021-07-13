package com.pattern.designpatterns.behavioral.mediator.components;

import com.pattern.designpatterns.behavioral.mediator.mediators.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Title extends JTextField implements Component {
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "Title";
    }
}
