package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.UncheckedException;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String name = null;

        System.out.println(name.length()); // NullPointerException
    }
}


