package com.kodilla.abstracts.homework;

public abstract class  Shape {

private double a;
private double b;

private double h;



public Shape (double a, double b){
    this.a = a;
    this.b = b;
}



public abstract void  areaSquare (double a, double b);

public abstract void  areaTriangle (double a, double h);

public abstract void perimeterSquare (double a ,double b);

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }
}
