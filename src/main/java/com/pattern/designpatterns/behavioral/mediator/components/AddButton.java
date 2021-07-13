package com.pattern.designpatterns.behavioral.mediator.components;

import com.pattern.designpatterns.behavioral.mediator.mediators.Mediator;
import com.pattern.designpatterns.behavioral.mediator.mediators.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.addNewNote(new Note());
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }
    @Override
    public String getName(){
        return  "AddButton";
    }
}
