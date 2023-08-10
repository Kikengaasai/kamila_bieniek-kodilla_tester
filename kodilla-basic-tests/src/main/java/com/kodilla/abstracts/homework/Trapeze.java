package com.kodilla.abstracts.homework;

public class Trapeze extends Shape{

    double a;
    double b;
    double c;
    double d;
    double h;

    public Trapeze(double a, double b, double c, double d, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5*(a+b)*h;
    }

    @Override
    public double getPerimeter() {
        return a+b+c+d;
    }
}
