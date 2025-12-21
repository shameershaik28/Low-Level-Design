package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.UncheckedException;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String value = "abc";

        int num = Integer.parseInt(value); // NumberFormatException
    }
}


