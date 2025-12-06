package LLD1.JavaAdvanceConcepts.CollectionFramework.QueueInterfaceExamples;

import java.util.*;

public class LinkedListQueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue);     // [A, B, C]

        System.out.println(queue.poll());  // removes A
        System.out.println(queue.poll());  // removes B

        System.out.println(queue);     // [C]
    }
}

