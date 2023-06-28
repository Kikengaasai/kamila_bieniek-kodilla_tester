package com.kodilla.stream.exeption.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("100"));
        warehouse.addOrder(new Order("101"));
        warehouse.addOrder(new Order("102"));
        warehouse.addOrder(new Order("103"));
        warehouse.addOrder(new Order("103"));


        String orderNumber = "1";
        try {
            Order order = warehouse.getOrder(orderNumber);
            System.out.println(order);
        } catch (OrderDoesntExistException e) {
            System.err.println("Order with number " + orderNumber + " does not exist!");
        }

    }

}