package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.RuntimeExceptionClass;

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}

