package com.kodilla.abstracts.homework;

public class Triangle extends Shape{


    public Triangle (double a, double h) {
        super(a,h);
    }

    public void areaTriangle(double a, double h) {
        System.out.println("Area of triangle equals: " + (1/2*a*h));
    }

    @Override
    public void perimeter(double a, double b, double c ) {

    }
}
