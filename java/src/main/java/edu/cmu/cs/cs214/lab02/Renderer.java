package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.base.Shape;

public class Renderer {
    private Shape shape; // Бүх дүрсийг хүлээж авдаг

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw(); // Дүрс өөрийгөө зурна
        System.out.println("Shape area: " + shape.getArea());
    }
}
