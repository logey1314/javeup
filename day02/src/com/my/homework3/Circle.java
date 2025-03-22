package com.my.homework3;

public class Circle implements ShapePara{
    public static final double PI = 3.14;
    public double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius(){
        return radius;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getCircumference() {
        return 2 * PI*radius;
    }
}
