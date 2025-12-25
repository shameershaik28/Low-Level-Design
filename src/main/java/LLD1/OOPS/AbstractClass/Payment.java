package LLD1.OOPS.AbstractClass;

abstract class Payment {

    // 1. Instance variable (STATE)
    protected int balance;
    private int a;
    public int c;
    int d;


    // 2. Constructor (allowed in abstract class)
    public Payment(int balance) {
        this.balance = balance;
    }

    // 3. Abstract method (must be implemented by child)
    abstract void pay(int amount);

    // 4. Concrete method (shared implementation)
    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

