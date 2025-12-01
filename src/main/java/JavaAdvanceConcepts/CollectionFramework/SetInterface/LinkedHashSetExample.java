package JavaAdvanceConcepts.CollectionFramework.SetInterface;

import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A"); // ignored

        System.out.println(set);
    }
}

