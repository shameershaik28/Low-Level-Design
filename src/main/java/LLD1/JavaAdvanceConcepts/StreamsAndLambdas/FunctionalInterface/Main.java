package LLD1.JavaAdvanceConcepts.StreamsAndLambdas.FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        // Use it WITHOUT lambda (Anonymous Class)
        MyFunction obj = new MyFunction() {
            @Override
            public void show() {
                System.out.println("Hello World");
            }
        };
        obj.show();
    }
}
