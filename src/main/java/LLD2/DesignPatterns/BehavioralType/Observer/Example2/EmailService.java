package LLD2.DesignPatterns.BehavioralType.Observer.Example2;

class EmailService implements OrderObserver {
    public void update(String status) {
        System.out.println("Email sent: Order is " + status);
    }
}

