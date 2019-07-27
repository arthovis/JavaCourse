package com.sda.patterns.behavioral.visitor.visitor;

import com.sda.patterns.behavioral.visitor.shapes.CompoundMyShape;
import com.sda.patterns.behavioral.visitor.shapes.Dot;
import com.sda.patterns.behavioral.visitor.shapes.MyCircle;
import com.sda.patterns.behavioral.visitor.shapes.MyRectangle;

public interface Visitor {
    String visitDot (Dot dot);
    String visitCircle(MyCircle circle);
    String visitRectangle(MyRectangle rectangle);
    String visitCompoundGraphic(CompoundMyShape compoundShape);
}
