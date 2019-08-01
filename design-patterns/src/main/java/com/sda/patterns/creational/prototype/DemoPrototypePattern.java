package com.sda.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoPrototypePattern {

    public static void main(String[] args) {

        // add a circle, a clone of that circle and a rectangle to a list of shapes and print it
        List<Shape> shapes = new ArrayList();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        shapes.add(circle);
        shapes.add(circle.cloneShape());
        shapes.add(rectangle);

        Iterator<Shape> shapeIterator = shapes.iterator();
        while (shapeIterator.hasNext()) {
            Shape nextShape = shapeIterator.next();
            System.out.println(nextShape);
        }
    }
}
