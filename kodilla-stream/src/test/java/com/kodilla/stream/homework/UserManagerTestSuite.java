package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class UserManagerTestSuite {

    @Test
    public void shouldShowChemistsUsernames() {
        List<String> result = UserManager.filterChemistGroupUsernames(UsersRepository.getUsersList());
        assertEquals(2, result.size());
        List<String> expectedList = new ArrayList<>();
        expectedList.add()

        assertEquals(result, expectedList);
    }


    @Test

    public void shouldShowOlderPeopleThanAgeGiven(int age) {

        List<String> result = UserManager.filterOlderPeople(age);

        assertEquals(5, result.size());

        List<User> expectedList = new ArrayList<>();


        assertEquals(result, expectedList);
    }

}


