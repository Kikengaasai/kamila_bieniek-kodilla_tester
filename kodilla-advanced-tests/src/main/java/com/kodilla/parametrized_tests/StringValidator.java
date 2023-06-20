package com.kodilla.parametrized_tests;

public class StringValidator {

    public boolean isBlank(String text){
        return text == null || text.trim().isEmpty(); //zwraca true kiedy tekst jest nullem LUB gdy tekst POZBAWIONY BIAŁYCH ZNAKÓW jest pusty
    }
}
