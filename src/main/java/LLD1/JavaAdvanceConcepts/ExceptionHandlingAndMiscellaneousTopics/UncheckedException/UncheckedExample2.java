package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.UncheckedException;

public class UncheckedExample2 {
    public static void main(String[] args) {

        String s = null;
        System.out.println(s.length()); // NPE
    }
}

