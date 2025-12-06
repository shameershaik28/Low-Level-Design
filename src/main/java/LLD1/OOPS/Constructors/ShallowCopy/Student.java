package LLD1.OOPS.Constructors.ShallowCopy;

public class Student {
    String name;
    int age;
    Address address;  // non-primitive

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Shallow copy constructor
    public Student(Student other) {
        this.name = other.name;      // primitive/immutable → copied
        this.age = other.age;        // primitive → copied
        this.address = other.address; // SAME address object → SHARED
    }
}
