package com.kodilla.collections.adv.maps.complex.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> assignmentOfPrincipal = new HashMap<>();

        Principal henry = new Principal("Szkoła nr 11", "Henry", "Jonson");
        Principal john = new Principal("Szkoła nr 3", "John", "Parker");
        Principal jeremy = new Principal("Szkoła nr 1", "Jeremy", "Kubrick");
        Principal alex = new Principal("Szkoła nr 2", "Alex", "Powhatan");

        School henryClasses = new School(Arrays.asList(20,25,31,24,30));
        School johnClasses = new School(Arrays.asList(26,28,30,28,30));
        School jeremyClasses = new School(Arrays.asList(23,25,29,27,32));
        School alexClasses = new School(Arrays.asList(22,22,31,27,29));

        assignmentOfPrincipal.put(henry, henryClasses);
        assignmentOfPrincipal.put(john, johnClasses);
        assignmentOfPrincipal.put(jeremy, jeremyClasses);
        assignmentOfPrincipal.put(alex, alexClasses);


        for (Map.Entry<Principal, School> principalEntry : assignmentOfPrincipal.entrySet())
            System.out.println("Principal:  Name: " + principalEntry.getKey().getPrincipalName() +"   "+"Last name: "+ principalEntry.getKey().getPrincipalLastName() +"   "+ "Name of school: "+ principalEntry.getKey().getSchoolName()+"    "+ principalEntry.getValue().countStudents());



    }
}
