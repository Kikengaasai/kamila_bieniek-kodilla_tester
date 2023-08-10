package com.kodilla;

public class AdvCalcApplication {
    public static void main ( String [] args){
        Book.AdvCalculator calculator = new Book.AdvCalculator();
        double result = calculator.calculate();
        System.out.println("Result: "+ result);
    }
}
