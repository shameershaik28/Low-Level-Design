package LLD2.SolidDesignPrinciples.DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {

        Notification n1 = new Notification(new EmailService());
        n1.notifyUser("Hello via Email");

        Notification n2 = new Notification(new SMSService());
        n2.notifyUser("Hello via SMS");
    }
}

