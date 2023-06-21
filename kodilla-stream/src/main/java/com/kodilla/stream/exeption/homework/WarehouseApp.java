package com.kodilla.stream.exeption.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("100"));
        warehouse.addOrder(new Order("101"));
        warehouse.addOrder(new Order("102"));
        warehouse.addOrder(new Order("103"));
        warehouse.addOrder(new Order("103"));

      //  warehouse.getOrder("100");


    }


}
