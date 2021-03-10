package com.github.altrunner.shape;

public class Rectangle implements Shape{

    double width;
    double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double shapeAreaCalculate() {
        return this.width * this.height;
    }
}
