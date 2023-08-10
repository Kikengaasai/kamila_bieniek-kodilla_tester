package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NurseTestSuite {
    @Test
    public void testNurseSalary() {
        Nurse nurse = new Nurse();
        assertEquals(3000, nurse.getSalary());
    }

    @Test
    public void testNurseResponsibilities() {
        Nurse nurse = new Nurse();
        assertEquals("giving medicines, helping people, admitting to wards in the hospital", nurse.getResponsibilities());
    }

}