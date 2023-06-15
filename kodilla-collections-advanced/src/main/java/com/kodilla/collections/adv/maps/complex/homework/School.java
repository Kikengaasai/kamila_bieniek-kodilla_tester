package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> numberOfStudents = new ArrayList<>();

    public School(List<Integer> numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "numberOfStudents=" + numberOfStudents;
    }
}
