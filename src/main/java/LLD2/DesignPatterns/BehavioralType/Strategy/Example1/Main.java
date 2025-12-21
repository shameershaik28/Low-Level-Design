package LLD2.DesignPatterns.BehavioralType.Strategy.Example1;

public class Main {
    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(100);

        context.setPaymentStrategy(new UPIPayment());
        context.makePayment(200);

        context.setPaymentStrategy(new CashPayment());
        context.makePayment(50);
    }
}

