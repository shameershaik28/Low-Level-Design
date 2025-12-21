package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.CheckedExceptions;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}

