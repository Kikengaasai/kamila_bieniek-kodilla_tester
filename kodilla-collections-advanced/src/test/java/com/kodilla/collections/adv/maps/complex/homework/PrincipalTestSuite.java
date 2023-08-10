package com.kodilla.collections.adv.maps.complex.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTestSuite {
    @Test
    public void testGetSchoolName() {
        // given
        String schoolName = "Example School";
        String principalName = "John";
        String principalLastName = "Doe";
        Principal principal = new Principal(schoolName, principalName, principalLastName);

        // when
        String actualSchoolName = principal.getSchoolName();

        // then
        assertEquals(schoolName, actualSchoolName);
    }

    @Test
    public void testGetPrincipalName() {
        // given
        String schoolName = "Example School";
        String principalName = "John";
        String principalLastName = "Doe";
        Principal principal = new Principal(schoolName, principalName, principalLastName);

        // when
        String actualPrincipalName = principal.getPrincipalName();

        // then
        assertEquals(principalName, actualPrincipalName);
    }

    @Test
    public void testGetPrincipalLastName() {
        // given
        String schoolName = "Example School";
        String principalName = "John";
        String principalLastName = "Doe";
        Principal principal = new Principal(schoolName, principalName, principalLastName);

        // when
        String actualPrincipalLastName = principal.getPrincipalLastName();

        // then
        assertEquals(principalLastName, actualPrincipalLastName);
    }

}