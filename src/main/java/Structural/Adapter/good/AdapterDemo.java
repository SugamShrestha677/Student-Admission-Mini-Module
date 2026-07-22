package Structural.Adapter.good;

import factory.good.Notification;

public class AdapterDemo {

    public static void main(String[] args) {

        Notification notification = new EmailAdapter();

        notification.send("Welcome to PCPS College");

    }

}