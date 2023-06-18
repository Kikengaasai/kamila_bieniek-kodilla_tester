package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student ("Karol", null));
        students.add(new Student ("Andrzej", new Teacher("Konstanty")));
        students.add(new Student ("Jola", new Teacher("Gregoria")));
        students.add(new Student ("Mordimer", new Teacher("Aldona")));
        students.add(new Student ("Joanna", new Teacher("Kunegunda")));
        students.add(new Student ("Grzegorz", null));


        for (Student student : students )
            System.out.println("Uczeń: " + student.getName());



    }
}
