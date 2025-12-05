package JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.RuntimeExceptionClass;

public class Bank {
    public static void withdraw(int amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than 0");
        }
        System.out.println("Withdraw successful: " + amount);
    }

    public static void main(String[] args) {
        withdraw(-10); // throws exception at runtime
    }
}

