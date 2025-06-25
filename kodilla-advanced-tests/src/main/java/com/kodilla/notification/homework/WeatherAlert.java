package com.kodilla.notification.homework;

import com.kodilla.notification.Client;

import java.util.*;

public class WeatherAlert {

    private Map<String, Set<Person>> locationSubscribers = new HashMap<>();


    public void addSubscriber(Person person, String location) {
        locationSubscribers.computeIfAbsent(location, k -> new HashSet<>()).add(person);
    }

    public void sendNotification(Alert alert, String location) {
        Set<Person> subscribers = locationSubscribers.get(location);
        if (subscribers != null) {
            for (Person person : subscribers) {
                person.receive(alert);
            }
        }
    }

    public void sendNotificationToAll(Alert alert) {
        locationSubscribers.values().stream()
                .flatMap(Set::stream)
                .distinct()
                .forEach(p -> p.receive(alert));
    }

    public void removeSubscription(Person person, String location){
        Set<Person> subscribers = locationSubscribers.get(location);
        if (subscribers != null) {
            subscribers.remove(person);
            if (subscribers.isEmpty()) {
                locationSubscribers.remove(location);
            }
        }
    }

    public void removeAllSubscription(Person person){
        for (Set<Person> subscribers : locationSubscribers.values()) {
            subscribers.remove(person);
        }
        locationSubscribers.values().removeIf(Set::isEmpty);
    }

    public void rermoveLocation(String location){
        locationSubscribers.remove(location);
    }
}
