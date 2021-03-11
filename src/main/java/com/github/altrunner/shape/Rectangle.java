package com.github.altrunner.shape;

import static java.lang.Math.*;

public class Rectangle implements Shape{

    double width;
    double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }
}
