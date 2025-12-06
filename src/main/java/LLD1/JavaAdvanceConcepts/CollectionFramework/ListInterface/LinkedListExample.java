package LLD1.JavaAdvanceConcepts.CollectionFramework.ListInterface;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
     // LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");


        //use it with LinkedList to get extra features like this
//        list.addFirst("Start");
//        list.addLast("End");

        System.out.println("LinkedList: " + list);

//        list.removeFirst();
//        list.removeLast();

        System.out.println("After removals: " + list);
    }
}

