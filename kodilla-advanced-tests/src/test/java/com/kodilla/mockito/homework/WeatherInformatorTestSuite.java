package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class WeatherInformatorTestSuite {

    @Mock
    private WeatherNotificationService notificationService;

    private WeatherInformator weatherInformator;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        weatherInformator = new WeatherInformator(notificationService);
    }

    @Test
    public void shouldSendInformationMessageToAllSubscribers() {
        weatherInformator.sendInformationMessageToAllSubscribers();
        verify(notificationService, times(1)).sendAll("Zmiana w regulaminie!");
    }
}