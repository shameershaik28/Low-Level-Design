package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.Final;

public class FinalExample {
    public static void main(String[] args) {

        // 1️⃣ FINAL variable
        final int a = 10;

        Runnable r1 = () -> System.out.println("Final a = " + a);
        r1.run();   // prints 10



        // 2️⃣ EFFECTIVE FINAL variable
        int b = 20;   // not final, but we never change it

        Runnable r2 = () -> System.out.println("Effective Final b = " + b);
        r2.run();   // prints 20

        // If you try to modify b later → ERROR
        // b = 30;   // ❌ Uncommenting breaks effective final rule



        // 3️⃣ NOT EFFECTIVE FINAL (This will cause compile-time error)

        int c = 30;

        // Runnable r3 = () -> System.out.println("c = " + c);
        // ERROR because c is modified later

        c = 40;    // ❌ This change makes 'c' NOT effectively final

        // r3.run();  // This code won't compile because of modification to c
    }
}

