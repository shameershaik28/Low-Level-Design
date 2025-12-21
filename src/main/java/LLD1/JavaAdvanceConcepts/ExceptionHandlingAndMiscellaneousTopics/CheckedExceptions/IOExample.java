package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.CheckedExceptions;

import java.io.*;

public class IOExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");
        } catch (IOException e) {
            System.out.println("IO problem occurred");
        }
    }
}

