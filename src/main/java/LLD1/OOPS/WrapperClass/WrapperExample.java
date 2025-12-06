package LLD1.OOPS.WrapperClass;

import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;               // primitive
        Integer b = 20;           // wrapper class

        System.out.println(a);    // prints: 10
        System.out.println(b);    // prints: 20

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);   // auto-boxing (int → Integer)
        numbers.add(20);

        System.out.println(numbers);


        Integer x = 50;   // wrapper
        int y = x;        // unboxing (Integer → int)

        System.out.println(y);

    }
}

