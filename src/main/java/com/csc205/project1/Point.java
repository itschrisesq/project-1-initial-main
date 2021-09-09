package com.csc205.project1;

    // Defined Variables
public class Point {
    double x;
    double y;

    public Point() {

    }

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Calculating distance to Point 2

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getY() - this.getY(), 2) + Math.pow(p.getX() - this.getX(), 2));

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Setting points on coordinate

    public void setPoint(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    // Shifting points along the axes

    public void shiftX(double n) {
        this.setX(this.getX() + n);

    }

    public void shiftY(double n) {
        this.setY(this.getY() + n);
    }

    // Rotates point around the origin

    public void rotate(double rotation) {
        this.setX(this.getX() * Math.cos(rotation) - this.getY() * Math.sin(rotation));
        this.setY(this.getX() * Math.sin(rotation) + this.getY() * Math.cos(rotation));
    }

    // Returns point values

    public String toString() {
        return "Point {x = " + this.getX() + ", y = " + this.getY() + "}";
    }
}