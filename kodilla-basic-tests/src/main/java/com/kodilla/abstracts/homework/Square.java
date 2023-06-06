package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square(double a, double b) {
        super(a, b);
    }

    @Override
    public void areaSquare  (double a, double b) {
        System.out.println("Area equals: " + a*b);
    }

    @Override
    public void perimeterSquare (double a, double b) {
        System.out.println("Perimeter equals: "+ (2*a+2*b));

    }
}
