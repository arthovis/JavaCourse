package com.sda.patterns.behavioral.visitor.visitor;

import com.sda.patterns.behavioral.visitor.shapes.*;

public class XMLExportVisitor implements Visitor {
    //mai trebuie adaugat la aceasta clasa
    public String export(MyShape...args){
        return null;
    }
    @Override
    public String visitDot(Dot dot) {
        return null;
    }

    @Override
    public String visitCircle(MyCircle circle) {
        return null;
    }

    @Override
    public String visitRectangle(MyRectangle rectangle) {
        return null;
    }

    @Override
    public String visitCompoundGraphic(CompoundMyShape compoundShape) {
        return null;
    }
}
