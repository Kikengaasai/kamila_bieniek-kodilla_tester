package com.kodilla.collections.adv.maps.complex.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List <Integer> numberOfStudents;

    public School(List<Integer> numberOfStudents) {

        this.numberOfStudents = numberOfStudents;
    }

    public int countStudents(){
        int sum=0;
        for(int i=0; i<numberOfStudents.size();i++){
            sum=sum + numberOfStudents.get(i);

        }return sum;


    }



    @Override
    public String toString() {
        return "numberOfStudents=" + numberOfStudents;
    }


}
