package LLD1.JavaAdvanceConcepts.CollectionFramework.Properties;

import java.util.Properties;

import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {

        Properties props = new Properties();

        // Add properties
        props.setProperty("username", "admin");
        props.setProperty("password", "1234");
        props.setProperty("timeout", "30");

        // Read before clear
        System.out.println("Before clear:");
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("timeout"));

        // 4️⃣ remove(String)
        props.remove("password");

        // 5️⃣ Try reading removed key
        System.out.println("Password after remove: " +
                props.getProperty("password")); // null

        // 🔴 Clear all properties
        props.clear();

        // Read after clear
        System.out.println("After clear:");
        System.out.println(props.getProperty("username")); // null
        System.out.println(props.getProperty("timeout"));  // null
    }
}


