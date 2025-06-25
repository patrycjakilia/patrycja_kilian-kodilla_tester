package com.kodilla.notification.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertTestSuite {

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        WeatherAlert weatherAlert = new WeatherAlert();
        Person person = Mockito.mock(Person.class);
        Alert alert = Mockito.mock(Alert.class);

        weatherAlert.sendNotification(alert);
    }

    @Test
    public void subscribedClientShouldReceiveNotificationFromHisLocation() {

    }

    @Test
    public void unsubscribedLocationShouldNotReceiveNotificationToClientFromThisLocation() {

    }

    @Test
    public void unsubscribedAllLocationShouldNotReceiveNotificationToClient() {

    }


    @Test
    public void subscribedLocationClientShouldReceiveNotificationToAllClientFromGroupOfSubscriber() {

    }

    @Test
    public void subscribedClientShouldReceiveNotificationToAllSubscriber() {

    }

    @Test
    public void subscribedClientCouldRemoveLocation() {

    }
}