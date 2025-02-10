package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.base.Shape;
import edu.cmu.cs.cs214.lab02.shapes.implementations.Circle;
import edu.cmu.cs.cs214.lab02.shapes.implementations.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.implementations.Square;


public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        Renderer rectangleRenderer = new Renderer(rectangle);
        Renderer circleRenderer = new Renderer(circle);
        Renderer squareRenderer = new Renderer(square);

        rectangleRenderer.draw();
        circleRenderer.draw();
        squareRenderer.draw();
    }
}
