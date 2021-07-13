package com.pattern.designpatterns.behavioral.mediator.components;

import com.pattern.designpatterns.behavioral.mediator.mediators.Mediator;
import com.pattern.designpatterns.behavioral.mediator.mediators.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.deleteNote();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
