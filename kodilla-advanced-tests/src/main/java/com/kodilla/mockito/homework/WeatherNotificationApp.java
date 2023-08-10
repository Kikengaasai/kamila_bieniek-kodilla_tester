package com.kodilla.mockito.homework;
import java.util.*;
public class WeatherNotificationApp implements WeatherNotificationService{

    private Map<String, Set<String>> subscribersOfTheLocation = new HashMap<>();
    @Override
    public void subscribe(String email, String location) {//Osoba zainteresowana może zostać zapisana do danej lokalizacji i zacznie otrzymywać powiadomienia.
        // pobranie zbioru subskrybentów dla danej lokalizacji
        Set<String> subscribers = subscribersOfTheLocation.getOrDefault(location, new HashSet<>());

        // dodanie adresu email do zbioru subskrybentów
        subscribers.add(email);

        // zapisanie subskrybentów dla danej lokalizacji do kolekcji
        subscribersOfTheLocation.put(location, subscribers);
    }

    @Override
    public void unsubscribe(String email) {//Można wycofać subskrypcję z danej lokalizacji
        //przeszukowanie wszystkich lokalizacji po kątem maila
        for (String location : subscribersOfTheLocation.keySet()) {
            Set<String> subscribers = subscribersOfTheLocation.get(location);

            // usunięcie adresu email z zbioru subskrybentów
            subscribers.remove(email);

            // aktualizacja kolekcji
            subscribersOfTheLocation.put(location, subscribers);
        }}

        @Override
        public void unsubscribe(String email, String location) {//Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
            // pobranie kolekcji subskrybentów dla danej lokalizacji
            Set<String> subscribers = subscribersOfTheLocation.getOrDefault(location, new HashSet<>());

            // usunięcie adresu email z kolekcji subskrybentów
            subscribers.remove(email);

            // zapisanie kolekcji subskrybentów dla danej lokalizacji
            subscribersOfTheLocation.put(location, subscribers);
        }

    @Override
    public void sendAll(String message) {
        for (Set<String> subscribers : subscribersOfTheLocation.values()) {
            for (String subscriber : subscribers) {
                sendNotification(subscriber,message);
            }
            System.out.println("Wiadomość została wysłana do wszystkich subskrybentów: " + message);
    }}

    @Override
    public void sendSubscribersLocation(String location, String message) {//Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
        Set<String> subscribers = subscribersOfTheLocation.getOrDefault(location, new HashSet<>());
        for (String subscriber : subscribers) {
            sendNotification(subscriber, message);

        }
    }


    @Override
    public void removeLocation(String location) {
        subscribersOfTheLocation.remove(location);
    }

    public void sendNotification(String email, String message) {//Możliwość wysyłki powiadomienia do wszystkich.

    }




}
