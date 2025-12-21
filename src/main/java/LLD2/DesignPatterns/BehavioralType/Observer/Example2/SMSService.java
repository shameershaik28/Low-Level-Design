package LLD2.DesignPatterns.BehavioralType.Observer.Example2;

class SMSService implements OrderObserver {
    public void update(String status) {
        System.out.println("SMS sent: Order is " + status);
    }
}

