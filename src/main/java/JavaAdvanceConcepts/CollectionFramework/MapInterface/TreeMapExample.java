package JavaAdvanceConcepts.CollectionFramework.MapInterface;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        map.put(30, "Orange");
        map.put(10, "Apple");
        map.put(20, "Banana");

        System.out.println(map);   // sorted by key
    }
}

