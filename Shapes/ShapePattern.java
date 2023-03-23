package Shapes;

import com.factory.shapeFactory;


public class ShapePattern {

    public static void main(String[] args) {
        shapeFactory s = new shapeFactory();
        Shape s1 = s.getDraw("circle");
        s1.draw();

    }
}