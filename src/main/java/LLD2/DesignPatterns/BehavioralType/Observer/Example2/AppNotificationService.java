package LLD2.DesignPatterns.BehavioralType.Observer.Example2;

class AppNotificationService implements OrderObserver {
    public void update(String status) {
        System.out.println("App notification: Order is " + status);
    }
}

