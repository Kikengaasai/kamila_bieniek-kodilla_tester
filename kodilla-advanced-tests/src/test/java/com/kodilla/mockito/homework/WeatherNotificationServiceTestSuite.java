package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;

class WeatherNotificationServiceTestSuite {
    private WeatherNotificationService weatherNotificationService = Mockito.mock(WeatherNotificationService.class);
    String email = "kamila@bootcamp.com";
    String location = "Zabrze";

    @Test
    public void shouldSubscribeUserToGivenLocation() {//SUBSKRYBCJA PODANEJ LOKALIZACJI
        String message = "You subscribe to this location: " + location;
        weatherNotificationService.subscribe(email, location);
        weatherNotificationService.sendSubscribersLocation(location,message);
        Mockito.verify(weatherNotificationService).subscribe(email, location);
       Mockito.verify(weatherNotificationService).sendSubscribersLocation(location,message);


    }

    @Test
    public void shouldUnsubscribeUserFromAllLocations() {

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        String expectedMessage = "Your subscription has been deactivated from all locations";


        weatherNotificationService.unsubscribe(email);
        weatherNotificationService.sendAll(expectedMessage);


        Mockito.verify(weatherNotificationService).unsubscribe(email);
        Mockito.verify(weatherNotificationService).sendAll(messageCaptor.capture());
        assertEquals(expectedMessage, messageCaptor.getValue());
    }


    @Test
    public void shouldUnsubscribeUserFromSpecificLocation() {
        // given
        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        String expectedMessage = "Your subscription has been disabled at the location:" + location;

        // when
        weatherNotificationService.unsubscribe(email, location);
        weatherNotificationService.sendSubscribersLocation(expectedMessage, location);

        // then
        Mockito.verify(weatherNotificationService).unsubscribe(email, location);
        Mockito.verify(weatherNotificationService).sendSubscribersLocation(messageCaptor.capture(), eq(location));
        assertEquals(expectedMessage, messageCaptor.getValue());
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