package com.kodilla.stream.exeption.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {


    public List<String> getListOfOrders() {
        List<String> orders = new ArrayList<>();

        orders.add(1, "2");
        orders.add(2, "3");
        orders.add(3, "4");
        orders.add(4, "5");

        return orders;
    }

    public List<Order> addOrder(Order order) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("1"));
        return orders;
    }


    public Order getOrder(String number) {
        List<String> orders = getListOfOrders()
                .stream()
                .filter(order -> order.equals(number))
                .collect(Collectors.toList());


        return (Order) orders;

    }

  //  public boolean isOrderInWarehouse(String number) throws OrderDoesntExistExeption {
    //    if (getOrder().containsKey(number))
      //      return getOrder().get(number);
        //throw new OrderDoesntExistExeption();
    }

