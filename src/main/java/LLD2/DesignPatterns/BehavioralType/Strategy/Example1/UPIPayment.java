package LLD2.DesignPatterns.BehavioralType.Strategy.Example1;

class UPIPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

