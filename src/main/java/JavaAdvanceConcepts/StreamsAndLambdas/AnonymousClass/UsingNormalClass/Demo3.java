package JavaAdvanceConcepts.StreamsAndLambdas.AnonymousClass.UsingNormalClass;

class Printer {
    void print() {
        System.out.println("Normal print");
    }
}

public class Demo3 {
    public static void main(String[] args) {

        Printer p = new Printer() {
            @Override
            void print() {
                System.out.println("Custom Print");
            }
        };

        p.print();
    }
}

