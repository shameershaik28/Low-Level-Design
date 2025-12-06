package LLD1.JavaAdvanceConcepts.StreamsAndLambdas.Streams;

import java.util.*;
import java.util.stream.*;

public class StreamsExample {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        // 1. FILTER → keep even numbers
        List<Integer> evens = nums.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Evens: " + evens);

        // 2. MAP → multiply each number by 2
        List<Integer> doubled = nums.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println("Doubled: " + doubled);

        // 3. SORT → descending order
        List<Integer> sortedDesc = nums.stream()
                .sorted((a, b) -> b - a)
                .toList();

        System.out.println("Sorted Desc: " + sortedDesc);

        // 4. REDUCE → sum all numbers
        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);

        // 5. COUNT → count how many even numbers
        long evenCount = nums.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Even Count: " + evenCount);

        // 6. forEach → print elements
        System.out.print("Print using forEach: ");
        nums.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 7. DISTINCT → remove duplicates
        List<Integer> unique = Arrays.asList(1,2,2,3,3,4)
                .stream()
                .distinct()
                .toList();

        System.out.println("Distinct: " + unique);

        // 8. LIMIT → take first 3 numbers
        List<Integer> limited = nums.stream()
                .limit(3)
                .toList();

        System.out.println("Limit 3: " + limited);
    }
}

