package com.github.altrunner.shape;

import static java.lang.Math.sqrt;

public class Triangle implements Shape{

    double a, b, c;

    public Triangle(){

    }

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return sqrt((a+b+c)/2*((a+b+c)/2 - a)*((a+b+c)/2 - b)*((a+b+c)/2 - c));
    }
}
