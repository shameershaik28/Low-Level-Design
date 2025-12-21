package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.UncheckedException;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        setAge(-5);
    }

    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

