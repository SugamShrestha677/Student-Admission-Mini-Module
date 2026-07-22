package Structural.Adapter.bad;

public class LegacyEmailService {

    public void sendEmail(String message) {
        System.out.println("Legacy Email: " + message);
    }
}