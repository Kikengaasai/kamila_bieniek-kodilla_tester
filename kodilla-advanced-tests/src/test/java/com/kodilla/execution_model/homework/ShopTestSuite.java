package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private Shop shop;

    @BeforeEach
    public void introductionOfTheObject() {
        shop = new Shop();
    }

    @Test
    public void addOrderAndCheckNumbersOfOrders() {
        //Given
        Order order1 = new Order(100, LocalDate.of(2023, 7, 1), "Kamila");
        Order order2 = new Order(200, LocalDate.of(2023, 7, 2), "Kamil");

        //When
        shop.addOrder(order1);
        shop.addOrder(order2);

        // Then
        int expected = 2;
        int actual = shop.getNumberOfOrders();
        assertEquals(expected, actual, "Number of orders should be 2");
    }

    @Test
    public void getOrdersFromTheRangeOfDates() {
        // Given
        Order order1 = new Order(100, LocalDate.of(2023, 6, 30), "Kamila");
        Order order2 = new Order(200, LocalDate.of(2023, 7, 1), "Jola");
        Order order3 = new Order(300, LocalDate.of(2023, 7, 2), "Gerta");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);

        // When
        List<Order> orders = shop.getOrders(LocalDate.of(2023, 6, 30), LocalDate.of(2023, 7, 1));

        // Then
        List<Order> expected = Arrays.asList(order1, order2);
        assertEquals(expected, orders, "Orders for range of dates should be order1 and order2");
    }

    @Test
    public void getOrdersWhenIsEmptyRangeOfDates() {
        // Given
        Order order1 = new Order(100, LocalDate.of(2023, 6, 30), "Kamila");

        shop.addOrder(order1);

        // When
        List<Order> orders = shop.getOrders(LocalDate.of(2023, 7, 1), LocalDate.of(2023, 7, 2));

        // Then
        List<Order> expected = Arrays.asList();
        assertEquals(expected, orders, "There are no orders in the date range given ");
    }

    @Test
    void getTotalOrderValue() {
        // Given
        Order order1 = new Order(100, LocalDate.of(2023, 6, 30), "Kamila");
        Order order2 = new Order(200, LocalDate.of(2023, 7, 1), "Jola");
        Order order3 = new Order(300, LocalDate.of(2023, 7, 2), "Gerta");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);

        // When
        double totalValue = shop.getTotalOrderValue();

        // Then
        int expected = 600;
        assertEquals(expected, totalValue, "Total order value should be 600");
    }
}







