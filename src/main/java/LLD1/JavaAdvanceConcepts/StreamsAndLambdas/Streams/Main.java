package LLD1.JavaAdvanceConcepts.StreamsAndLambdas.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(22, "Alice"),
                new Student(18, "Bob"),
                new Student(24, "John")
        );

        //Stream on Objects
        // Get names of students above age 20
        List<String> names = students.stream()
                .filter(s -> s.age > 20)
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println("Names: " + names);
    }
}
