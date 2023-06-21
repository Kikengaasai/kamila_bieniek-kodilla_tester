package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test

    public void shouldShowTeacherName(){

        Student student = new Student("Andrzej", new Teacher("Konstanty"));

        String result = Application.getTeacherName(student);

        assertEquals("Konstanty", result);

    }

    @Test

    public void shouldShowUndefinedIfTeacherIsNull(){

        Student student = new Student("Andrzej", null);
        String result = Application.getTeacherName(student);

        assertEquals("<undefined>", result);

    }


}
