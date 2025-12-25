package LLD1.OOPS.AbstractClass;

class CreditCardPayment extends Payment {

    public CreditCardPayment(int balance) {
        super(balance); // constructor chaining
    }

    @Override
    void pay(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Paid " + amount + " using credit card");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

