package LLD1.OOPS.AbstractClass;

public class Main {
    public static void main(String[] args) {

        Payment payment = new CreditCardPayment(10000 );

        payment.showBalance(); // concrete method
        payment.pay(3000);     // overridden method
        payment.showBalance();

    }
}
