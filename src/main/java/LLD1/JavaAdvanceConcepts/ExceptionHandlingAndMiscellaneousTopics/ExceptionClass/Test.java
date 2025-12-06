package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.ExceptionClass;

public class Test {
    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above!");
        }
        System.out.println("Valid age");
    }
}
