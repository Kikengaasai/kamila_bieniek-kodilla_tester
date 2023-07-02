package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) { //dodawanie nowego zamówienia
        orders.add(order);
    }

    public List<Order> getOrders(LocalDate startDate, LocalDate endDate) {//zwracanie listy zamówień z zakresu dwóch dat
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            LocalDate orderDate = order.getDate();
            if (!orderDate.isBefore(startDate) && !orderDate.isAfter(endDate)) {//operator ! mówi że nie wcześniej i nie później niż podana data
                result.add(order);
            }
        }
        return result;
    }

    public List<Order> getOrdersInRange(double minValue, double maxValue) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            double orderValue = order.getValue();
            if (orderValue >= minValue && orderValue <= maxValue) {
                result.add(order);
            }
        }
        return result;
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double getTotalOrderValue() {
        double totalValue = 0;
        for (Order order : orders) {
            totalValue += order.getValue();
        }
        return totalValue;
    }

}
