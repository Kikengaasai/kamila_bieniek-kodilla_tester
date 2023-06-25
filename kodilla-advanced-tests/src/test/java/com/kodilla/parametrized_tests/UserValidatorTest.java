package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class UserValidatorTest { private UserValidator userValidator;

    @BeforeEach
    void beforeEach() {
        userValidator = new UserValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"aaa", "abcd", "aAa0", "_-.", "123"})
    void shouldReturnTrueForValidUsernames(String username) {
        // When
        boolean result = userValidator.validateUsername(username);

        // Then
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {"a", "aa", "aa|", "aaa|", "a@a"})
    void shouldReturnFalseForInvalidUsernames(String username) {
        // When
        boolean result = userValidator.validateUsername(username);

        // Then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldThrowExceptionWhenNullUsernameIsPassed() {
        // When & then
        Assertions.assertThrows(NullPointerException.class, () -> userValidator.validateUsername(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"_._@a.a.a", "-.A@a.0.z"})
    void shouldReturnTrueForValidEmail(String email) {
        // When
        boolean result = userValidator.validateEmail(email);

        // Then
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"__@a.a.a", "_._.a.a.a"})
    void shouldReturnFalseForInvalidEmail(String email) {
        // When
        boolean result = userValidator.validateEmail(email);

        // Then
        Assertions.assertFalse(result);
    }
}
