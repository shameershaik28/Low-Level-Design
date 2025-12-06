package LLD1.OOPS.Static;

class Counter {
    static int count = 0;   // static variable

    static void increment() {   // static method
        count++;
        System.out.println("Count = " + count);
    }

}
