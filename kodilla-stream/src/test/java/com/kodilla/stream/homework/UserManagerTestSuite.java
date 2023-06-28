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
    }

    @Test
    public void shouldShowOlderPeopleThanAgeGiven() {

        List<String> result = UserManager.filterOlderPeople(45);

        assertEquals(3, result.size());

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gus Firing");
        expectedList.add("Mike Ehrmantraut");


        assertEquals(expectedList, result);
    }

    @Test
    public void shouldShowPeopleWhoDontHavePosts() {

        List<String> result = UserManager.filterPeopleWhoDontHavePosts(UsersRepository.getUsersList());

        assertEquals(2, result.size());

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Gus Firing");
        expectedList.add("Mike Ehrmantraut");

        assertEquals(expectedList, result);
    }

}


