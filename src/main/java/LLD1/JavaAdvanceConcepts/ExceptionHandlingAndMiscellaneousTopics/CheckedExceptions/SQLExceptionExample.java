package LLD1.JavaAdvanceConcepts.ExceptionHandlingAndMiscellaneousTopics.CheckedExceptions;

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/test", "root", "1234");
        } catch (SQLException e) {
            System.out.println("Database error");
        }
    }
}

