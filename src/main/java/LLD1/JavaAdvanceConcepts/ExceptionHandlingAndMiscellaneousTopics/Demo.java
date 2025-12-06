package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics;

import java.io.IOException;

public class Demo {

    public static void riskyMethod() throws IOException {  // only checked exception declared

        if (true) {
            throw new IOException("File problem");  // checked exception
        }

        if (true) {
            throw new ArithmeticException("Divide by zero"); // unchecked exception
        }
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        }
        catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}

