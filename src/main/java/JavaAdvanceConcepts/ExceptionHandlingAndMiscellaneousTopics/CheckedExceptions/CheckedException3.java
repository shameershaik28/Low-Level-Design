package JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.CheckedExceptions;

public class CheckedException3 {
    public static void main(String[] args) {
        //Using Try-Catch

        try {
            Thread.sleep(1000);  // checked exception
        }
        catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}

