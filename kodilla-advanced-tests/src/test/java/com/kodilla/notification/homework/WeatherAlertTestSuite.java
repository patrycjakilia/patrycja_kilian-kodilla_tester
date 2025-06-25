package com.kodilla.notification.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertTestSuite {

    WeatherAlert weatherAlert = new WeatherAlert();
    Person person = Mockito.mock(Person.class);
    Person secondPerson = Mockito.mock(Person.class);
    Person thirdPerson = Mockito.mock(Person.class);
    Alert alert = Mockito.mock(Alert.class);


    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        weatherAlert.sendNotification(alert, "Warsaw");
        Mockito.verify(person, Mockito.never()).receive(alert);
    }

    @Test
    public void subscribedClientShouldReceiveNotificationFromHisLocation() {
        weatherAlert.addSubscriber(person, "Warsaw");
        weatherAlert.sendNotification(alert, "Warsaw");
        Mockito.verify(person).receive(alert);
    }

    @Test
    public void unsubscribedLocationShouldNotReceiveNotificationToClientFromThisLocation() {
        weatherAlert.addSubscriber(person, "Warsaw");
        weatherAlert.removeSubscription(person, "Warsaw");

        Mockito.verify(person, Mockito.never()).receive(alert);
    }

    @Test
    public void unsubscribedAllLocationShouldNotReceiveNotificationToClient() {
        weatherAlert.addSubscriber(person, "Warsaw");
        weatherAlert.addSubscriber(person, "Cracow");
        weatherAlert.addSubscriber(person, "Wroclaw");

        weatherAlert.removeAllSubscription(person);

        weatherAlert.sendNotification(alert, "Warsaw");
        weatherAlert.sendNotification(alert, "Cracow");
        weatherAlert.sendNotification(alert, "Wroclaw");

        Mockito.verify(person, Mockito.never()).receive(alert);
    }


    @Test
    public void subscribedLocationClientShouldReceiveNotificationToAllClientFromGroupOfSubscriber() {
        weatherAlert.addSubscriber(person, "Warsaw");
        weatherAlert.addSubscriber(secondPerson, "Cracow");
        weatherAlert.addSubscriber(thirdPerson, "Cracow");
        weatherAlert.sendNotification(alert, "Cracow");

        Mockito.verify(secondPerson).receive(alert);
        Mockito.verify(thirdPerson).receive(alert);
        Mockito.verify(person, Mockito.never()).receive(alert);

    }

    @Test
    public void subscribedClientShouldReceiveNotificationToAllSubscriber() {
        weatherAlert.addSubscriber(person, "Warsaw");
        weatherAlert.addSubscriber(secondPerson, "Cracow");
        weatherAlert.addSubscriber(thirdPerson, "Cracow");
        weatherAlert.sendNotificationToAll(alert);

        Mockito.verify(person).receive(alert);
        Mockito.verify(secondPerson).receive(alert);
        Mockito.verify(thirdPerson).receive(alert);

    }

    @Test
    public void subscribedClientCouldRemoveLocation() {
        weatherAlert.addSubscriber(person, "Warsaw");
        weatherAlert.rermoveLocation("Warsaw");
        weatherAlert.sendNotification(alert, "Warsaw");

        Mockito.verify(person, Mockito.never()).receive(alert);
    }
}