package LLD1.JavaAdvanceConcepts.Generics.GenericMethods;

public class Main {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.<String>printValue("Hello");
        d.<Integer>printValue(100);
        d.<Double>printValue(3.14);

        // Java auto-detects type (type inference)
        d.printValue("World");
        d.printValue(999);
        d.printValue(2.16);

        Integer[] nums = {10, 20, 30};
        String[] words = {"Hi", "Hello"};

        System.out.println(Demo.getFirst(nums));   // 10
        System.out.println(Demo.getFirst(words));  // Hi

    }
}

