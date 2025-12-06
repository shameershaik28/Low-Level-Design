package LLD1.OOPS.Constructors.ConstructorChaining;

class Person {
    String name;
    int age;

    // Parent default constructor
    Person() {
        this("Unknown", 0); // calling another constructor in the same class
        System.out.println("Parent: Default constructor called");
    }

    // Parent parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parent: Parameterized constructor called");
    }
}
