package com.github.altrunner.shape;

import java.lang.Math;

import static java.lang.Math.*;

public class Circle implements Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI* pow(this.radius, 2);
    }
}
