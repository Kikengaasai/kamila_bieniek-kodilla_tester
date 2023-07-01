package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {



    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbers.csv", numLinesToSkip = 1)  //same poprawne liczby

    public void shouldReturnCorrectNumberOfWins(String userNumberChoice) throws InvalidNumbersException {
        //Given
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = convert(userNumberChoice);
        //When
        int actualWins =gamblingMachine.howManyWins(userNumbers);
        //Then
        assertTrue(actualWins <= 6 && actualWins >=0);
    }

    public Set<Integer> convert(String numbers) {
        String[] strings = numbers.split(",");
        Set<Integer> result = new HashSet<>();
        for (String item : strings) {
            result.add(Integer.parseInt(item));
        }
        return result;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersOutsideTheRange.csv", numLinesToSkip = 1)  //kilka niewłaściwych liczb
    public void shouldReturnExceptionWhenNumberIsOutOfRange (String userNumberChoice) throws InvalidNumbersException {
        //Given
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = convert(userNumberChoice);

        for(Integer number:userNumbers)
            if(number<1 || number > 49){
            assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
                System.err.println(number + " Wrong number, you should choice between 1-49");
        }else {

        }

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/notEnoughNumbers.csv")  //za mało liczb
    public void shouldReturnExceptionWhenThereArentEnoughNumbers (String userNumberChoice) throws InvalidNumbersException {
        //Given
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = convert(userNumberChoice);

        for(Integer number:userNumbers)
            if(userNumbers.size()!=6){
                assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));

            }else {
                assertDoesNotThrow(() -> gamblingMachine.howManyWins(userNumbers));
            }
        System.err.println("Not enough numbers dude");
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/repeatingNumbers.csv")  //liczby się powtarzają
    public void shouldReturnExceptionWhenNumbersRepeat (String userNumberChoice) throws InvalidNumbersException {
        //Given
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> userNumbers = convert(userNumberChoice);

        for(Integer number:userNumbers)
            if(number.equals(number)){
                assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers));
            }else {
                assertDoesNotThrow(() -> gamblingMachine.howManyWins(userNumbers));
            }
        System.err.println(" You can't choose the same number twice");
    }

}