package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {

    private StringValidator validator = new StringValidator(); // tworzymy obiekt do testów

    @Test
    public void shouldReturnFalseIfStringIsNotEmpty() { //powinien zwrócić fałsz jeśli String nie jest pusty
        assertFalse(validator.isBlank("test"));
    }

    @Test
    public void shouldReturnTrueIfStringIsEmpty() { // powinien zwrócić prawdę jeśli string jest pusty
        assertTrue(validator.isBlank(""));
    }

    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces() {//powinien zwrócić prawdę jeśli string zawiera tylko spacje
        assertTrue(validator.isBlank("   "));
    }

    @Test
    public void shouldReturnTrueIfStringIsNull() {//powinien zwrócić prawdę jeśli string jest nullem
        assertTrue(validator.isBlank(null));
    }



}