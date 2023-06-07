package com.kodilla.abstracts;

import com.kodilla.abstracts.homework.Square;
import com.kodilla.abstracts.homework.Trapeze;
import com.kodilla.abstracts.homework.Triangle;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println("Pole kwadratu wynosi: " +square.getArea());
        System.out.println("Obwód kwadratu wynosi: " +square.getPerimeter());

        Triangle triangle = new Triangle(5,6,8,4);
        System.out.println("Pole trójkąta wynosi: " +triangle.getArea());
        System.out.println("Obwód trójkąta wynosi: " +triangle.getPerimeter());

        Trapeze trapeze = new Trapeze(2,4,6,5,8);
        System.out.println("Pole trapezu wynosi: " +trapeze.getArea());
        System.out.println("Obwód trapezu wynosi: " +trapeze.getPerimeter());

        }





    }

