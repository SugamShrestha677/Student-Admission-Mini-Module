package factory.good;

import Structural.Adapter.good.EmailAdapter;

public class EmailNotification implements Notification {

    private EmailAdapter adapter = new EmailAdapter();

    @Override
    public void send(String message) {

        adapter.send(message);

    }

}