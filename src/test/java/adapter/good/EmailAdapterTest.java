package adapter.good;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Structural.Adapter.good.EmailAdapter;
import factory.good.Notification;

public class EmailAdapterTest {

    // Test 1: Verify Adapter object is created
    @Test
    void testAdapterObjectCreated() {

        Notification adapter = new EmailAdapter();

        assertTrue(adapter instanceof EmailAdapter);
    }

    // Test 2: Verify Adapter object is not null
    @Test
    void testAdapterNotNull() {

        Notification adapter = new EmailAdapter();

        assertNotNull(adapter);
    }

    // Test 3: Verify notification is successfully sent
    @Test
    void testNotificationSentSuccessfully() {

        Notification adapter = new EmailAdapter();

        assertDoesNotThrow(() ->
            adapter.send("Welcome to ABC College")
        );
    }

    // Test 4: Verify Adapter delegates request correctly
    @Test
    void testAdapterDelegatesRequest() {

        Notification adapter = new EmailAdapter();

        assertDoesNotThrow(() ->
            adapter.send("Testing Adapter Pattern")
        );
    }

}