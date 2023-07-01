package com.kodilla.parametrized_tests;

import java.util.Arrays;
import java.util.List;

public class PersonSources {

    public static List<Object[]> getPersonData() {
        return Arrays.asList(
                new Object[]{1.8, 60, "Normal (healthy weight)"},
                new Object[]{1.7, 45, "Very severely underweight"},
                new Object[]{1.6, 55, "Normal (healthy weight)"},
                new Object[]{1.8, 105, "Obese Class III (Very severely obese)"},
                new Object[]{1.75, 82, "Overweight"}
        );
}}
