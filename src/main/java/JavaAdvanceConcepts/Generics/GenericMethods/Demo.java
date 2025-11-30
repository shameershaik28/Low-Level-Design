package JavaAdvanceConcepts.Generics.GenericMethods;

class Demo {

    // Generic Method
    public <T> void printValue(T value) {
        System.out.println("Value: " + value);
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }

}

