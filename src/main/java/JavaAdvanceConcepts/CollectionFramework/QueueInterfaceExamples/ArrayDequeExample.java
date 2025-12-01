package JavaAdvanceConcepts.CollectionFramework.QueueInterfaceExamples;

import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {

        Queue<String> deque = new ArrayDeque<>();

        deque.add("A");
        deque.add("B");
        deque.add("C");
        deque.add("C");

        System.out.println(deque.poll());   // removes A
        System.out.println(deque.poll());
        System.out.println(deque);// removes B
    }
}

