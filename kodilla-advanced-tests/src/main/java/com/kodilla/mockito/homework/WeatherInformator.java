package com.kodilla.mockito.homework;

public class WeatherInformator {

    private WeatherNotificationService notificationService;

    public WeatherInformator(WeatherNotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendInformationMessageToAllSubscribers() {
        notificationService.sendAll("Zmiana w regulaminie!");
    }

    public static void main(String[] args) {
        WeatherNotificationService notificationService = new WeatherNotificationApp();
        WeatherInformator weatherInformator = new WeatherInformator(notificationService);
        weatherInformator.sendInformationMessageToAllSubscribers();
    }

}