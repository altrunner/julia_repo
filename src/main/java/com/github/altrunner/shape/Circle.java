package com.github.altrunner.shape;

import java.lang.Math;

public class Circle implements Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double shapeAreaCalculate() {
        return Math.PI*Math.pow(radius, 2);
    }
}
