package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    double a;
    double b;
    double c;
    double h;


    public Triangle (double a, double h, double b, double c){
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }


    @Override
    public double getArea() {
        return 0.5*a*h;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
