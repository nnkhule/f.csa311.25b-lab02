package edu.cmu.cs.cs214.lab02.shapes.implementations;

import edu.cmu.cs.cs214.lab02.shapes.base.Shape;

public class Rectangle implements Shape {
    private double height;
    private double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    @Override
    public double getArea() {
        return height * width;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle of size " + width + "x" + height);
    }
}
