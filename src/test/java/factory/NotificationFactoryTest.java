package factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factory.good.EmailNotification;
import factory.good.Notification;
import factory.good.NotificationFactory;
import factory.good.PushNotification;
import factory.good.SMSNotification;

public class NotificationFactoryTest {

    // Test 1: Verify Email notification object is created
    @Test
    void testCreateEmailNotification() {

        Notification notification =
                NotificationFactory.createNotification("EMAIL");

        assertTrue(notification instanceof EmailNotification);
    }

    // Test 2: Verify SMS notification object is created
    @Test
    void testCreateSMSNotification() {

        Notification notification =
                NotificationFactory.createNotification("SMS");

        assertTrue(notification instanceof SMSNotification);
    }

    // Test 3: Verify Push notification object is created
    @Test
    void testCreatePushNotification() {

        Notification notification =
                NotificationFactory.createNotification("PUSH");

        assertTrue(notification instanceof PushNotification);
    }

    // Test 4: Verify notification object is not null
    @Test
    void testNotificationNotNull() {

        Notification notification =
                NotificationFactory.createNotification("EMAIL");

        assertNotNull(notification);
    }

    // Test 5: Verify invalid notification type throws an exception
    @Test
    void testInvalidNotificationType() {

        assertThrows(IllegalArgumentException.class, () -> {
            NotificationFactory.createNotification("WHATSAPP");
        });

    }

}