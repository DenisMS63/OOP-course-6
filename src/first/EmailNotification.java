package first;

public class EmailNotification implements NotificationService{

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
