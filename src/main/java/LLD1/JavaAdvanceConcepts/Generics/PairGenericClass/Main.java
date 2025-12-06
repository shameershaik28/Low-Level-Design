package LLD1.JavaAdvanceConcepts.Generics.PairGenericClass;

public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> p1 = new Pair<>("Age", 25);
        Pair<Integer, Boolean> p2 = new Pair<>(10, true);
        Pair<String, String> p3 = new Pair<>("Username", "John123");

        System.out.println(p1.getFirst() + " : " + p1.getSecond());
        System.out.println(p2.getFirst() + " : " + p2.getSecond());
        System.out.println(p3.getFirst() + " : " + p3.getSecond());
    }
}

