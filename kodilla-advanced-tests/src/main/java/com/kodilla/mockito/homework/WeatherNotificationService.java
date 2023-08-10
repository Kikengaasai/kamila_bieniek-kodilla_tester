package com.kodilla.mockito.homework;

public interface WeatherNotificationService {

    void subscribe(String email, String location);//dodajemy email do subskrypcji danej lokalizacji
    void unsubscribe(String email);//usuwamy email ze wszystkich pozycji
    void unsubscribe(String email, String location); // usuwanie maila dla podanej lokalizacji
    void sendAll(String message);//wysyłanie maila do wszystkich
    void sendSubscribersLocation(String location, String message);//wysyłanie maila do subskrybentów danej lokalizacji

    void removeLocation (String location);


    void sendNotification(String eq, String eq1);
}
