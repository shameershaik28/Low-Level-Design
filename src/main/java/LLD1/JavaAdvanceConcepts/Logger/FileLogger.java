package LLD1.JavaAdvanceConcepts.Logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileLogger implements Logger {

    private PrintWriter writer;
    private String filePath;

    @Override
    public void setLogFile(String filePath) {
        this.filePath = filePath;
        try {
            this.writer = new PrintWriter(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Unable to open log file");
        }
    }

    @Override
    public void log(LogLevel level, String message) {
        if (writer == null) {
            throw new IllegalStateException("Logger not initialized");
        }
        writer.println(level + ": " + message);
    }

    @Override
    public void flush() {
        writer.flush();
    }

    @Override
    public void close() {
        writer.close();
    }
}

