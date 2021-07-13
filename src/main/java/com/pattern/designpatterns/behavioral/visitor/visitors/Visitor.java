package com.pattern.designpatterns.behavioral.visitor.visitors;

import com.pattern.designpatterns.behavioral.visitor.shapes.Circle;
import com.pattern.designpatterns.behavioral.visitor.shapes.CompoundShape;
import com.pattern.designpatterns.behavioral.visitor.shapes.Dot;
import com.pattern.designpatterns.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
