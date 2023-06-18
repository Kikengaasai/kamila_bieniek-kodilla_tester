package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ForumStatsTest {

    private ForumStats forumStats = new ForumStats();


    private List<User> provideTestUsers(){
    List<User> users = new ArrayList<>();
        users.add(new User("test2", 25, 2, "Chemists"));
        users.add(new User("test3", 34, 3, "Sales"));
        users.add(new User("test5", 38, 4, "Manager"));
        users.add(new User("test4", 49, 5, "Board"));
        users.add(new User("test1", 50, 6, "Chemists"));
        users.add(new User("test6", 57, 7, "Security"));
        return users;
}

    @Test
    void shouldCorrectlyCalculateAverageForUsersUnder40() {
        // Given
        List<User> testUserList = provideTestUsers();
        // When
        double result = forumStats.averageNumberOfPostUnder40(testUserList);
        // Then
        Assertions.assertEquals(3.0, result, 0.001);
    }

    @Test
    void shouldReturnDefaultValueIfUsersListIsEmptyMethodUnder40() {
        // Given
        List<User> testUserList = new ArrayList<>();
        // When
        double result = forumStats.averageNumberOfPostUnder40(testUserList);
        // Then
        Assertions.assertEquals(0.0, result, 0.001);
    }

    @Test
    void shouldReturnDefaultValueIfNoUsersMeetRequirementsMethodUnder40() {
        // Given
        List<User> testUserList = new ArrayList<>();
        testUserList.add(new User("test12", 50, 5, "Sales"));
        testUserList.add(new User("test2", 60, 2, "Sales"));
        // When
        double result = forumStats.averageNumberOfPostUnder40(testUserList);
        // Then
        Assertions.assertEquals(0.0, result, 0.001);
    }

    @Test
    void shouldNotConsiderUsersWithAge40MethodUnder40() {
        // Given
        List<User> testUserList = new ArrayList<>();
        testUserList.add(new User("test12", 30, 5, "Sales"));
        testUserList.add(new User("test2", 40, 2, "Sales"));
        // When
        double result = forumStats.averageNumberOfPostUnder40(testUserList);
        // Then
        Assertions.assertEquals(5.0, result, 0.001);
    }

    @Test
    void shouldCorrectlyCalculateAverageForUsersAbove40() {
        // Given
        List<User> testUserList = provideTestUsers();
        // When
        double result = forumStats.averageNumberOfPostAbove40(testUserList);
        // Then
        Assertions.assertEquals(6.0, result, 0.001);
    }

    @Test
    void shouldReturnDefaultValueIfUsersListIsEmptyMethodAbove40() {
        // Given
        List<User> testUserList = new ArrayList<>();
        // When
        double result = forumStats.averageNumberOfPostAbove40(testUserList);
        // Then
        Assertions.assertEquals(0.0, result, 0.001);
    }

    @Test
    void shouldReturnDefaultValueIfNoUsersMeetRequirementsMethodAbove40() {
        // Given
        List<User> testUserList = new ArrayList<>();
        testUserList.add(new User("test12", 20, 5, "Sales"));
        testUserList.add(new User("test2", 30, 2, "Sales"));
        // When
        double result = forumStats.averageNumberOfPostAbove40(testUserList);
        // Then
        Assertions.assertEquals(0.0, result, 0.001);
    }

    @Test
    void shouldConsiderUsersWithAge40MethodAbove40() {
        // Given
        List<User> testUserList = new ArrayList<>();
        testUserList.add(new User("test12", 50, 5, "Sales"));
        testUserList.add(new User("test2", 40, 2, "Sales"));
        // When
        double result = forumStats.averageNumberOfPostAbove40(testUserList);
        // Then
        Assertions.assertEquals(3.5, result, 0.001);
    }}