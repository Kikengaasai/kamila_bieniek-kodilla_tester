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
        List<String> result = UserManager.filterChemistGroupUsernames();

        assertEquals(2, result.size());

        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        assertEquals(result, expectedList);

    }


    @Test

    public void shouldShowOlderPeopleThanAgeGiven() {

        List<String> result = UserManager.filterOlderPeople(30);

        assertEquals(5, result.size());

        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White", 50, 7, "Chemists"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedList.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        assertEquals(result, expectedList);
    }

}


