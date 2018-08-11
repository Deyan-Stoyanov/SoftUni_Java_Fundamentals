package p02_services;

public class EmailNotificationService implements NotificationService {

    private boolean isActive;

    public EmailNotificationService(boolean isActive) {
        this.isActive = isActive;
    }

    public void sendNotification() {
        System.out.println("Email notification");
    }

    public boolean isActive() {
        return this.isActive;
    }
}
