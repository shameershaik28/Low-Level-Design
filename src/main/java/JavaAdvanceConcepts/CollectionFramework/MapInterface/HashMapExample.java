package JavaAdvanceConcepts.CollectionFramework.MapInterface;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(2, "Mango");   // key 2 updated

        System.out.println(map);

        System.out.println("Key 1: " + map.get(1));
        System.out.println("Contains key 3? " + map.containsKey(3));
    }
}

