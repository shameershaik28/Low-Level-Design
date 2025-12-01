package JavaAdvanceConcepts.CollectionFramework.ListInterface;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // duplicate allowed
        list.add(1, "Orange"); // insert at index

        System.out.println("ArrayList: " + list);

        list.remove("Banana");
        System.out.println("After remove: " + list);

        System.out.println("Element at index 1: " + list.get(1));
    }
}


