package com.kodilla.stream.exeption.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarehouseTest {

    private Warehouse warehouse;

    @BeforeEach
    void beforeEach() {
        warehouse = new Warehouse();
    }

    @Test
    void shouldAddOrder() {
        // Given
        Order orderToAdd = new Order("123");

        // When & then
        warehouse.addOrder(orderToAdd);

    }

    @Test
    void shouldThrownExceptionWhenGettingNonExistentOrderWhenNoOrderArePresent() {
        // When & then
        Assertions.assertThrows(OrderDoesntExistException.class,
                () -> warehouse.getOrder("100"));
    }

    @Test
    void shouldThrownExceptionWhenGettingNonExistentOrderWhenNoOrdersArePresent() {
        // Given
        Order orderToAdd = new Order("123");
        warehouse.addOrder(orderToAdd);

        // When & then
        Assertions.assertThrows(OrderDoesntExistException.class,
                () -> warehouse.getOrder("100"));
    }

    @Test
    void shouldCorrectlyReturnOrderIfOrderExist() throws Exception {
        // Given
        Order orderToAdd = new Order("123");
        warehouse.addOrder(orderToAdd);

        // When
        Order order = warehouse.getOrder(orderToAdd.getNumber());

        // Then
        Assertions.assertEquals(orderToAdd.getNumber(), order.getNumber());
    }


}