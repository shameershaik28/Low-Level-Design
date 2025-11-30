package JavaAdvanceConcepts.JavaCollectionFramework.SetInterface;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate ignored
        set.add("Cherry");

        System.out.println(set);
    }
}

