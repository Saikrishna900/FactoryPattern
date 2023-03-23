package com.factory;

import Shapes.Shape;
import Shapes.Circle;
import Shapes.Square;
import Shapes.Rectangle;

public class shapeFactory {

    public Shape getDraw(String str) {
        if (str.equals("circle")) {
            return new Circle();
        } else if (str.equals("square")) {
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
