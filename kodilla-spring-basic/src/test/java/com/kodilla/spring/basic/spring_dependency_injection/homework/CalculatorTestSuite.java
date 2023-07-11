package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependecy_injection.homework.Calculator;
import com.kodilla.spring.basic.spring_dependecy_injection.homework.Display;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    private  Calculator calculator = new Calculator(new Display());

    @Test
    void testAdd() {
        calculator.add(6.5, 4.5);
        assertEquals(6.0, calculator.getResult(), 0.0001);
    }

    @Test
    void testSubtract() {
        calculator.subtract(3.5, 2.5);
        assertEquals(1.0, calculator.getResult(), 0.0001);
    }

    @Test
    void testMultiply() {
        calculator.multiply(2.5, 3.5);
        assertEquals(8.75, calculator.getResult(), 0.0001);
    }

    @Test
    void testDivide() {
        calculator.divide(5, 2);
        assertEquals(2.5, calculator.getResult(), 0.0001);
    }

    @Test
    void testDivideByZero() {
        calculator.divide(5, 0);
        assertEquals(Double.NaN, calculator.getResult());
    }
}
