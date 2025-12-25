package LLD1.OOPS.Interface;

interface Vehicle {

    // 1. Constant (always public static final)
    int MAX_LIMIT = 200;

    // 2. Abstract method (implicitly public abstract)
    void start();

    // 3. Default method (Java 8+)
    default void speed() {
        System.out.println("Car is going in 200 mph speed");
    }

    // 4. Static method (Java 8+)
    static void cost() {
        System.out.println("The car prize is : 10 lakh rupees");
    }
}
