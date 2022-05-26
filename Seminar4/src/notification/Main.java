package notification;

public class Main {
    public static void main(String[] args){
        String type = "sms";
        try {
            Notification notification = NotificationFactory.createNotification(type);
            notification.notifyUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
