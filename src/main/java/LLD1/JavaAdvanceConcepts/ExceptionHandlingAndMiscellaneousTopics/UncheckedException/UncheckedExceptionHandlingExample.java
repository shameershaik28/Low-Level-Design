package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.UncheckedException;

public class UncheckedExceptionHandlingExample {

    public static void main(String[] args) {
        handleArithmetic();
        handleNullPointer();
        handleArray();
        handleNumberFormat();
        handleIllegalArgument();
    }

    static void handleArithmetic() {
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
        }
    }

    static void handleNullPointer() {
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    static void handleArray() {
        try {
            int[] arr = {1, 2};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    static void handleNumberFormat() {
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }
    }

    static void handleIllegalArgument() {
        try {
            setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
    }
}

