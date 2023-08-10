package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellerTestSuite {
    @Test
    public void testSellerSalary() {
        Seller seller = new Seller();
        assertEquals(2000, seller.getSalary());
    }

    @Test
    public void testSellerResponsibilities() {
        Seller seller = new Seller();
        assertEquals("serving goods, customer service, cash register operation", seller.getResponsibilities());
    }

}