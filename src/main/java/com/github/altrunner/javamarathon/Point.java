package com.github.altrunner.javamarathon;

public class Point {

    private int x;
    private int y;

    Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getXYPair(){
        int[] xyPair = new int[2];
        xyPair[0] = this.x;
        xyPair[1] = this.y;
        return xyPair;
    }

    public double distance (int x, int y){
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

    public double distance (Point point){
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public double distance(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}
