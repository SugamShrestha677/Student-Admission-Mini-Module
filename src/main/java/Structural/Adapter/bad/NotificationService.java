package Structural.Adapter.bad;
import factory.good.Notification;

public class NotificationService implements Notification {

    @Override
    public void send(String message) {

        // Client is forced to directly use the legacy service
        LegacyEmailService emailService = new LegacyEmailService();

        emailService.sendEmail(message);
    }
}