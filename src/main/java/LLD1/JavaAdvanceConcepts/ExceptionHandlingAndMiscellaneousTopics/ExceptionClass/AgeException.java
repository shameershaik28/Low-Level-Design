package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.ExceptionClass;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message); // pass message to parent Exception class
    }
}

