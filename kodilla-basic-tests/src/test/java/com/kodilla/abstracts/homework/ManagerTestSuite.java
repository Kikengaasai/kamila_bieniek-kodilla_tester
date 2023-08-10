package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTestSuite {
    @Test
    public void testManagerSalary() {
        Manager manager = new Manager();
        assertEquals(5000, manager.getSalary());
    }

    @Test
    public void testManagerResponsibilities() {
        Manager manager = new Manager();
        assertEquals("planning, organization, distribution of tasks", manager.getResponsibilities());
    }

}