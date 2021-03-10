package com.github.altrunner.shape;

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
    public double shapeAreaCalculate() {
        return Math.sqrt((a+b+c)/2*((a+b+c)/2 - a)*((a+b+c)/2 - b)*((a+b+c)/2 - c));
    }
}
