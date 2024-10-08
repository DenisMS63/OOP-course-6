package first;

public class MobileNotification implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
