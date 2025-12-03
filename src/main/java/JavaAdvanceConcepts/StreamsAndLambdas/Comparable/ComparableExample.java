package JavaAdvanceConcepts.StreamsAndLambdas.Comparable;

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
       //Student
        List<Student> list = new ArrayList<>();

        list.add(new Student(24, "Alice"));
        list.add(new Student(19, "Bob"));
        list.add(new Student(22, "John"));

        Collections.sort(list);  // uses compareTo()

        System.out.println(list);

         // Word
        List<Word> list2 = Arrays.asList(
                new Word("hi"),
                new Word("hello"),
                new Word("a")
        );

        Collections.sort(list2);
        System.out.println(list2);
    }
}

