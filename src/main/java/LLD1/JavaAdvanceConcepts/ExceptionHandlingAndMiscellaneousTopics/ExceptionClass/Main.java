package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.ExceptionClass;

import static LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.ExceptionClass.Test.checkAge;

public class Main {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
