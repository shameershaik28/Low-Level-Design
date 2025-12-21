package LLD2.DesignPatterns.BehavioralType.Observer.Example2;

public class Main {
    public static void main(String[] args) {

        AmazonOrder order = new AmazonOrder();

        order.addObserver(new EmailService());
        order.addObserver(new SMSService());
        order.addObserver(new AppNotificationService());

        order.setOrderStatus("PLACED");
        order.setOrderStatus("SHIPPED");
        order.setOrderStatus("DELIVERED");
    }
}

