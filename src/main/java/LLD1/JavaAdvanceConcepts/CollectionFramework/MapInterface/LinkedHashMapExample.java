package LLD1.JavaAdvanceConcepts.CollectionFramework.MapInterface;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);
        map.put("D", 400);
        map.put("D", 300);

        System.out.println(map);
    }
}

