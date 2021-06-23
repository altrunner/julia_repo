package com.github.altrunner.javamarathon;

public class PointTest {

    public static void main(String args[]){

        Point a1 = new Point(1,2);
        Point b2 = new Point(5,2);
        System.out.println(a1.distance(3,4));
        System.out.println(a1.distance(b2));
        System.out.println(a1.distance(a1));
        System.out.println(a1.distance());
        System.out.println("A1x: " + a1.getXYPair()[0] + " A1y: " + a1.getXYPair()[1]);
    }
}
