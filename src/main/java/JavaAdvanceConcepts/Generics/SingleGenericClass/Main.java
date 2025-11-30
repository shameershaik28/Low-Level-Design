package JavaAdvanceConcepts.Generics.SingleGenericClass;

public class Main {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>(10);
        Box<String> strBox = new Box<>("Hello");
        Box<Double> doubleBox = new Box<>(3.14);

        System.out.println(intBox.getValue());   // prints 10
        System.out.println(strBox.getValue());   // prints Hello
        System.out.println(doubleBox.getValue()); // prints 3.14
    }
}

