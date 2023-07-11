package com.kodilla.spring.basic.spring_dependecy_injection.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShippingCenterTest {

    @Test
    void shouldReturnSuccessMessage() {
        DeliveryService deliveryService = new DeliveryService();
        NotificationService notificationService = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        String address = "ul. Krasinskiego 26, Zabrze";
        double weight = 15.0;

        String result = shippingCenter.sendPackage(address, weight);

        assertEquals("Package delivered to: " + address, result);
    }

    @Test
    void shouldReturnFailMessage() {
        DeliveryService deliveryService = new DeliveryService();
        NotificationService notificationService = new NotificationService() {
            public String fail(String address) {
                return "Package not delivered to: " + address;
            }
        };
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        String address = "ul. Krasinskiego 26, Zabrze";
        double weight = 40.0;

        String result = shippingCenter.sendPackage(address, weight);

        assertEquals("Package not delivered to: " + address, result);
    }

}