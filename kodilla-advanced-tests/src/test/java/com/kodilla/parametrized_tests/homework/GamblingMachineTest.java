package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {


    private GamblingMachine gamblingMachine = new GamblingMachine();

   // @ParameterizedTest

   // }

    private Set<Integer> convert(String numbers){
        String[] strings = numbers.split(",");
        Set<Integer> result = new HashSet<>();
        for (String item : strings){
            result.add(Integer.parseInt(item));
        }
        return result;
    }

}