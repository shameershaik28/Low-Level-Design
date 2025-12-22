package LLD1.JavaAdvanceConcepts.Logger;

public interface Logger {
    void log(LogLevel level, String message);
    void setLogFile(String filePath);
    void flush();
    void close();
}

