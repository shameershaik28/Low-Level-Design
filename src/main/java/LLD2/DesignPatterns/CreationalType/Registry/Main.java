package LLD2.DesignPatterns.CreationalType.Registry;

public class Main {
    public static void main(String[] args) {

        // create base objects
        Student csStudent = new Student("CS Student", 20);
        Student itStudent = new Student("IT Student", 21);

        // register them
        StudentRegistry.register("CS", csStudent);
        StudentRegistry.register("IT", itStudent);

        // get copies
        Student s1 = StudentRegistry.get("CS");
        Student s2 = StudentRegistry.get("CS");
        Student s3 = StudentRegistry.get("IT");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

