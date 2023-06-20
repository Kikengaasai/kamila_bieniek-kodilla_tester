package com.kodilla.stream.exeption.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {
        orders.add(order);

    }


    public Order getOrder(String number) {
        List<String> orders2 = orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .findAny()
                .orElseThrow(() -> new OrderDoesntExistExeption());


        return (Order) orders;

    }
}

