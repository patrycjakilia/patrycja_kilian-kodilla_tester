package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import com.kodilla.notification.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {

    NotificationService notificationService = new NotificationService();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {
        addSubscribers(client, client, client);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {
        addSubscribers(client, client, client);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        addSubscribers(client, client, client);

        notificationService.sendNotification(notification);

        Mockito.verify(client).receive(notification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        NotificationService notificationService = new NotificationService();
        Client client = Mockito.mock(Client.class);
        notificationService.addSubscriber(client);
        Notification notification = Mockito.mock(Notification.class);
        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    private void addSubscribers(Client... clients) {
        for(Client currentClient : clients) {
            notificationService.addSubscriber(currentClient);
        }
    }
}
