package LLD2.DesignPatterns.Registry;

import java.util.HashMap;
import java.util.Map;

class StudentRegistry {

    private static Map<String, Student> registry = new HashMap<>();

    // register prototype
    public static void register(String key, Student student) {
        registry.put(key, student);
    }

    // get clone from registry
    public static Student get(String key) {
        return (Student) registry.get(key).clone();
    }
}

