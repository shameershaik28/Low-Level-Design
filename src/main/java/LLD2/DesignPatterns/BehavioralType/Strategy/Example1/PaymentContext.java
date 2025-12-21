package LLD2.DesignPatterns.BehavioralType.Strategy.Example1;

class PaymentContext {

    private PaymentStrategy strategy;

    // set strategy at runtime
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void makePayment(int amount) {
        strategy.pay(amount);
    }
}
