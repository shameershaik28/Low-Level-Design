package LLD1.JavaAdvanceConcepts.Logger;

public class LoggerDemo {
    public static void main(String[] args) {

        Logger logger = new FileLogger();
        logger.setLogFile("app.log");

        logger.log(LogLevel.INFO, "Application started");
        logger.log(LogLevel.DEBUG, "Debugging data loaded");
        logger.log(LogLevel.ERROR, "Something went wrong");

        logger.flush();
        logger.close();
    }
}

