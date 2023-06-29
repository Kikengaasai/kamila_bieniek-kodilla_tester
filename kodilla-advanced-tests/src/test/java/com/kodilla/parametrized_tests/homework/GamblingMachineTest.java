package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {



    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers.csv", numLinesToSkip = 1)

    public void shouldReturnCorrectNumberOfWins(String userNumberChoice) throws InvalidNumbersException {
        //Given
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = convert(userNumberChoice);
        int actualWins =gamblingMachine.howManyWins(userNumbers);
        Set<Integer> expectedComputer = gamblingMachine.generateComputerNumbers();
        int expectedWins =gamblingMachine.howManyWins(expectedComputer);

        assertEquals(expectedWins,actualWins);
    }

    public Set<Integer> convert(String numbers) {
        String[] strings = numbers.split(",");
        Set<Integer> result = new HashSet<>();
        for (String item : strings) {
            result.add(Integer.parseInt(item));
        }
        return result;
    }

}