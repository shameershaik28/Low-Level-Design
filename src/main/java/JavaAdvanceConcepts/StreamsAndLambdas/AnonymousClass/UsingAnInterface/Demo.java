package JavaAdvanceConcepts.StreamsAndLambdas.AnonymousClass.UsingAnInterface;

interface Animal {
    void sound();
}

public class Demo {
    public static void main(String[] args) {

        Animal dog = new Animal() {   // anonymous class starts here
            @Override
            public void sound() {
                System.out.println("Dog barks");
            }
        };

        dog.sound();
    }
}
