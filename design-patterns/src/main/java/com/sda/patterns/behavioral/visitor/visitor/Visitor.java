package com.sda.patterns.behavioral.visitor.visitor;

import com.sda.patterns.behavioral.visitor.shapes.Circle;
import com.sda.patterns.behavioral.visitor.shapes.Dot;
import com.sda.patterns.behavioral.visitor.shapes.MyCompoundShape;
import com.sda.patterns.behavioral.visitor.shapes.Rectangle;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(MyCompoundShape compoundShape);
}
