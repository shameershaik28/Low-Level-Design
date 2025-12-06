package LLD1.JavaAdvanceConcepts.CollectionFramework.QueueInterfaceExamples;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq.poll());   // 10
        System.out.println(pq.poll());   // 20
        System.out.println(pq);
        System.out.println(pq.poll());   // 30
        System.out.println(pq);
    }
}

