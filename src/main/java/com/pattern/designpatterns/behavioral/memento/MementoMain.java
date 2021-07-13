package com.pattern.designpatterns.behavioral.memento;

import com.pattern.designpatterns.behavioral.memento.editors.Editor;
import com.pattern.designpatterns.behavioral.memento.shapes.Circle;
import com.pattern.designpatterns.behavioral.memento.shapes.CompoundShape;
import com.pattern.designpatterns.behavioral.memento.shapes.Dot;
import com.pattern.designpatterns.behavioral.memento.shapes.Rectangle;

import java.awt.*;

public class MementoMain {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLACK),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
