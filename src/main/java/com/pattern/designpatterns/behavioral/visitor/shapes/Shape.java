package com.pattern.designpatterns.behavioral.visitor.shapes;

import com.pattern.designpatterns.behavioral.visitor.visitors.Visitor;

public interface Shape {
    void move(int x,int y);
    void draw();
    String accept(Visitor visitor);
}
