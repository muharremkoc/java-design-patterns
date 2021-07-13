package com.pattern.designpatterns.behavioral.mediator.components;

import com.pattern.designpatterns.behavioral.mediator.mediators.Mediator;
import com.pattern.designpatterns.behavioral.mediator.mediators.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveButton extends JButton implements Component {
    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.saveChanges();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }
    @Override
    public String getName(){
        return  "SaveButton";
    }
}
