package Structural.Adapter.bad;

import factory.good.Notification;

public class AdapterBadDemo {

    public static void main(String[] args) {

        Notification notification = new NotificationService();

        notification.send("Welcome to ABC College");

    }

}