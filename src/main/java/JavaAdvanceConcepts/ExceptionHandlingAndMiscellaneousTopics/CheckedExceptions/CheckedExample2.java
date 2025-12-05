package JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.CheckedExceptions;

import java.io.*;

public class CheckedExample2 {

    public static void main(String[] args) throws FileNotFoundException {
        //Using Throws Keyword
        FileReader fr = new FileReader("data.txt"); // still must be handled
    }
}

