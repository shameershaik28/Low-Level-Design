package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.CheckedExceptions;

import java.io.*;

public class HandlingCheckedExceptionsExample {

    // Option 1: Using throws keyword
    // public static void main(String[] args) throws FileNotFoundException {
    //     FileReader fr = new FileReader("myfile.txt");
    // }



    // Option 2: Using try-catch (recommended)
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("myfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}

