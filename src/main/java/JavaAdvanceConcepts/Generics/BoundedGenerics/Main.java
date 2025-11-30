package JavaAdvanceConcepts.Generics.BoundedGenerics;

import java.util.ArrayList;
import java.util.List;

import static JavaAdvanceConcepts.Generics.BoundedGenerics.Box.addNumbers;

public class Main {
    public static void main(String[] args) {

        //Upper Bound
        Box<Integer> b1 = new Box<>(10);
        Box<Double> b2 = new Box<>(3.14);

       // Box<String> b3 = new Box<>("Hi"); // ❌ ERROR

        b1.show();  // 10.0
        b2.show();  // 3.14




        //Lower Bound
        List<Integer> l1 = new ArrayList<>();
        List<Number> l2 = new ArrayList<>();
        List<Object> l3 = new ArrayList<>();

        addNumbers(l1);  // OK
        addNumbers(l2);  // OK
        addNumbers(l3);  // OK

        // List<Double> l4 = new ArrayList<>();
        // addNumbers(l4);  // ❌ ERROR: Double is NOT a parent of Integer

    }
}
