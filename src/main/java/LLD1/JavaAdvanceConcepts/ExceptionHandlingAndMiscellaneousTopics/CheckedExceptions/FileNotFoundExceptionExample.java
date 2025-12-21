package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.CheckedExceptions;

import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
     //Using Try-Catch

        try {
            FileReader fr = new FileReader("myfile.txt"); // may throw exception
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
