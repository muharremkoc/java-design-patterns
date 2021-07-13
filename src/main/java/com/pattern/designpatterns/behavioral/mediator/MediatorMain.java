package com.pattern.designpatterns.behavioral.mediator;

import com.pattern.designpatterns.behavioral.mediator.components.*;
import com.pattern.designpatterns.behavioral.mediator.mediators.Editor;
import com.pattern.designpatterns.behavioral.mediator.mediators.Mediator;

import javax.swing.*;

public class MediatorMain {
    public static void main(String[] args) {
        Mediator mediator=new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }


}
