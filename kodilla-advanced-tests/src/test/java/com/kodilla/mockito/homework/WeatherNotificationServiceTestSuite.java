package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherNotificationServiceTestSuite {
    private WeatherNotificationService weatherNotificationService = Mockito.mock(WeatherNotificationService.class);
    String email = "kamila@bootcamp.com";
    String location = "Zabrze";

    @Test
    public void shouldSubscribeUserToGivenLocation() {//SUBSKRYBCJA PODANEJ LOKALIZACJI
        weatherNotificationService.subscribe(email, location);
        Mockito.verify(weatherNotificationService).subscribe(email, location);
    }

    @Test
    public void shouldUnsubscribeUserFromAllLocations() {//POWINNO USUNĄĆ SUBSKRYPCJE Z WSZYSTKICH LOKALIZACJI
        weatherNotificationService.unsubscribe(email);
        Mockito.verify(weatherNotificationService).unsubscribe(email);
    }

    @Test
    public void shouldUnsubscribeUserFromSpecificLocation() {// POWINNO USUNĄĆ SUBSKRYPCJE PODANEJ LOKALIZACJI
        weatherNotificationService.unsubscribe(email, location);
        Mockito.verify(weatherNotificationService).unsubscribe(email, location);
    }

    @Test
    public void shouldSendMessageToAllSubscribers() {//POWINNO WYSLAC WIADOMOSC DO WSZYSTKICH SUBSKRYBENTOW
        String message = "Attention: changes in the regulations!";
        weatherNotificationService.sendAll(message);
        Mockito.verify(weatherNotificationService).sendAll(message);
    }
    @Test
    public void shouldSendMessageToSubscribersFromSpecificLocation() {
        String message = "hail threat!";
        weatherNotificationService.sendSubscribersLocation(location, message);
        Mockito.verify(weatherNotificationService).sendSubscribersLocation(location, message);
    }













}