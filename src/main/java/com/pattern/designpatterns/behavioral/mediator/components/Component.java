package com.pattern.designpatterns.behavioral.mediator.components;

import com.pattern.designpatterns.behavioral.mediator.mediators.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
