package com.kodilla.parametrized_tests;

import java.util.Arrays;
import java.util.List;

public class PersonSources {

    public static List<Object[]> getPersonData() {
        return Arrays.asList(
                new Object[]{1.8,50, "Severely underweight"},
                new Object[]{1.8,59, "Underweight"},
                new Object[]{1.8,65, "Normal (healthy weight)"},
                new Object[]{1.8,90,"Overweight"},
                new Object[]{1.8,110,"Obese Class I"}
        );
}}
